package com.api.aluno.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponsavelRequestDto {
	
	private String email;
	private String telefone;
	List<AlunoResponseDto> alunos;

}