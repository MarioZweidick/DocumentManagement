package at.campus02.zweidick;

public abstract class Document
{
    protected String fileName;

    public Document(String fileName)
    {
        this.fileName = fileName;
    }

    public abstract void printDocument();
}
