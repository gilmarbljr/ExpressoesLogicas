package Expressoes;

import java.util.Map;

public class ExpressaoAnd extends ExpressaoBinaria {

	public ExpressaoAnd(ExpressaoLogica expressao1, ExpressaoLogica expressao2) {
		super(expressao1, expressao2);
	}

	public String toString() {
		return "(" + getExpressao1() + "^" + getExpressao2() + ")";
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return getExpressao1().eval(valoresVariaveis) && getExpressao2().eval(valoresVariaveis);
	}

}
