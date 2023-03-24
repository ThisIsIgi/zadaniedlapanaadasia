public class Gaz extends Napoje {
    Float cena;
    String typ;

    public Gaz(String nazwa, Float cena, String typ) {
        super(nazwa);
        this.cena = cena;
        this.typ = typ;
    }

    @Override
    void pij() {
        System.out.println("nie boisz sie babelkow");

                //Serio? pan odpusci naprawde nie ma co sprawdzac
    }
}
