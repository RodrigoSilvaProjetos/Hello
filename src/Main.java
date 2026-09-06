import java.util.Scanner;
public class Main {
    /*comentario para varias linhas*/
    //declaração de variaveis

    // variavel global | TAMBEM UMA CONSTANTE
    private final static String WELCOME_MENSSAGE = "olá, informe o seu nome: ";

    public static void main(String[] args){
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Olá, informe o seu nome: ");
        System.out.println(WELCOME_MENSSAGE);
        String name = scanner.next();
        // var name = scanner.next(); // outro metódo de criar vaiavel

        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();

        //imprimindo dados
        System.out.println("Olá " + name + " sua idade é:" + age);
        System.out.printf("Olá %s sua idade é:%s",name, age);




    }
}
