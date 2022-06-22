public class Client {


    public static void main(String[] args) {
        String str1 = "28 의 2진수 ";
        String str2 = "28 의 16진수 ";

        Interpreter ip = new Interpreter(new InterpreterContext());
        System.out.println(str1 + " : " + ip.interpret(str1));
        System.out.println(str2 + " : " + ip.interpret(str2));

    }
}
