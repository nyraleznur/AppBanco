package com.Banco.AppBanco.controller;

import com.Banco.AppBanco.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;

@Controller
public class ControllerCliente {


    @Autowired
    private ClienteServicio servicio;
    @GetMapping("cliente")
    public String listarclientess(Model modelo){
        modelo.addAttribute("clientes",servicio.listarclientes());
        return ("clientes");

    }


}
