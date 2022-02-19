package Companie;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Angajat implements Element,Visitee{
    String tip;
    public Developer(String nume, Integer salariu, Integer vechime, String tip){
        super(nume, salariu, vechime);
        if (tip.compareTo("Front-end") == 0  || tip.compareTo("Back-end") == 0 || tip.compareTo("Full-stack") == 0){
            this.tip = tip;
        }
    }
    public String getTip(){return this.tip;}
    @Override
    public void accept(Visitor visitor) {
        visitor.visitDeveloper(this);
    }
}
