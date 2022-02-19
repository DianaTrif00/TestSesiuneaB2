package Companie;

public class HR extends Angajat implements Element, Visitee{

    public HR(String nume, Integer salariu, Integer vechime){
        super(nume,salariu,vechime);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHR(this);
    }
}
