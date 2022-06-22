public class Interpreter {

    private InterpreterContext ic;

    public Interpreter(InterpreterContext ic) {
        this.ic = ic;
    }

    public String interpret(String str) {
        Expression exp = null;
        if(str.contains("16진수")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        } else if(str.contains("2진수")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        } else return str;
        return exp.interpret(ic);
    }
}
