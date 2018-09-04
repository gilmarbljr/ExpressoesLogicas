package Expressoes;

import java.util.HashMap;
import java.util.Map;

public class TestaExpressaoLogica {

	public static void main(String[] args) {
		ExpressaoLogica expressao = new 
				ExpressaoImplicacao(
						new ExpressaoImplicacao(
								new ExpressaoOr(
										new ExpressaoAtomica("A"), 
										new ExpressaoAtomica("B")),
								new ExpressaoAnd(
										new ExpressaoAtomica("C"),
										new ExpressaoAtomica("A"))),
						new ExpressaoOr(
								new ExpressaoAnd(
										new ExpressaoNot(
												new ExpressaoAtomica("B")),
										new ExpressaoAtomica("C")),
								new ExpressaoAnd(
										new ExpressaoAtomica("A"),
										new ExpressaoAtomica("D"))));
		
		System.out.println(expressao);
		
		Map<String, Boolean> valoresVariaveis = new HashMap<>();
		
		valoresVariaveis.put("A", false);
		valoresVariaveis.put("B", true);
		valoresVariaveis.put("C", true);
		valoresVariaveis.put("D", false);
		
		System.out.println(expressao.eval(valoresVariaveis));
	}

}
