package Control;

import Model.HistogramBuilder;
import Model.MailReader;
import UI.HistogramViewer;

public class CalculateMailDomainHistogramControl{
    
    private String filename;

    public CalculateMailDomainHistogramControl(String filename){
        this.filename = filename;
    }
    
    public void execute(){
        HistogramBuilder<String> builder=new HistogramBuilder();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer=new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}