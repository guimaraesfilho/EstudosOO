import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Joao Alberto";
        eu.cpf = "000.111.222-33";
        eu.anoNascimento = 1978;

        Pessoa voce = new Pessoa();
        voce.nome = "Carlos Alberto";
        voce.cpf = "444.111.555-33";
        voce.anoNascimento = 1990;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2015;
        meuCarro.cor = "preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 160000;
        seuCarro.proprietario = voce;

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();

//        System.out.println("Meu carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Modelo: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Modelo: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);


    }
}
