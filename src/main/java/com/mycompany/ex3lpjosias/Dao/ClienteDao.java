/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3lpjosias.Dao;

import com.mycompany.ex3lpjosias.Model.Cliente;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nick Meza
 */
public interface ClienteDao {
    List<Map<String,Object>> readAll();
}
