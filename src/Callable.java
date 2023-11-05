public interface Callable<T> {
    void receiveCall(String name) throws NameException;
}
