package at.campus02.zweidick;

import java.util.ArrayList;

public class CsvDocument extends Document
{
    private ArrayList<String> lines;

    public CsvDocument(String fileName, ArrayList<String> lines)
    {
        super(fileName);
        this.lines = lines;
    }

    @Override
    public void printDocument()
    {
        for (String line : lines)
        {
            System.out.println(line);
        }
    }

    public void addLine(String line)
    {
        lines.add(line);
    }
}
