package com.rupa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form data
        String productName = request.getParameter("pname");
        String productColor =request.getParameter("pcolor");
        double productPrice = Double.parseDouble(request.getParameter("price"));

        // Create a Product object
        Product product = new Product(productName,productColor, productPrice);

        // Store the product in the session
        HttpSession session = request.getSession();
        session.setAttribute("product", product);

        // Redirect to the second JSP
        response.sendRedirect("displayProduct.jsp");
    }
}