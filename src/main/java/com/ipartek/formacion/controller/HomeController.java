package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.modelo.ProductDAO;
import com.ipartek.formacion.modelo.Producto;

@WebServlet("/home")
public class HomeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final ProductDAO productoDao = new ProductDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String productName	= request.getParameter("productName");
	String maxPrice		= request.getParameter("maxPrice");
	String minPrice 	= request.getParameter("minPrice");
	String manufId		= request.getParameter("manufId");	
	
	ArrayList<Producto> productos = new ArrayList<Producto>();

	try {	    
	    
	    productos = productoDao.buscar("", 0, 0, 0);
	    

	} catch (Exception e) {
	    // TODO: handle exception

	} finally {
	    request.setAttribute("productos", productos);
	    request.getRequestDispatcher("index.jsp").forward(request, response);
	    
	}

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// Using only doGet()
	doGet(request, response);
    }

}
