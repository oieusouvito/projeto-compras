import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldo;
    private List<Compras> compra;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldo = limiteDoCartao;
        this.compra = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompra() {
        return compra;
    }
}
