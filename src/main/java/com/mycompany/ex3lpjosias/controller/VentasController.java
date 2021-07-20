/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3lpjosias.controller;

import com.google.gson.Gson;
import com.mycompany.ex3lpjosias.Dao.ClienteDao;
import com.mycompany.ex3lpjosias.Dao.SucursalDao;
import com.mycompany.ex3lpjosias.Dao.VentaDao;
import com.mycompany.ex3lpjosias.DaoImp.ClientesDaoImp;
import com.mycompany.ex3lpjosias.DaoImp.SucursalesDaoImp;
import com.mycompany.ex3lpjosias.DaoImp.VentasDaoImp;
import com.mycompany.ex3lpjosias.Model.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nick Meza
 */
@WebServlet(name = "VentasController", urlPatterns = {"/vc"})
public class VentasController extends HttpServlet {
    private Gson gson = new Gson();
    private VentaDao vd = new VentasDaoImp();
    private ClienteDao cd = new ClientesDaoImp();
    private SucursalDao sd = new SucursalesDaoImp();
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
        PrintWriter out = response.getWriter();
        int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
        switch (opcion) {
        case 1://todos los roles
                out.println(gson.toJson(vd.readAll()));
                break;
        case 2://todos los roles
                out.println(gson.toJson(cd.readAll()));
                break;
        case 3://todos los roles
                out.println(gson.toJson(sd.readAll()));
                break;
        case 4://todos los roles
                out.println(gson.toJson(vd.crate(new Venta(0, request.getParameter("fecha"), request.getParameter("tipodoc"), Integer.parseInt(request.getParameter("idsucursal")), Integer.parseInt(request.getParameter("idcliente"))))));
                break;
        case 5://todos los roles
                out.println(gson.toJson(vd.delete(Integer.parseInt(request.getParameter("idventa")))));
                break;
           
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
