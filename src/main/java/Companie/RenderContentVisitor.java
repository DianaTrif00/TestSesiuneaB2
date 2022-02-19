package Companie;

public class RenderContentVisitor implements Visitor<Void>{


    @Override
    public Void visitCompanie(Companie companie) {
        System.out.println("Compania "+ companie.getNume());
        for(Element e: companie.getListaElemente()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitManager(Manager manager) {
        System.out.println("-- Manager --");
        System.out.println("nume angajat: " + manager.getNumeAngajat() );
        System.out.println("salar: " + manager.getSalariu() );
        System.out.println("vechime: " + manager.getCati_ani_vechime() );
        for (Element e: manager.getListaSubordine()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitDeveloper(Developer developer) {
        System.out.println("-- Developer --");
        System.out.println("nume angajat: " + developer.getNumeAngajat() );
        System.out.println("salar: " + developer.getSalariu() );
        System.out.println("vechime: " + developer.getCati_ani_vechime() );
        System.out.println("tip: " + developer.getTip());
        return null;
    }

    @Override
    public Void visitAngajat(Angajat angajat) {
        System.out.println("nume angajat: " + angajat.getNumeAngajat() );
        System.out.println("salar: " + angajat.getSalariu() );
        System.out.println("vechime: " + angajat.getCati_ani_vechime() );
        return null;
    }

    @Override
    public Void visitHR(HR hr) {
        System.out.println("-- HR --");
        System.out.println("nume angajat: " + hr.getNumeAngajat() );
        System.out.println("salar: " + hr.getSalariu() );
        System.out.println("vechime: " + hr.getCati_ani_vechime() );
        return null;
    }
}