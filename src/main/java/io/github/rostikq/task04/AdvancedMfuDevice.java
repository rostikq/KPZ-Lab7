package io.github.rostikq.task04;

public class AdvancedMfuDevice implements Printable, DuplexPrintable, Scannable, Faxable, Staplable {
    @Override public void printDocument(String doc) { System.out.println("MFU Print: " + doc); }
    @Override public void duplexPrint(String doc) { System.out.println("MFU Duplex: " + doc); }
    @Override public void scanDocument() { System.out.println("MFU Scan"); }
    @Override public void sendFax(String number, String doc) { System.out.println("MFU Fax to " + number); }
    @Override public void staplePages(int count) { System.out.println("MFU Stapled " + count + " pages"); }
}
