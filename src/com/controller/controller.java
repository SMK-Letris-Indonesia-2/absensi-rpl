/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.view.login;
import java.sql.SQLException;

/**
 *
 * @author erlan
 */
public interface controller {
    public void batal(login log) throws SQLException;
    public void simpan(login log) throws SQLException;
    public void tampil(login log) throws SQLException;
}
