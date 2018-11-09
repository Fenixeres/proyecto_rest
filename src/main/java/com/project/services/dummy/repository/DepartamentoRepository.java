package com.project.services.dummy.repository;

import com.project.services.dummy.entity.Departamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorio")
public interface DepartamentoRepository extends CrudRepository<Departamento, String> {

    //    @Query (value = "SELECT dep FROM Departamento dep WHERE dep.nombDepa = :NombDepa",nativeQuery = true)
    //  @Query("SELECT dep FROM Departamento dep where dep.nombDepa LIKE CONCAT('%',:nombDepa,'%')")
    @Async
    @Query("SELECT dep FROM Departamento dep where dep.nombDepa LIKE CONCAT(:nombDepa,'%')")
    List<Departamento> findByNombDepa(@Param("nombDepa") String nombDepa);

}
