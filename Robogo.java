public class Robogo extends Jarmu implements KisGepjarmu {

    private int maximálissebesség;
    private int aktualisSebesseg;

    private String rendszam;

    public Robogo(int sebesseg, int rendszam, int maximálissebesség, int aktualisSebesseg, String rendszam1) {
        super(sebesseg, rendszam);
        this.maximálissebesség = maximálissebesség;
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam1;
    }

    public int getMaximálissebesség() {
        return maximálissebesség;
    }

    public void setMaximálissebesség(int maximálissebesség) {
        this.maximálissebesség = maximálissebesség;
    }

    public int getAktualisSebesseg() {
        return aktualisSebesseg;
    }

    public void setAktualisSebesseg(int aktualisSebesseg) {
        this.aktualisSebesseg = aktualisSebesseg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public boolean gyorshajtottE(int sebessegkorlat) {
        return getAktualisSebesseg() > sebessegkorlat;

    }
}
