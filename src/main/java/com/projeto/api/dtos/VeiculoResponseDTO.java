package com.projeto.api.dtos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projeto.api.entities.User;
import com.projeto.api.entities.Veiculo;

public class VeiculoResponseDTO {

    private String marca;
    private String modelo;
    private String ano;
    @JsonIgnoreProperties("veiculos")
    private User user;
    private String diaDorodizio;
    private Boolean rodizioAtivo;

    VeiculoResponseDTO() {}

    public VeiculoResponseDTO(Veiculo veiculo) {
      this.marca = veiculo.getMarca();
      this.modelo = veiculo.getModelo();
      this.ano = Integer.toString(veiculo.getAno());
      this.user = veiculo.getUser();
      this.diaDorodizio = this.QualODiaDoRodizio();
      this.rodizioAtivo = this.PodeRodar();
    		
    }
    
    private String QualODiaDoRodizio() {
    	String lastNumberYear = this.ano.substring(this.ano.length() - 1);
    	int lastIntYear = Integer.parseInt(lastNumberYear);  
    	if (lastIntYear == 1 || lastIntYear == 0) {
    		return "segunda-feira";
    	} else if (lastIntYear == 2 || lastIntYear == 3) {
    		return "terça-feira";
    	} else if (lastIntYear == 4 || lastIntYear == 5) {
    		return "quarta-feira";
    	} else if (lastIntYear == 6 || lastIntYear == 7) {
    		return "quinta-feira";
    	} else if (lastIntYear == 8 || lastIntYear == 9) {
    		return "sexta-feira";
    	} else {
    		return "não há dia da semana";
    	}
    }
    
    private Boolean PodeRodar() {
    	return this.QualODiaDoRodizio().equals(this.diaDaSemana());
    }
    
    public String diaDaSemana() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);
        return todaysdate;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDiaDorodizio() {
		return diaDorodizio;
	}

	public void setDiaDorodizio(String diaDorodizio) {
		this.diaDorodizio = diaDorodizio;
	}

	public Boolean getRodizioAtivo() {
		return rodizioAtivo;
	}

	public void setRodizioAtivo(Boolean rodizioAtivo) {
		this.rodizioAtivo = rodizioAtivo;
	}

}

