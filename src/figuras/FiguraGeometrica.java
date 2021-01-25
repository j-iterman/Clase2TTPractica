package figuras;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "Esta figura es un " + this.getClass().getSimpleName() + " de área " + area();
    }
}
