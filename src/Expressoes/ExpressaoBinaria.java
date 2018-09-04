package Expressoes;

public abstract class ExpressaoBinaria implements ExpressaoLogica{
	private ExpressaoLogica expressao1;
	private ExpressaoLogica expressao2;
	
	public ExpressaoBinaria(ExpressaoLogica expressao1, ExpressaoLogica expressao2) {
		setExpressao1(expressao1);
		setExpressao2(expressao2);
	}
	
	public ExpressaoLogica getExpressao1() {
		return expressao1;
	}
	public void setExpressao1(ExpressaoLogica expressao1) {
		this.expressao1 = expressao1;
	}
	public ExpressaoLogica getExpressao2() {
		return expressao2;
	}
	public void setExpressao2(ExpressaoLogica expressao2) {
		this.expressao2 = expressao2;
	}
	
	
}
