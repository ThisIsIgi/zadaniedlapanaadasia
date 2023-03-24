public class Bezgazu extends Napoje {
    Float cena;
    String typ;


    public Bezgazu(String nazwa, Float cena, String typ) {
        super(nazwa);
        this.cena = cena;
        this.typ = typ;
    }


    @Override
    void pij() {
        System.out.println("boisz sie babelkow?");
    }
    //Serio? pan odpusci naprawde nie ma co sprawdzac
}
