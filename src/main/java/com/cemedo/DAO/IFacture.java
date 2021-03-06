package com.cemedo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cemedo.data.Facturepatient;

@CrossOrigin("*")
@RepositoryRestResource
public interface IFacture extends JpaRepository<Facturepatient, Integer>{

}
