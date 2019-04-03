package sample;
import java.util.ArrayList;
public class Artikal {
    private String naziv;
    private Double cijena;
    private String sifra;

    private Artikal(String ulaz){
        String[] ulazi = ulaz.split(",");
        setSifra(ulazi[0]);
        setNaziv(ulazi[1]);
        setCijena(Double.parseDouble(ulazi[2]));

    }


    public Double getCijena() {
        return cijena;
    }

    void setCijena(double cijena) {
        this.cijena = cijena;
        if(cijena == null) {
            throw new IllegalArgumentException("Unijeli ste pogresnu cijenu");
        }
    }
     public Artikal() {
     }

     public String getSifra(){
        return sifra;
     }
    public void setSifra(String sifra) {
        this.sifra= sifra;
        if(sifra == null || sifra.isEmpty()){
            throw new IllegalArgumentException("Unijeli ste pogresnu sifru");
        }
    }

    public String getNaziv() {
        return naziv;
    }

    private void setNaziv(String s) {
        this.naziv = naziv;
        if(naziv == null || naziv.isEmpty()) {
            throw new IllegalArgumentException("Unijeli ste pogresan naziv");
        }
    }


@Override
    public String toString(){
        return sifra + ", " + naziv + ", " + cijena;
}

    @Override
    public boolean equals(Object o) {
        Artikal artikal =(Artikal)o;
        if(!this.sifra.equals(artikal.getSifra())) return false;
        if(!this.naziv.equals(artikal.getNaziv())) return false;
        if(this.cijena != (artikal.getCijena())) return false;
        return true;
    }
    public static ArrayList <Artikal> izbaciDuplikate(ArrayList<Artikal> lista){

        for(int i=0; i<lista.size(); i++){
            for(int j=0; j<lista.size(); j++){
                if(i!=j){
                    if(lista.get(i).equals(lista.get(j))){
                        lista.remove(j);
                    }
                }
            }
        }
        return lista;
    }
}
