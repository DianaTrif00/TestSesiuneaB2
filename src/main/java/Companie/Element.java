package Companie;

public interface Element {
    default void accept(Visitor visitor){
        throw new UnsupportedOperationException("Don't get.");
    };
}
