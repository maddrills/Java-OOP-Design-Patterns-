package ObserverByMe;

public interface Observable {
    void register(Observer o);
    void dRegister(Observer o);
    void alertOfChange();
}
