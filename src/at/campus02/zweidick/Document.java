package at.campus02.zweidick;

public class Document
{
    protected String fileName;

    public Document(String fileName)
    {
        this.fileName = fileName;
    }

    public void printDocument()
    {
        System.out.println("This is just the main Document class called " + fileName);
    }
}
