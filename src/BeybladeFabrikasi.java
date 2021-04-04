public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beyblade_turu) {

        if(beyblade_turu.equals("Dragon")) {

            return new Dragon("Takao" , 800, 300,"Mavi Ejderha" , "Kutsal Canavarla Konuşma");

        }else if(beyblade_turu.equals("Dranza")) {

            return new Dragon("Kai" , 600, 400, "Kırmızı Anka Kuşu", "");

        }else if(beyblade_turu.equals("Drayga")) {

            return new Dragon("Rei" , 800, 250, "Beyaz Kaplan", "");

        }else if(beyblade_turu.equals("Draciel")) {

            return new Dragon("Max" , 400, 1000,"Kara Kaplumbağa", "");

        }else {
            return null;
        }



    }


}
