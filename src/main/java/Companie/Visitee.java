package Companie;

public interface Visitee {
    default void accept(Visitor visitor){throw new UnsupportedOperationException("don't accept.");}
}
