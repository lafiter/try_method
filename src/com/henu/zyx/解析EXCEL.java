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

public class ����EXCEL {
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
		/** ��������ȡ�Ľ�� */
	return dataLst;
		
  }
  //��
  public static List<List<String>> read(InputStream inputStream, boolean isExcel2003)
	{
		List<List<String>> dataLst = null;
		try
		{
			/** ���ݰ汾ѡ�񴴽�Workbook�ķ�ʽ */
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
  //��wb
  private static List<List<String>> read(Workbook wb)
	{
		List<List<String>> dataLst = new ArrayList<List<String>>();
		/** �õ���һ��shell */
		Sheet sheet = wb.getSheetAt(0);
		/** �õ�Excel������ */
		int totalRows = sheet.getPhysicalNumberOfRows();
		/** �õ�Excel������ */
		int totalCells = 0;
		if (totalRows >= 1 && sheet.getRow(0) != null)
		{
			 totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		}
		/** ѭ��Excel���� */
		for (int r = 0; r < totalRows; r++)
		{
			Row row = sheet.getRow(r);
			if (row == null)
			{
				continue;
			}
			List<String> rowLst = new ArrayList<String>();
			/** ѭ��Excel���� */
			for (int c = 0; c < totalCells; c++)
			{
				Cell cell = row.getCell(c);
				String cellValue = "";
				if (null != cell)
				{
					// �������ж����ݵ�����
					switch (cell.getCellType())
					{
					case HSSFCell.CELL_TYPE_NUMERIC: // ����
						cellValue = cell.getNumericCellValue() + "";
						break;
					case HSSFCell.CELL_TYPE_STRING: // �ַ���
						cellValue = cell.getStringCellValue();
						break;
					case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
						cellValue = cell.getBooleanCellValue() + "";
						break;
					case HSSFCell.CELL_TYPE_FORMULA: // ��ʽ
						cellValue = cell.getCellFormula() + "";
						break;
					case HSSFCell.CELL_TYPE_BLANK: // ��ֵ
						cellValue = "";
						break;
					case HSSFCell.CELL_TYPE_ERROR: // ����
						cellValue = "�Ƿ��ַ�";
						break;
					default:
						cellValue = "δ֪����";
						break;
					}
				}
				rowLst.add(cellValue);
			}
			dataLst.add(rowLst);
		}
		return dataLst;
	}
  
  //��֤excel�Ϸ���
  public static boolean validateExcel(String filePath)
	{
		if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath)))
		{
			System.out.println("�ļ�������excel��ʽ");
			return false;
		}
		/** ����ļ��Ƿ���� */
		File file = new File(filePath);
		if (file == null || !file.exists())
		{
			System.out.println("�ļ�������");
		return false;
		}
		return true;
	}
  
  //��֤��ʽ
  public static boolean isExcel2003(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xls)$");
	}
	public static boolean isExcel2007(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xlsx)$");
	}
}
