package ProxyPattern;

import java.util.Random;

public final class BookPaser implements IbookPasser{
    private String book;
    private Random random;
    public BookPaser(String book){
        this.book = book;
        random = new Random();
    }
    @Override
    public int getNumPages() {
        return book.length() + secureCodeToPages() + secureSecreateScramble();
    }

    private int secureCodeToPages(){
        return 22 + random.nextInt(17) + 1;
    }

    private int secureSecreateScramble(){
        int num = random.nextInt(100) + 1;
        return num;
    }
}
