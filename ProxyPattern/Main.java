package ProxyPattern;

public class Main {
    public static void main(String[] args){

        IbookPasser book = new LazeyBookParserProxy("onetwo");
        System.out.println("encriped book num :"+book.getNumPages());//creats the object of bookPaser by proxy only on method call
    }
}
