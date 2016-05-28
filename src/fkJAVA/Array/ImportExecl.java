package fkJAVA.Array;
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
public class ImportExecl
{
	private int totalRows = 0;
	private int totalCells = 0;
	private String errorInfo;
	public ImportExecl()
	{
	}
	public int getTotalRows()
	{
		return totalRows;
	}
	public int getTotalCells()
	{
		return totalCells;
	}
	public String getErrorInfo()
	{
		return errorInfo;
	}
	public boolean validateExcel(String filePath)
	{
		if (filePath == null || !(WDWUtil.isExcel2003(filePath) || WDWUtil.isExcel2007(filePath)))
		{
			errorInfo = "�ļ�������excel��ʽ";
			return false;
		}
		/** ����ļ��Ƿ���� */
		File file = new File(filePath);
		if (file == null || !file.exists())
		{
			errorInfo = "�ļ�������";
		return false;
		}
		return true;
	}
	public List<List<String>> read(String filePath)
	{
		List<List<String>> dataLst = new ArrayList<List<String>>();
		InputStream is = null;
		try
		{
			if (!validateExcel(filePath))
			{
				System.out.println(errorInfo);
				return null;
			}
			File file = new File("");
			boolean isExcel2003 = true;
			if (WDWUtil.isExcel2007(filePath))
			{
				isExcel2003 = false;
			}
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
	public List<List<String>> read(InputStream inputStream, boolean isExcel2003)
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
	private List<List<String>> read(Workbook wb)
	{
		List<List<String>> dataLst = new ArrayList<List<String>>();
		/** �õ���һ��shell */
		Sheet sheet = wb.getSheetAt(0);
		/** �õ�Excel������ */
		this.totalRows = sheet.getPhysicalNumberOfRows();
		/** �õ�Excel������ */
		if (this.totalRows >= 1 && sheet.getRow(0) != null)
		{
			this.totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		}
		/** ѭ��Excel���� */
		for (int r = 0; r < this.totalRows; r++)
		{
			Row row = sheet.getRow(r);
			if (row == null)
			{
				continue;
			}
			List<String> rowLst = new ArrayList<String>();
			/** ѭ��Excel���� */
			for (int c = 0; c < this.getTotalCells(); c++)
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
	public static void main(String[] args) throws Exception
	{
		ImportExecl poi = new ImportExecl();
		List<List<String>> list = poi.read("D:/�ɼ���.xlsx");
		System.out.println(">>>>"+poi.getTotalCells()+poi.getTotalRows());
		if (list != null)
		{
			for (int i = 0; i < list.size(); i++)
			{
				System.out.print("��" + (i) + "��");
				List<String> cellList = list.get(i);
				for (int j = 0; j < cellList.size(); j++)
				{
					// System.out.print("    ��" + (j + 1) + "��ֵ��");
					System.out.print("    " + cellList.get(j));
				}
				System.out.println();
			}
		}
	}
}
class WDWUtil
{
	public static boolean isExcel2003(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xls)$");
	}
	public static boolean isExcel2007(String filePath)
	{
		return filePath.matches("^.+\\.(?i)(xlsx)$");
	}
}
