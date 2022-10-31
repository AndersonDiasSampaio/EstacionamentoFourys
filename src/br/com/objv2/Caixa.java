package br.com.objv2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Caixa {
	Double caixa=0d;
	Double valorDoMinuto=0.416666667;

	public Caixa(Double a) {
		this.valorDoMinuto=a;
	}

	public Double getCaixa() {
		return caixa;
	}

	public void setCaixa(LocalDateTime localDateTime8, LocalDateTime LocalDateTime9) {
		long period1 = ChronoUnit.SECONDS.between(localDateTime8, LocalDateTime9);
		this.caixa=this.caixa + (double) Math.round(this.valorDoMinuto*period1);
	}
	

}
