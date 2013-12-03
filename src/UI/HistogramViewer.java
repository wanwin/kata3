package UI;

import Model.Histogram;

public class HistogramViewer<T> {
    private Histogram<T> histogram;

    public HistogramViewer(Histogram<T> histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (T key : histogram.keySet()) {
        System.out.println(key+": "+histogram.get(key));
        }
    }
}