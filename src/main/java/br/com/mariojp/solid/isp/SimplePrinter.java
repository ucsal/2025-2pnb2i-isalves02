package br.com.mariojp.solid.isp;

public class SimplePrinter implements IPrintDevice {
    @Override
    public void print(String content) {
        System.out.println(content);
    }
}
