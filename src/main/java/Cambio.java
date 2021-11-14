public class Cambio {

    public static String formula = "real * 5.6 + taxa";

    public static double calcularNota(double nota1, double nota2) {
        String expressao;
        expressao = formula.replace("real", Double.toString(nota1));
        expressao = expressao.replace("taxa", Double.toString(nota2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
