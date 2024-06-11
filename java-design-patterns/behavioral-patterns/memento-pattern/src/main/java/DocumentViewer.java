package main.java;

public class DocumentViewer {

    private static TextDocument textDocument = new TextDocument();

    public static void main(String[] args) {

        textDocument.write("hello");
        textDocument.save();
        textDocument.print();
        textDocument.write(" World");
        textDocument.print();
        textDocument.undo();
        textDocument.print();
    }
}