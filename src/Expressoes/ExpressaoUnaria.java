package Expressoes;

public abstract class ExpressaoUnaria implements ExpressaoLogica{
	private ExpressaoLogica expressaoLogica;
	
	public ExpressaoUnaria(ExpressaoLogica expressao) {
		setExpressaoLogica(expressao);
	}

	public ExpressaoLogica getExpressaoLogica() {
		return expressaoLogica;
	}

	public void setExpressaoLogica(ExpressaoLogica expressaoLogica) {
		this.expressaoLogica = expressaoLogica;
	}
}
