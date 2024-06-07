//import java.lang.*;

class arithametic
{
    public static void main(String[] args)
    {
        int x = 3, y = 2, z;

        z = x + y; //adição
        z = x - y; //subtração
        z = x * y; //multiplicação
        z = x / y; //divisão
        z = x % y; //resto

        z = (x + y) / y; //soma ocorre primeiro;

        //Resultado com vários tipos de variaveis com operações aritiméticas:
        //Recebe resultado como variável primitiva. Ex.: Integer, Floating.
        //Entre inteiros e flutuantes, o resultante sempre é flutuante.
        //Entre flutuante e double, o operador trata como conta.

        z = 2 ^ 2;

        z = (int)Math.pow(x, y); //necessário converter variável para o tipo correto. Função 'pow' retorna double, não int.

        System.out.println(z);
    }
}