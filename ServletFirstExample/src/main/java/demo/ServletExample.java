/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
public class ServletExample implements Servlet{
    ServletConfig config = null;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
        System.out.println("My First Servlet is running");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        // setting content type
        res.setContentType("text/html"); // response ko object
        // to show content in web page
       // res.getWriter().print("");
        //or we can create PrinterWriter class object 
        PrintWriter pw =res.getWriter();
        pw.print("<html><head>");
        pw.print("<title>My first servlet program</title>");
        pw.print("</head></body>");
        pw.print("<h1>DAV SIXTH SEM | SERVLET SESSION </h1>");
        pw.print("</body></html>");
        
        
    }

    @Override
    public String getServletInfo() {
        return "First Servlet | CopyRight @2024 | DAV";
        
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is closing");
        
    }
    
}
