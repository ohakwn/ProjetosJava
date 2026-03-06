package HPI.SistemaBancario;

public class OperacaoBancaria implements AcaoBancaria{
    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    @Override
    public void executar() {
    }
}
