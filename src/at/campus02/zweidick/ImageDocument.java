package at.campus02.zweidick;

public class ImageDocument extends Document
{
    int sizeX;
    int sizeY;
    String colour;

    public ImageDocument(String fileName, int sizeX, int sizeY, String colour)
    {
        super(fileName);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.colour = colour;
    }

    @Override
    public void printDocument()
    {
        System.out.println("ImageDocument: " + fileName + " Size: " + sizeX + " x " + sizeY + " Colour: " + colour);
    }
}
