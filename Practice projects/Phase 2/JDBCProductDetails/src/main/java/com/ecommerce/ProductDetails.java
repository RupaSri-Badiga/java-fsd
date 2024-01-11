package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/product-details")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int productId = Integer.parseInt(request.getParameter("ID"));

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/ecommercedb";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Query the database for product details
            String query = "SELECT * FROM eproduct WHERE ID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Product found, display details
                out.println("<h2>Product Details</h2>");
                out.println("<p>ID: " + resultSet.getInt("ID") + "</p>");
                out.println("<p>Name: " + resultSet.getString("name") + "</p>");
                out.println("<p>Price: $" + resultSet.getDouble("price") + "</p>");
                out.println("<p>Date_Added: " + resultSet.getString("date_added") + "</p>");
            } else {
                // Product not found
                out.println("<h2>Product not found</h2>");
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<h2>Error retrieving product details: " + e.getMessage() + "</h2>");
        }
    }

	

}
