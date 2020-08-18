package test;
import java.sql.*;
public class MysqlJdbc {
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
     // Class.forName("org.gjt.mm.mysql.Driver");
     System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/db_eshop","root","zpc123");
           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������
 
      System.out.println("Success connect Mysql server!");
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM");
                                                              //user Ϊ���������
while (rs.next()) {
        System.out.println(rs.getString("LoginName"));
      }
    }
    catch (Exception e) {
      System.out.println("get data error!");
      e.printStackTrace();
    }
  }
}