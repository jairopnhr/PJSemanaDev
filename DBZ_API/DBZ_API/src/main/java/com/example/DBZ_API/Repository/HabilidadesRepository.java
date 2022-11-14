package com.example.DBZ_API.Repository;

import com.example.DBZ_API.Model.Habilidades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends CrudRepository<Habilidades,Long> {
}
