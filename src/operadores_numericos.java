import java.awt.*;
import java.util.Scanner;

public class operadores_numericos {
    private final static String texto = "Informe o numero";
    // Operadores Aritiméticos
    public static void main(String[] args){
        var scanner = new Scanner(System.in); // para pegar dados
        System.out.println(texto);// mensagem aqui
        var value1 = scanner.nextInt();//numero inteiro
        System.out.println(texto);
        var value2 = scanner.nextInt();
        // value += 12; ex 10+12 = 22
        // print(value++ ou --value) para direita o encremento fica para proxima linha
        // para esquerda ++value ou --value o valor se resolve na hora

        // para numeros quebrados
        // var value1 = scanner.nextFloat();
        var valor = 20+2 +(20*2);// * e / sempre vem primeiro
        //em parentese sempre tera a preferencia

        System.out.printf("%s + %s = %s\n",value1, value2, value1 + value2);
        System.out.printf("%s - %s = %s\n",value1, value2, value1 - value2);
        System.out.printf("%s / %s = %s\n",value1, value2, value1 / value2);
        System.out.printf("%s %% %s = %s\n",value1, value2, value1 % value2);
        System.out.printf("%s * %s = %s\n ",value1, value2, value1 * value2);
        //para pegar a raiz quadrada de value1
        System.out.printf("A raiz quadrada de %s é %s \n",value1, Math.sqrt(value1));
        //para pegar a potencia de um numero elevado a qq potencia
        System.out.printf("A potência de %s é %s \n ", value1, Math.pow(value1,value2));

    }
}
