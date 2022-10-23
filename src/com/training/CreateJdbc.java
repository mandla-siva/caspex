package com.training;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateJdbc {
	public Connection con = null;
	XSSFWorkbook wb=null;
	XSSFSheet sh=null;
	int rwCount,clCount=0;
	
	CreateJdbc() throws IOException{
		wb=new XSSFWorkbook("C:\\Users\\Mandla Sivasankar\\Documents\\siva.xlsx");
		sh=wb.getSheet("data");
	}
	public void createConnectionWithMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sivashankar", "root", "Siva1234@");
			System.out.println("connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int getRowCount() {
		rwCount=sh.getLastRowNum();
		return rwCount;
	}
	public int getColumnCount(int rowInd) {
		clCount=sh.getRow(rowInd).getLastCellNum();
		return clCount;
	}
	public String getValue(int rwInd,int celInd) throws IOException {
		sh=wb.getSheet("data");
		return sh.getRow(rwInd).getCell(celInd).getStringCellValue();
	}
	public void save(int eid, String ename, float esalary, double eallowancies) throws SQLException {
		try {
			PreparedStatement ps = con.prepareStatement("insert into guru values (?,?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setFloat(3, esalary);
			ps.setDouble(4, eallowancies);
			ps.execute();
//			con.close();

		} catch (Exception e) {
			e.printStackTrace();
//			con.close();
		}
	}

	public static void main(String[] args) throws SQLException, IOException {
		CreateJdbc obj = new CreateJdbc();
		obj.createConnectionWithMySQL();
		int rwCnt=obj.getRowCount();
		ArrayList<String> ls=null;
		for(int i=0;i<rwCnt;i++) {
			int colCount=obj.getColumnCount(i);
			for(int j=0;j<colCount;j++) {
				ls.add(obj.getValue(i, j));
			}
			obj.save(Integer.parseInt(ls.get(0)), ls.get(1), Float.parseFloat(ls.get(2)), Double.parseDouble(ls.get(3)));
			ls.clear();
		}
		obj.con.close();
//		obj.save(14, "rama", 8738, 567.89);

	}

}
