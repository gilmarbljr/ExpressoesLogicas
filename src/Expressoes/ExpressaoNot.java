package Expressoes;

import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria{

	public ExpressaoNot(ExpressaoLogica expressao) {
		super(expressao);
	}
	
	public String toString() {
		return "(not"+getExpressaoLogica()+")";
	}

	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		return !getExpressaoLogica().eval(valoresVariaveis);
	}
}
