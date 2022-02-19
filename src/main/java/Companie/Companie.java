package Companie;

import java.util.ArrayList;
import java.util.List;

public class Companie implements Element, Visitee{
    String nume;
    List<Element> lista_angajati = new ArrayList<>();

    public Companie(String nume){
        this.nume = nume;
    }
    public Element add(Element element){
        lista_angajati.add(element);
        return this;
    };
    public String getNume(){
        return this.nume;
    }
    public List<Element> getListaElemente(){
        return this.lista_angajati;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompanie(this);
    }
}
