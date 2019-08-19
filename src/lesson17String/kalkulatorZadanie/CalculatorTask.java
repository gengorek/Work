package lesson17String.kalkulatorZadanie;

public class CalculatorTask {
    public static void main(String[] args) {
        String equation = "25 * 5 - 5 / 6 - 20";
        String[] split = equation.split(" ");

        Double result = Double.parseDouble(split[0]);

        for(int i = 1; i < split.length; i += 2){
            result = doEquation(result, split[i], Integer.valueOf(split[i + 1]));
        }
        System.out.println(result);
    }

    private static Double doEquation(Double result, String mark, Integer valueOf) {

        switch (mark){
            case "+" :
                return result + valueOf;
            case "-" :
                return result - valueOf;
            case "*" :
                return result * valueOf;
            case "/" :
                return result / valueOf;
        }
        return null;
    }
}
