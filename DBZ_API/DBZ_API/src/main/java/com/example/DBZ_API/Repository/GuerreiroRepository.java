package com.example.DBZ_API.Repository;

import com.example.DBZ_API.Model.ModelGuerreirosZ;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuerreiroRepository extends CrudRepository<ModelGuerreirosZ , Long> {
}
