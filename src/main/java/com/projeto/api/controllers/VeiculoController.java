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
import org.springframework.web.client.RestTemplate;

import com.projeto.api.dtos.RequestFIPEDTO;
import com.projeto.api.dtos.VeiculoRequestDTO;
import com.projeto.api.dtos.VeiculoResponseDTO;
import com.projeto.api.entities.User;
import com.projeto.api.entities.Veiculo;
import com.projeto.api.repositories.UserRepository;
import com.projeto.api.repositories.VeiculoRepository;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private UserRepository userRepository;
	
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
		RequestFIPEDTO requestFIPE = this.getVeiculoFIPE(newVeiculo.getMarca(), newVeiculo.getModelo(), newVeiculo.getAno());
		User user = userRepository.findById(newVeiculo.getUserId()).get();
		Veiculo buildVeiculo = new Veiculo(requestFIPE, user);
	    Veiculo veiculo = veiculoRepository.save(buildVeiculo);
	    return ResponseEntity.ok(new VeiculoResponseDTO(veiculo));
	}
	
	private RequestFIPEDTO getVeiculoFIPE(String marca, String modelo, String anoModelo) {

	     final String uri = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/ " + modelo + " /anos/" + anoModelo;
	     RestTemplate restTemplate = new RestTemplate();
	     RequestFIPEDTO result = restTemplate.getForObject(uri, RequestFIPEDTO.class);     
	     
	     return result; 

	}
}
