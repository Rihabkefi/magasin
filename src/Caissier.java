public class Caissier extends Employe {
    private String numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbr_heures, String numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public String getNumeroDeCaisse() {
        return numeroDeCaisse;
    }
}
