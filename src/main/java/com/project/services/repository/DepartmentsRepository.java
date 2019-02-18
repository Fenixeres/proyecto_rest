package com.project.services.dummy.repository;

import com.project.services.dummy.entity.Departamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositoryDepartments")
public interface DepartmentsRepository extends CrudRepository<Departamento, String> {

    @Async
    @Query("SELECT dep FROM Departamento dep where dep.idDepartamento LIKE CONCAT(:idDepartamento,'%')")
    List<Departamento> findByIdDepartamento(@Param("idDepartamento") String idDepartamento);

    @Async
    List<Departamento> findAll();

}
