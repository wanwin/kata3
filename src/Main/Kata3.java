package Main;

import Control.CalculateMailDomainHistogramControl;

public class Kata3{

    public static void main(String[] args) {
        CalculateMailDomainHistogramControl control=new CalculateMailDomainHistogramControl(args[0]);
        control.execute();
    }
}