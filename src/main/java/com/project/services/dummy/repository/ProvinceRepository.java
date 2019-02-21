package com.project.services.dummy.repository;

import com.project.services.dummy.entity.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositoryProvince")
public interface ProvinceRepository extends CrudRepository<Provincia, String> {

    @Async
    @Query("SELECT prov FROM Departamento dev JOIN Provincia prov ON dev.idDepartamento = prov.idDepartamento where prov.idDepartamento LIKE CONCAT(:idDepartamento,'%')")
    List<Provincia> findByIdDepartamento(@Param("idDepartamento") String idDepartamento);
}
