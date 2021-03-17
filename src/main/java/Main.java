public class Main {

    public static void main(String[] args) {

        float num1 = 150f;
        float num2 = 5f;

        Calculations calculator = new Calculations();

        float resultAdd = calculator.addition(num1, num2);
        float resultSub = calculator.substraction(num1, num2);
        float resultMul = calculator.multiplication(num1, num2);
        float resultDiv = calculator.division(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + resultAdd);
        System.out.println(num1 + " - " + num2 + " = " + resultSub);
        System.out.println(num1 + " * " + num2 + " = " + resultMul);
        System.out.println(num1 + " / " + num2 + " = " + resultDiv);

    }
}