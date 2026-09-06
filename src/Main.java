import java.util.Scanner;

public class Main {
    /*comentario para varias linhas*/  //para uma linha
    // variavel global | TAMBEM UMA CONSTANTE
    //private final static String WELCOME_MENSSAGE = "olá, informe o seu nome: ";
    private final static String mgn = "Quantos anos você tem?";
    private final static String mgn1= "Você é emancipado?";
    public static void main(String[] args){
        //======AULA 01
//        System.out.println("Hello World!");
//        Scanner scanner = new Scanner(System.in);
//        //System.out.println("Olá, informe o seu nome: ");
//        System.out.println(WELCOME_MENSSAGE);
//        String name = scanner.next();
//        // var name = scanner.next(); // outro metódo de criar vaiavel
//        System.out.println("Informe a sua idade: ");
//        int age = scanner.nextInt();
//        //imprimindo dados
//        System.out.println("Olá " + name + " sua idade é:" + age);
//        System.out.printf("Olá %s sua idade é:%s",name, age);
         //==========
        //AULA 02 tipos primitivos
//        byte number = 100;
//        short nu = 3;
//        int number1 = 11;
//        long number2 = 2L; // para longo
//        float numero = 1.0f;// para numero flutuante
//        var numero2 = 2.0d;// para numero double
//        char character = 'r';// para caracter
//        var boo = true;// valor boleano
//        var bo = false;//
        // AULA 03 Operadores loicos
//        var scanner = new Scanner(System.in);
//        System.out.println("Quanto é 2 + 2 ?");
//        var result = scanner.nextInt();
//        //var isRight = result == 4;
//        var isWrong = result != 4;// se diferente
//        System.out.printf("O resultado é 4, você acertou? (%s) ",isWrong);//assim: !siWrong  iverte a logica
//        var scanner = new Scanner(System.in);
//        System.out.println("Quantos anos você tem?");
//        var age = scanner.nextInt();
//        var canDrive = age >= 18;
//        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
        //  || ou  ,   >= <= == >  < ,  && E
        var scanner = new Scanner(System.in);
        System.out.println(mgn);
        var age = scanner.nextInt();
        System.out.println(mgn1);
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);


    }
}



