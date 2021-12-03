package at.campus02.zweidick;

import java.util.ArrayList;

public class PrintManager
{
    private ArrayList<Document> list = new ArrayList<>();

    public void addDocument(Document d)
    {
        list.add(d);
    }

    public void printAll()
    {
        for (Document document : list)
        {
           document.printDocument();
        }
    }

    public Document findDocument(String fileName)
    {
        for (Document document : list)
        {
            if(document.fileName.equals(fileName))
                return document;

        }
        return null;
    }

}
