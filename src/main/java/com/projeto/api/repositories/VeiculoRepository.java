package com.projeto.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.api.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}