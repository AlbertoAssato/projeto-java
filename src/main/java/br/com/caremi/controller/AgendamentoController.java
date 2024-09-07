package br.com.caremi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("agendamento")
public class AgendamentoController {

    @GetMapping("exame")
    public String exame(){
        return "agendamento/exame";
    }

//    //teste
//    @PostMapping("exame")
//    public String cadastrarExame(String nome, Model model ){
//        model.addAttribute("mensagem", nome + "seu exame foi agendado!");
//        return "agendamento/exame";
//    }



}
