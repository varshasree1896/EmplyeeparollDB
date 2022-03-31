package com.blz.employeepayrollservice;

import java.sql.*;

public class EmployeePayrollDBService {


    public static void main(String[] args) throws SQLException {
        //Connect with database
        String jdbcUrl="jdbc:mysql://localhost:3306/Payroll_services?useSSL=false";
        String userName="root";
        String password="root";
        Connection con;
        Statement statement ;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            con= DriverManager.getConnection(jdbcUrl,userName,password);
            statement= con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
            while(resultSet.next()){
                int  customerId = resultSet.getInt("id");
                String customerName=resultSet.getString("name");
                int salary=resultSet.getInt("salary");
                System.out.print(customerId+" . ");
                System.out.print(customerName+ " = " );
                System.out.print(salary+" , ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    }
    }