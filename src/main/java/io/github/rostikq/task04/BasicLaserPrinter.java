package io.github.rostikq.task04;

public class BasicLaserPrinter implements Printable, DuplexPrintable {
    @Override
    public void printDocument(String doc) {
        System.out.println("Printing: " + doc);
    }

    @Override
    public void duplexPrint(String doc) {
        System.out.println("Duplex printing: " + doc);
    }
}
