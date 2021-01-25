package figuras;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica[] array = new FiguraGeometrica[3];

        array[0] = new Circulo(3);
        array[1] = new Rectangulo(3,9);
        array[2] = new Triangulo(2,5);

        System.out.println(array[0]);

        double areaPromedio = AreaPromedio.areaPromedio(array);

        System.out.println(areaPromedio);
    }

}
