
public class Operaciones {

    
    public static void main(String[] args) {
       int N = 5;
        double A = 4.56;
        char C = 'a';
        System.out.println("Variable N = "+ N);
        System.out.println("Variable A = "+ A);
        System.out.println("Variable C = "+ C);
        System.out.println(N+"+"+A+"="+(N+A));
        System.out.println(A+"-"+N+"="+(A-N));
        System.out.println("Valor numeroco del carácter "+C+" = "+(int)C);
        
       
        int numero1 = 12;
        int numero2 = 2;
        double division;
        int suma, resta, multiplicacion;
        double modulo;
        double operacion;
        operacion = 9/3*5-3+8*2;
        System.out.println("El resultado de la operación es: "+operacion);
        division = numero1/numero2;
        System.out.println("El resultado de la división es: "+division);
        suma = numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        resta = numero1-numero2;
        System.out.println("El resultado de la resta es: "+resta);
        multiplicacion = numero1*numero2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        modulo = numero1%numero2;
        System.out.println("El resultado del modulo es: "+modulo); 
    }
    
}
