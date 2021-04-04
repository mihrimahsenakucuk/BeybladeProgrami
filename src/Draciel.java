public class Draciel extends Beyblade {

    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {

        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar= kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Canavar adı: " + kutsalCanavar);

    }


    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + "in Savunması: Kale Savunması");
    }





}
