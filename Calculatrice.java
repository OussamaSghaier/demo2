import java.util.Scanner;

public class Calculatrice{
    public static void main(String[] args){
        System.out.println("*** Calculatrice ***");
        Calculatrice calculatrice = new Calculatrice();
        calculatrice.displayMenu();

        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        switch(choix){
            case 1:
                System.out.println("Entrez le premier nombre");
                int a = scanner.nextInt();
                System.out.println("Entrez le deuxième nombre");
                int b = scanner.nextInt();
                System.out.println(calculatrice.addition(a, b));
                break;
            case 2:
                System.out.println("Entrez le premier nombre");
                a = scanner.nextInt();
                System.out.println("Entrez le deuxième nombre");
                b = scanner.nextInt();
                System.out.println(calculatrice.soustraction(a, b));
                break;
            case 3:
                System.out.println("Entrez le premier nombre");
                a = scanner.nextInt();
                System.out.println("Entrez le deuxième nombre");
                b = scanner.nextInt();
                System.out.println(calculatrice.division(a, b));
                break;
            case 4:
                System.out.println("Entrez le premier nombre");
                a = scanner.nextInt();
                System.out.println("Entrez le deuxième nombre");
                b = scanner.nextInt();
                System.out.println(calculatrice.multiplication(a, b));
                break;
            case 5:
                System.out.println("Entrez le premier nombre");
                a = scanner.nextInt();
                System.out.println("Entrez le deuxième nombre");
                b = scanner.nextInt();
                System.out.println(calculatrice.modulo(a, b));
                break;
        }
        
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

    public int multiplication(int a, int b){
        return a * b;
    }

    public int modulo(int a, int b){
        return a%b;
    }

    public void displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulo");
        System.out.println("6. Quitter");
    }

}
