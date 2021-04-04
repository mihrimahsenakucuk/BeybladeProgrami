public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar= kutsalCanavar;
        this.gizliYetenek= gizliYetenek;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();


        System.out.println("Canavar adı: " + kutsalCanavar);
        System.out.println("Gizli yetenek: " + gizliYetenek);

    }


    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " i ortaya çıkarıyor.");
        System.out.println(getBeybladeci() + "in Saldırısı: Hayalet Kasırgası");
    }











}
