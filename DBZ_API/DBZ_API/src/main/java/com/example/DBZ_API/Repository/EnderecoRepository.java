package com.example.DBZ_API.Repository;

import com.example.DBZ_API.Model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,Long> {
}
