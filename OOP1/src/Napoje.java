public abstract class Napoje {
        String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    protected Napoje() {
    }

    abstract void pij();
}
