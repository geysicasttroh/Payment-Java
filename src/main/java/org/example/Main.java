package org.example;

interface Pagamento {
    void pagar(double valor);
}

class Pix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}

class Cartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via cartão: R$ " + valor);
    }
}

class Pedido {

    private Pagamento pagamento;

    public Pedido(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizar(double valor) {
        System.out.println("Finalizando pedido...");
        pagamento.pagar(valor);
    }
}

public class Main {

    public static void main(String[] args) {

        Pagamento pagamento = new Pix();

        Pedido pedido = new Pedido(pagamento);

        pedido.finalizar(150.00);
    }
}

