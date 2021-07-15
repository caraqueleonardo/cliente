package com.neivor.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import com.neivor.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, UUID> {
  
}
