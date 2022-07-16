package MatematicaUltil;

public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = CalculadoraArea.calculadoraAreaQuadrado(5.2);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);
    }
}
