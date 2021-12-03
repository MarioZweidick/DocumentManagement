package at.campus02.zweidick;

import java.util.ArrayList;

public class DemoDocuments
{
    public static void main(String[] args)
    {
        Document normalDoc = new Document("Document1.dat");
        TextDocument textDocument  = new TextDocument("text1.txt", "This is a test!");
        ImageDocument imageDocument = new ImageDocument("Image1.png", 300, 200, "blue");
        CsvDocument csvDocument = new CsvDocument("Lines.csv", new ArrayList<>());

        PrintManager manager = new PrintManager();

        csvDocument.addLine("This is line 1!");
        csvDocument.addLine("This is line 2!");
        csvDocument.addLine("This is line 3!");
        csvDocument.addLine("This is line 4!");

        normalDoc.printDocument();
        textDocument.printDocument();
        imageDocument.printDocument();
        csvDocument.printDocument();

        manager.addDocument(normalDoc);
        manager.addDocument(textDocument);
        manager.addDocument(imageDocument);
        manager.addDocument(csvDocument);

        manager.printAll();

        manager.findDocument("Document1.dat").printDocument();

    }

}
