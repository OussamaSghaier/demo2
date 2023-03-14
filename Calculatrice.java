public class Calculatrice{
    public static void main(String[] args){
        System.out.println("*** Calculatrice ***");
        Calculatrice calculatrice = new Calculatrice();
        System.out.println(calculatrice.addition(1, 5));
        
    }

    public int addition(int a, int b){
        return a + b;
    }

    public int soustraction(int a, int b){
        return a - b;
    }

    public int division(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Division par 0");
        }
        return a / b;
    }

}
