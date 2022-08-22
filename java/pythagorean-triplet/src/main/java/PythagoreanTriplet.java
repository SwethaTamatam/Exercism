import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class PythagoreanTriplet {
    private final int first, second, third;
    PythagoreanTriplet(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
   
    int calculateSum() {
        return first + second + third;
    }
    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }
    public static class TripletListBuilder {
        private int maxValue = 0, minValue = 1, sum = -1;
        public TripletListBuilder withFactorsLessThanOrEqualTo(int hi) {
            maxValue = hi;
            return this;
        }
        public TripletListBuilder thatSumTo(int amount) {
            sum = amount;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> res = new ArrayList<>();
            if(maxValue==0) {
            	maxValue = sum;
            }
            for (int i = minValue; i < maxValue - 1; i++){
                for (int j = i; j < maxValue; j++) {
                    double n = Math.sqrt(i * i + j * j);
                    if (n == (long) n){
                    		if(n<=maxValue) {
                    			 PythagoreanTriplet triplet = new PythagoreanTriplet(i, j,(int) n);
     	                        if(triplet.calculateSum()==sum){
     	                            res.add(triplet);
     	                        }
                    		}    
                    }
                }
            }
            if(res.size()==1)
            	return Collections.singletonList(res.get(0));
            else {
            	return res;
            }
           
        }
    }
}
