//Estruturas Condicionais

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;
        //Se o saldo for maior que o valor solicitado, vamos tirar o valor solicitado
        //e mostrar o saldo que ficou na conta.
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo);
        }else
        System.out.println("Saldo insuficiente");
        
    }
}
