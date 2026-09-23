package ModernJava.H_Generics.Models;

public class ProductGeneric <T, P>{
    private T t ;
    private P p;

    public ProductGeneric(T t, P p) {
        this.t = t;
        this.p = p;
    }

    @Override
    public String toString() {
        return "ProductGeneric{" +
                "t=" + t +
                ", p=" + p +
                '}';
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}
