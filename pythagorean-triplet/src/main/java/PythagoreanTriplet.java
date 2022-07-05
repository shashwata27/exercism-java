import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PythagoreanTriplet {
    public int a,b,c;
    private int factor,sum;

//    constructor overloading
    private PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int factor) {
        this.factor = factor;
        return this;
    }
    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        for(int a=3;a<=this.sum;a++){
            for(int b=4;b<=this.sum;b++){
                int c=this.sum-a-b;
                if(isValidTriplet(a,b,c) && a<=b){
                    triplets.add(new PythagoreanTriplet(a,b,c));
                }
            }
        }
        if(triplets.size() == 0) {
            return Collections.emptyList();
        }
        return triplets;
    }
    private boolean isValidTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof PythagoreanTriplet) {
            return this.a == ((PythagoreanTriplet) o).a
                    && this.b == ((PythagoreanTriplet) o).b
                    && this.c == ((PythagoreanTriplet) o).c;
        }
        return false;
    }
}
