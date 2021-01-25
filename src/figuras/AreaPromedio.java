package figuras;

public class AreaPromedio {

    public static double areaPromedio(FiguraGeometrica[] arr){
        double suma = 0;

        for (FiguraGeometrica figuraGeometrica : arr) {
            suma += figuraGeometrica.area();
        }

        return suma/arr.length;
    }
}
