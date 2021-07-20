/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3lpjosias.Dao;

import com.mycompany.ex3lpjosias.Model.Venta;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nick Meza
 */
public interface VentaDao {
    int crate(Venta p);
    int delete(int id);
    List<Map<String,Object>> readAll();
}
