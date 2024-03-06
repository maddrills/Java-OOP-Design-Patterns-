package ProxyPattern;

public class LazeyBookParserProxy implements IbookPasser{
    private BookPaser bookPaser = null;
    String book;

    public LazeyBookParserProxy(String book){
        this.book = book;
    }

    @Override
    public int getNumPages() {
        if(this.bookPaser == null){
            this.bookPaser  = new BookPaser(book);
        }
        return this.bookPaser.getNumPages();
    }
}
