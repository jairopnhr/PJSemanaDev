package com.example.DBZ_API.Controller;

import com.example.DBZ_API.Model.ModelGuerreirosZ;
import com.example.DBZ_API.Model.StatusGuerreiro;
import com.example.DBZ_API.Repository.GuerreiroRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("guerreiros")
public class GuerreiroController {
    private GuerreiroRepository repository;

    @Autowired
    public GuerreiroController(GuerreiroRepository guerreiroRepository)
    {
        this.repository = guerreiroRepository;
    }

  @GetMapping
    public ResponseEntity<?>findAll(){
        return  new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
  }
    @PostMapping
    public ResponseEntity<?>save(ModelGuerreirosZ guerreirosZ){
        return  new ResponseEntity<>(this.repository.save(guerreirosZ), HttpStatus.OK);
    }


}
