
import java.io.*;

class Copy {
    
 
    String name;
    int id;
 
    Copy(String name, int id)
    {
        this.name = name;
        this.id = id;
    }


    Copy(Copy obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class GFG {
    public static void main(String[] args)
    {
    
        System.out.println("First Object");
        Copy copy1 = new Copy("Sweta", 68);
        System.out.println("Name: " + copy1.name + " and Id: " + copy1.id);

        System.out.println();


        Copy copy2 = new Copy(copy1);
        System.out.println( "Copy Constructor used Second Object");
        System.out.println("Name: " + copy2.name  + " and Id: " + copy2.id);
    }
}