import java.util.Scanner;

class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private double preco;

    public Carro(String modelo, String marca, String cor, String ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }

    // Métodos Getters para acessar os dados
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca = marca;
    }

    public String getCor() {
        return cor = cor;
    }

    public String getAno() {
        return ano = ano;
    }

    public double getPreco() {
        return preco;
    }
}

public class ExercicioModulo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int limiteMaximo = 50;
        int quantidade = 0;

        while (true) {
            System.out.print("Quantos carros deseja cadastrar (Máximo " + limiteMaximo + "): ");
            quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade > 0 && quantidade <= limiteMaximo) {
                break;
            } else {
                System.out.println("❌ Quantidade inválida! O limite máximo é de " + limiteMaximo + " carros e deve ser maior que 0.\n");
            }
        }

        Carro[] vetorCarros = new Carro[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n--- Cadastro do " + (i + 1) + "º Carro ---");

            System.out.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.print("Digite a marca do carro: ");
            String marca = scanner.nextLine();

            System.out.print("Digite a cor do carro: ");
            String cor = scanner.nextLine();

            System.out.print("Digite o ano do carro: ");
            String ano = scanner.nextLine();

            System.out.print("Digite o preço do carro: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            vetorCarros[i] = new Carro(modelo, marca, cor, ano, preco);
        }

        System.out.println("\n=================================");
        System.out.println("       RESUMO DO CADASTRO        ");
        System.out.println("=================================");

        double precoTotal = 0;

        for (int i = 0; i < vetorCarros.length; i++) {
            Carro carro = vetorCarros[i];
            System.out.printf("🚗 Carro %d: %s | Marca: %s | Cor: %s | Ano: %s | Preço: R$ %.2f%n", (i + 1), carro.getModelo(), carro.getMarca(), carro.getCor(), carro.getAno(), carro.getPreco());
            precoTotal += carro.getPreco(); // Acumulando o valor total
        }

        // Cálculo da média de preços
        double precoMedio = precoTotal / quantidade;

        System.out.println("---------------------------------");
        System.out.printf("📊 Total de carros cadastrados: %d%n", quantidade);
        System.out.printf("💰 Valor total da frota: R$ %.2f%n", precoTotal);
        System.out.printf("📈 Preço médio por veículo: R$ %.2f%n", precoMedio);
        System.out.println("=================================");

        scanner.close();
    }
}
