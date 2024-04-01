public class Main {
    public static void main ( String [] args ) {
        Conta minhaconta;
        minhaconta = new Conta();
        minhaconta.cliente.Nome = "Davi";
        minhaconta.saldo = 7000;
        minhaconta.numero = 120906;
        minhaconta.agencia = "COLTEBET";
        minhaconta.limite = 20000;
        minhaconta.imprimir();
        //PARTE DO FORMULARIO
        Conta conta1, conta2;
        conta2 = new Conta();
        conta1 = new Conta();
        //QUESTAO 1
        conta1.cliente.Nome = "LUCAS";
        conta1.saldo = 4000;
        conta1.numero = 13452;
        conta1.agencia = "COLTEBET";
        conta1.limite = 15000;
        conta2.cliente.Nome = "LUCAS";
        conta2.saldo = 4000;
        conta2.numero = 13452;
        conta2.agencia = "COLTEBET";
        conta2.limite = 15000;
        if (conta1 == conta2){
            System.out.println("Iguais");
        }
        else{
            System.out.println("Diferentes");
        }
        //QUESTAO 2
        conta2 = new Conta();
        conta1 = new Conta();
        conta1.cliente.Nome = "LUCAS";
        conta1.saldo = 4000;
        conta1.numero = 13452;
        conta1.agencia = "COLTEBET";
        conta1.limite = 15000;
        conta2 = conta1;
        if (conta1 == conta2){
            System.out.println("Iguais");
        }
        else{
            System.out.println("Diferentes");
        }
        conta2.imprimir();
    }
}
