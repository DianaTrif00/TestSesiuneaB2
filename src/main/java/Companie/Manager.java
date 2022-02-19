package Companie;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat implements Element,Visitee{

    List<Element> lista_subordine = new ArrayList<>();

    public Manager(String manager_nume, Integer salariu, Integer vechime){
        super(manager_nume,salariu,vechime);
    }

    public List<Element> getListaSubordine(){
        return this.lista_subordine;
    }
    public Element add(Element element){
        lista_subordine.add(element);
        return this;
    };
    @Override
    public void accept(Visitor visitor) {
        visitor.visitManager(this);
    }
}
