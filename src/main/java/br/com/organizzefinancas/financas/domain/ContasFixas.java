package br.com.organizzefinancas.financas.domain;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class ContasFixas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idOContasFixas", updatable = false, unique = true, nullable = false)	
	private UUID idContasFixas;
	
	//GASTOS FIXOS 
	private BigDecimal aluguel;
	private BigDecimal luz;
	private BigDecimal agua;
	private BigDecimal internet;
	//GASTOS PERSONALIZADOS
}
