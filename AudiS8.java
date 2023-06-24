public class AudiS8 extends Jarmu{

    private boolean lezerblokkolo;
    private int rendszam;
    private int aktualisRendszam;

    private int speed;

    public AudiS8(int sebesseg, int rendszam, boolean lezerblokkolo, int rendszam1, int aktualisRendszam, int speed) {
        super(sebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
        this.rendszam = rendszam1;
        this.aktualisRendszam = aktualisRendszam;
        this.speed = speed;
    }

    public boolean gyorshajtottE(int sebKorlat){
        if(this.lezerblokkolo = true){
            return false;
        } else if (sebKorlat<this.speed) {
            return true;
        }
    }
}
