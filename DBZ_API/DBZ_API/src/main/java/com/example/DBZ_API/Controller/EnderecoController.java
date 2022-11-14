package com.example.DBZ_API.Controller;

import com.example.DBZ_API.Model.Endereco;
import com.example.DBZ_API.Repository.EnderecoRepository;
import com.example.DBZ_API.Repository.GuerreiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    private EnderecoRepository repository;

    @Autowired
    public EnderecoController(EnderecoRepository Repository)
    {
        this.repository = Repository;
    }


}
