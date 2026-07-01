public class Comissionado extends Funcionario {
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(String nome, String cpf,
                        double totalVendas, double taxaComissao) {
        super(nome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimentos() {
        return totalVendas * taxaComissao;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(
                   " | Total Vendas: R$ %.2f | Taxa Comissão: %.2f%%",
                   totalVendas,
                   taxaComissao * 100
               );
    }
}