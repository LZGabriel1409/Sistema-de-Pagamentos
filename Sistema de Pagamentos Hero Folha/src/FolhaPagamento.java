public class FolhaPagamento {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Assalariado(
                "Tony Stark",
                "111.111.111-11",
                8500.00
        );
        funcionarios[1] = new Comissionado(
                "Bruce Banner",
                "222.222.222-22",
                30000.00,
                0.10
        );
        funcionarios[2] = new Assalariado(
                "Steve Rogers",
                "333.333.333-33",
                6200.00
        );
        funcionarios[3] = new Comissionado(
                "Peter Parker",
                "444.444.444-44",
                15000.00,
                0.08
        );

        double totalFolha = 0;

        System.out.println("===== FOLHA DE PAGAMENTO =====");

        for (Funcionario f : funcionarios) {
            double pagamento = f.vencimentos();

            // Bônus para comissionados
            if (f instanceof Comissionado) {
                pagamento += 200.00;
            }

            System.out.println(f);
            System.out.printf("Vencimentos: R$ %.2f%n", pagamento);
            System.out.println("-----------------------------");

            totalFolha += pagamento;
        }
        System.out.printf("TOTAL DA FOLHA: R$ %.2f%n", totalFolha);
    }
}