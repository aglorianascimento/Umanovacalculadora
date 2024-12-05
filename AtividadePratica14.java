class AtividadePratica14
{
    public static void main(String entrada[])
    {
    //Seção de variáveis declarando inteiro, real e String, como pedido na ativadade prática.
    int n1, n2;
    int div;
    double pot;
    String msg;
    String msg2;

    //Seção de entrada de dados do usuário
    n1 = Integer.parseInt(entrada[0]);
    n2 = Integer.parseInt(entrada[1]);

    //Processamento
    div = (int)n1 / (int)n2;
    pot = Math.pow(n1, n2);

    msg = "O resultado do quociente dos seus números é " + div;
    msg2 = "A potência do primeiro pelo segundo é " + pot;

    //Apresentação das informações para o usuário
    System.out.println();
    System.out.println(msg);
    System.out.println();
    System.out.println(msg2);
    System.out.println();

    System.exit(0);
    }  
}