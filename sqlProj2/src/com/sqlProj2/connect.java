package com.sqlProj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connect {
	
	
	public String connecting(String text) {
		String ourText = "";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?serverTimezone=UTC","root","");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM finalproject.masterscplist Where Title like '%"+ text+"%'");
			
			ourText +="<style>\n" + 
					"#customers {\n" + 
					"  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n" + 
					"  border-collapse: collapse;\n" + 
					"  width: 100%;\n" + 
					"}\n" + 
					"\n" + 
					"#customers td, #customers th {\n" + 
					"  border: 1px solid #ddd;\n" + 
					"  padding: 8px;\n" + 
					"}\n" + 
					"\n" + 
					"#customers tr:nth-child(even){background-color: #f2f2f2;}\n" + 
					"\n" + 
					"#customers tr:hover {background-color: #ddd;}\n" + 
					"\n" + 
					"#customers th {\n" + 
					"  padding-top: 12px;\n" + 
					"  padding-bottom: 12px;\n" + 
					"  text-align: left;\n" + 
					"  background-color: #d63a3a;\n" + 
					"  color: white;\n" + 
					"}\n" + 
					"</style>"
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ "<table id=\"customers\">\n" + 
					"  <tr>\n" + 
					"    <th>Title</th>\n" + 
					"    <th>rating</th>\n" + 
					"    <th>Type</th>\n" + 
					"  </tr>";
			
			while(rs.next())
			{
				
				
				ourText +="<tr><td>";
				ourText +=rs.getString("Title");
				ourText +="</td>";
				ourText +="<td>";
				ourText +=rs.getString("rating");
				ourText +="</td>";
				
				ourText +="<td>";
				ourText +=rs.getString("Type");
				ourText +="</td>";
				ourText +="</tr>";
			
			}
				
			//out.print("</table>"); 
			
			
			
		}catch(Exception p) {
			System.out.println("error 1");
		}
		
		//out.print("</table>");
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?serverTimezone=UTC","root","");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM finalproject.ikea_names Where name like '%"+text+"%'\n" + 
					"union\n" + 
					"SELECT * FROM finalproject.ikea_names Where description like '%"+ text+ "%';");
			
		//	out.print("<table>\n" + 
		//			"  <tr>\n" + 
		//			"    <th>names</th>\n" + 
		//			"    <th>description</th>\n" + 
		//			"    <th>Column_3</th>\n" + 
		//			"  </tr>");
			
			while(rs.next())
			{
				
				
				ourText +="<tr><td>";
				ourText +=rs.getString("name");
				ourText +="</td>";
				ourText +="<td>";
				ourText +=rs.getString("description");
				ourText +="</td>";
				
				ourText +="<td>";
				ourText +=rs.getString("Column_3");
				ourText +="</td>";
				ourText +="</tr>";
			
			}
				
			//out.print("</table>"); 
			
			
			
		}catch(Exception p) {
			System.out.println("error 2");
		}
		
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject?serverTimezone=UTC","root","");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM finalproject.bearbase Where 'Character' like '%"+text+"%'\n" + 
					"union\n" + 
					"SELECT * FROM finalproject.bearbase Where Origin like '%"+text+"%'\n" + 
					"union\n" + 
					"SELECT * FROM finalproject.bearbase Where Notes like '%"+text+"%';");
			
			//out.print("<table>\n" + 
			//		"  <tr>\n" + 
			//		"    <th>character</th>\n" + 
			//		"    <th>origin</th>\n" + 
			//		"    <th>creator</th>\n" + 
			//		"  </tr>");
			
			while(rs.next())
			{
				
				
				ourText +="<tr><td>";
				ourText +=rs.getString("Character");
				ourText +="</td>";
				ourText +="<td>";
				ourText +=rs.getString("Origin");
				ourText +="</td>";
				
				ourText +="<td>";
				ourText +=rs.getString("Creator");
				ourText +="</td>";
				ourText +="</tr>";
			
			}
				
			ourText +="</table>"; 
			
			
			
		}catch(Exception p) {
			System.out.println("error 3");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return ourText;
	}

}
