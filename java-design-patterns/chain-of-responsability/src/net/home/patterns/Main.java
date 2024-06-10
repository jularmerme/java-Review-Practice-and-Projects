package net.home.patterns;

public class Main {
    public static void main(String[] args) {
        DocumentHandler chain = new SpreadsheetHandler(new SlideshowHandler(new TextDocumentHandler(null)));

        chain.openDocument("ppt");

        chain.openDocument("txt");

    }
}