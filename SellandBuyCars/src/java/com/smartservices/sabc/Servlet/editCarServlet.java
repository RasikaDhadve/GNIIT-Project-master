/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.Servlet;

import com.smartservices.sabc.DAO.CarDAO;
import com.smartservices.sabc.DAOImpl.CarDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "editCarServlet", urlPatterns = {"/editCarServlet"})
public class editCarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             
             int carid;
           
            String action = request.getParameter("action");
            
            carid = Integer.parseInt(request.getParameter("carid"));
            CarDAO CarDAO = new CarDAOImpl();
            int count = 0;
            if(action.equals("Save Changes")){
               String CarModel;
               String CarName;
               String CarType;
               int CarAmount;
               CarModel = request.getParameter("model");
               CarName = request.getParameter("name");
               CarType = request.getParameter("type");
               CarAmount=Integer.parseInt(request.getParameter("amount"));
                
                count = CarDAO.updateCar(carid,new Carinfo(model,name,tye,amount));
                }
            else if(action.equals("Delete")){
                count = CarDAO.deleteCar(carid);
            }
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("carlist.view");
            }
            else{
                rd = request.getRequestDispatcher("editCar.jsp?carid="+carid);
            }
            rd.include(request,response);
        }
    }
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
