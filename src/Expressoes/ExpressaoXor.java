package Expressoes;

import java.util.Map;

/**
 *
 * @author gbljunior
 */
public class ExpressaoXor extends ExpressaoBinaria{

    public ExpressaoXor(ExpressaoLogica expressao1, ExpressaoLogica expressao2) {
        super(expressao1, expressao2);
    }

    @Override
    public String toString() {
        return "("+getExpressao1()+" xor " + getExpressao2()+")";
    }

    @Override
    public boolean eval(Map<String, Boolean> valoresVariaveis) {
        return !(getExpressao1().eval(valoresVariaveis) && getExpressao2().eval(valoresVariaveis)) 
                || (getExpressao1().eval(valoresVariaveis) || getExpressao2().eval(valoresVariaveis));
    }
    
}
