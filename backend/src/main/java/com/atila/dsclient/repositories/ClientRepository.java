package com.atila.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atila.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
