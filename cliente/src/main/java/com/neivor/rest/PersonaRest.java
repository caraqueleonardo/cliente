package com.neivor.rest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neivor.dao.PersonaDAO;
import com.neivor.model.Persona;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class PersonaRest {
	
	@Autowired 
	private PersonaDAO personaDAO;
	
	@PostMapping("/home/generar")
	public void guardar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	@GetMapping("/obtener")
	public List<Persona> listar(){
		return personaDAO.findAll();
	}
	
	@GetMapping("/buscar/{name}")
	public ResponseEntity<Persona> buscar (@PathVariable("name") UUID name ){
		Optional<Persona> optionalProduct= personaDAO.findById(name);
			if(optionalProduct.isPresent()) {
				return ResponseEntity.ok(optionalProduct.get());
			}else {
				return ResponseEntity.noContent().build();
			}
	}	
	
	@DeleteMapping ("/delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") UUID id){
		personaDAO.deleteById(id);
		return ResponseEntity.ok(!(personaDAO.findById(id)!=null));
		
	}
	
	@PatchMapping("/actualizar")
	public void actualizar (@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
}
