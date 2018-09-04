package Expressoes;

import java.util.Map;

public class ExpressaoAtomica implements ExpressaoLogica{
	private String variavel;
	
	public ExpressaoAtomica(String variavel) {
		this.variavel = variavel;
	}
	
	public String getVariavel() {
		return variavel;
	}
	
	public String toString() {
		return variavel;
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return valoresVariaveis.get(variavel);
	}
}
