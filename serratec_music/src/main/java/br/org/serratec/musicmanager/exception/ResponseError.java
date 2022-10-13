package br.org.serratec.musicmanager.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ResponseError {

	private LocalDateTime horaErro;
	private List<MenssagemErro> erros;

	public LocalDateTime getHoraErro() {
		return horaErro;
	}

	public void setHoraErro(LocalDateTime horaErro) {
		this.horaErro = horaErro;
	}

	public List<MenssagemErro> getErros() {
		return erros;
	}

	public void setErros(List<MenssagemErro> erros) {
		this.erros = erros;
	}

}
