package FactoryDesignPatternByMe;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    static FactorySolder factorySolder;
    public static void main(String[] args)throws Exception{
        int soldercount = 0;
        FileWriter file = new FileWriter("H:\\Download\\op.txt",true);
        char input;
        //main call
        Scanner ob = new Scanner(System.in);
        while(true){
            System.out.println("Enter level");
            int level = ob.nextInt();
            System.out.println("Enter name");
            ob.nextLine();
            String name = ob.nextLine();
            System.out.println("Enter a, b, c or to exit");
            input  = ob.nextLine().toLowerCase().charAt(0);
            if(input == 'a'){
                factorySolder = new SolderWithSpear(level,name);
            }
            else if(input == 'b'){
                factorySolder = new SolderWithSward(level,name);
            }
            else if(input == 'c'){
                factorySolder = new SolderWithAxe(level,name);
            }
            else{
                break;
            }
            System.out.println("Solder created with name "+ factorySolder.getName());
            System.out.println("Level "+factorySolder.getLevel());
            System.out.println("Damage "+factorySolder.damage());

/*            file.write("Solder count"+(++soldercount)+"\n"+"Solder created with name "+ factorySolder.getName()+"\n"+"Level "+factorySolder.getLevel()+"\n"+"Damage "+factorySolder.damage()+"\n");
            file.close();
            soldercount += 1;*/

        }
    }
}
