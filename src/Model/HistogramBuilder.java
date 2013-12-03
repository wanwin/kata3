package Model;

import java.util.List;

public class HistogramBuilder<T> {
    private Histogram<T> histogram;

    public HistogramBuilder() {
        this.histogram = new Histogram<>();
    }
    
    public void calculate(T[] data){
        for (T item : data) {
            histogram.put(item, getCount(item)+1);
        }
    }    

    public void calculate(List<T> data){
        for (T item : data) {
            histogram.put(item, getCount(item)+1);
        }
    }    

    private int getCount(T item) {
        if(histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }

    public Histogram<T> getHistogram() {
        return histogram;
    }
}