public class Beyblade {

    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci= beybladeci;
        this.donusHizi= donusHizi;
        this.saldiriGucu= saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBaybladeci(String beybladeci) {
        this.beybladeci= beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi= donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void saldir() {

        System.out.println(beybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile saldırıyor.") ;
    }


    public void bilgileriGoster() {

        System.out.println("Berbladeci ismi: " + beybladeci);
        System.out.println("Saldırı gücü: " + saldiriGucu);
        System.out.println("Dönüş hızı: " + donusHizi);
    }

    public void kutsalCanavarOrtayaCikar() {

        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor");
    }






}

