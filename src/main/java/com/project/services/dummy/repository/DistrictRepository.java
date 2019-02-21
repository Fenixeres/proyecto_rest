package com.project.services.dummy.repository;

import com.project.services.dummy.entity.Distrito;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositoryDistrict")
public interface DistrictRepository extends CrudRepository<Distrito, String> {
    @Async
    @Query("SELECT dist FROM Provincia prov JOIN Distrito dist ON prov.idProvincia = dist.idProvincia where dist.idProvincia LIKE CONCAT(:idProvincia,'%')")
    List<Distrito> findByIdProvincia(@Param("idProvincia") String idProvincia);
}
