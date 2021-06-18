package com.projeto.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.dtos.VeiculoRequestDTO;
import com.projeto.api.dtos.VeiculoResponseDTO;
import com.projeto.api.entities.Veiculo;
import com.projeto.api.repositories.VeiculoRepository;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public ResponseEntity<List<VeiculoResponseDTO>> getAllUsers() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		List<VeiculoResponseDTO> responseVeiculo = new ArrayList<>();
		for (Veiculo veiculo : veiculos) {
			responseVeiculo.add(new VeiculoResponseDTO(veiculo));
		}
	    return ResponseEntity.ok(responseVeiculo);
	}

	@PostMapping
	public ResponseEntity<VeiculoResponseDTO> newVeiculo(@RequestBody VeiculoRequestDTO newVeiculo) {
	    Veiculo veiculo = veiculoRepository.save(newVeiculo.getVeiculo());
	    return ResponseEntity.ok(new VeiculoResponseDTO(veiculo));
	}
}
