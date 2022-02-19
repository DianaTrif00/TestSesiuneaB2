package Companie;

public interface Visitor <T>{
    T visitCompanie(Companie an);
    T visitManager(Manager grupa);
    T visitDeveloper(Developer semigrupa);
    T visitAngajat(Angajat student);
    T visitHR(HR hr);
}
