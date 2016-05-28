package com.henu.zyx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class 解析EXCEL {
  public static List<List<String>> parsexcel(String url){
	  List<List<String>> dataLst = new ArrayList<List<String>>();
	  InputStream is = null;
	  try
		{
			if (!validateExcel(url))
			{
			}
			boolean isExcel2003 = true;
			if (isExcel2007(url))
			{
				isExcel2003 = false;
			}
			File file = new File(url);
			is = new FileInputStream(file);
			dataLst = read(is, isExcel2003);
			is.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (is != null)
			{
				try
				{
					is.close();
				}
				catch (IOException e)
				{
					is = null;
					e.printStackTrace();
				}
			}
		}
		/** 返回最后读取的结果 */
	return dataLst;
		
  }
  //读
  public static List<List<String>> read(InputStream inputStream, boolean isExcel2003)
	{
		List<List<String>> dataLst = null;
		try
		{
			/** 根据版本选择创建Workbook的方式 */
			Workbook wb = null;

			if (isExcel2003)
			{
				wb = new HSSFWorkbook(inputStream);
			}
			else
			{
				wb = new XSSFWorkbook(inputStream);
			}
			dataLst = read(wb);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return dataLst;
	}
  //读wb
  private static List<List<String>> read(Workbook wb)
	{
		List<List<String>> dataLst = new ArrayList<List<String>>();
		/** 得到第一个shell */
		Sheet sheet = wb.getSheetAt(0);
		/** 得到Excel的行数 */
		int totalRows = sheet.getPhysicalNumberOfRows();
		/** 得到Excel的列数 */
		int totalCells = 0;
		if (totalRows >= 1 && sheet.getRow(0) != null)
		{
			 totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		}
		/** 循环Excel的行 */
		for (int r = 0; r < totalRows; r++)
		{
			Row row = sheet.getRow(r);
			if (row == null)
			{
				continue;
			}
			List<String> rowLst = new ArrayList<String>();
			/** 循环Excel的列 */
			for (int c = 0; c < totalCells; c++)
			{
				Cell cell = row.getCell(c);
				String cellValue = "";
				if (null != cell)
				{
					// 以下是判断数据的类型
					switch (cell.getCellType())
					{
					case HSSFCell.CELL_TYPE_NUMERIC: // 数字
						cellValue = cell.getNumericCellValue() + "";
						break;
					case HSSFCell.CELL_TYPE_STRING: // 字符串
						cellValue = cell.getStringCellValue();
						break;
					case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
						cellValue = cell.getBooleanCellValue() + "";
						break;
					case HSSFCell.CELL_TYPE_FORMULA: // 公式
						cellValue = cell.getCellFormula() + "";
						break;
					case HSSFCell.CELL_TYPE_BLANK: // 空值
						cellValue = "";
						break;
					case HSSFCell.CELL_TYPE_ERROR: // 故障
						cellValue = "非法字符";
						break;
					default:
						cellValue = "未知类型";
						break;
					}
				}
				rowLst.add(cellValue);
			}
			dataLst.add(rowLst);
		}
		return dataLst;
	}
  
  //验证excel合法性
  public static boolean validateExcel(String filePath)
	{
		if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath)))
		{
			System.out.println("文件名不是excel格式");
			return false;
		}
		/** 检查文件是否存在 */
		File file = new File(filePath);
		if (file == null || !file.exists())
		{
			System.out.println("文件不存在");
		return false;
		}
		return true;
	}
  
  //验证格式
  public static boolean isExcel2003(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xls)$");
	}
	public static boolean isExcel2007(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xlsx)$");
	}
}
