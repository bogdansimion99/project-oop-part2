package helpers;

public interface Modificator {
    float accept(ModificatorVisitor modificatorVisitor, float[] modificators);
    float accept(ModificatorVisitor modificatorVisitor, int[] hp);
}
