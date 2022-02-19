package Companie;

public class Angajat implements Element,Visitee{
    String nume_angajat;
    Integer salariul;
    Integer cati_ani_vechime;

    public Angajat(String nume_angajat, Integer salariu, Integer salariul){
        this.nume_angajat = nume_angajat;
        this.salariul = salariul;
    }
    public String getNumeAngajat(){
        return this.nume_angajat;
    }
    public Integer getSalariu(){
        return this.salariul;
    }
    public Integer getCati_ani_vechime() {return this.cati_ani_vechime; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAngajat(this);
    }
}
