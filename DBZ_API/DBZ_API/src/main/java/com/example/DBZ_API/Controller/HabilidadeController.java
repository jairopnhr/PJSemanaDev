package com.example.DBZ_API.Controller;

import com.example.DBZ_API.Model.Endereco;
import com.example.DBZ_API.Repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("habilidade")
public class HabilidadeController {
    private HabilidadesRepository repository;

    @Autowired
    public HabilidadeController(HabilidadesRepository Repository)
    {
        this.repository = Repository;
    }


}
