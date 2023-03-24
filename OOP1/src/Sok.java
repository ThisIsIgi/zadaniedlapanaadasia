public class Sok extends Napoje{

    public Float cena;
    public   String typ;

    public Sok(String nazwa, Float cena, String typ) {
        super(nazwa);
        this.cena = cena;
        this.typ = typ;
    }


    @Override
    void pij() {
        System.out.println("Smakowa waiacik");
    }
}
