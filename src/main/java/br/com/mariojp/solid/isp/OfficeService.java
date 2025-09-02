package br.com.mariojp.solid.isp;

public class OfficeService {
    private final IPrintDevice device;

    public OfficeService(IPrintDevice device){ 
        this.device = device; 
    }

    public void printReport(String content){
        device.print(content);
    }
}
 