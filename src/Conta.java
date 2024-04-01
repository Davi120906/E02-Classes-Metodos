public class Conta {

    
    double saldo;
    int numero;
    String agencia;
    int limite;
    Cliente cliente = new Cliente();


    boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }


    boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }
    void imprimir(){
        System.out.println("DADOS DA CONTA \nNOME DO DONO: " + this.cliente.Nome + "\nNUMERO DA CONTA: " + this.numero + "\nSALDO DA CONTA: " + this.saldo + "\nLIMITE: " + this.limite);
    }
}
