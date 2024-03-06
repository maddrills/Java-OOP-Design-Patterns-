package DecoraterPaternMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //main call
        Beverage tea = new Tea();
        System.out.println(tea.price());

        Beverage teawithextra = new Creem(new BreadCrums(new Tea()));
        System.out.println(teawithextra.about());
        System.out.println("total cost: "+teawithextra.price());


        File file = new File("H:\\Download\\op.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write(teawithextra.about()+"total cost: "+teawithextra.price());
        writer.close();
    }
}
