
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Produit p1 = new Produit();


        System.out.println("id :" + p1.getIdentifiant());
        System.out.println("marque :" + p1.getMarque());

        System.out.println("libelle :" + p1.getLibelle());
        System.out.println("prix :" + p1.getPrix());

        Produit p2 = new Produit(1021, "Delice", "Lait");
        System.out.println("id :" + p2.getIdentifiant());
        System.out.println("marque :" + p2.getMarque());

        System.out.println("libelle :" + p2.getLibelle());
        System.out.println("prix :" + p2.getPrix());

        Produit p3 = new Produit(2510, "Vitalait", "Yaourt");
        Produit p4 = new Produit(3250, "Sicam", "Tomate", 1.2f);

        p3.setPrix(-500);
        System.out.println("test de la méthode affiche");
        p2.afficher();
        p4.afficher();
        System.out.println("to String p2");
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println("to String p3");
        System.out.println(p3.toString());
        System.out.println(p3);

        Date d1 = new Date();

        p3.setDate_exp(d1);

        Produit p5 = new Produit(1, "Delice", "YAourt", d1);
        System.out.println("Après modification de date");
        p5.afficher();
        System.out.println(p5);
        System.out.println(p5.getDate_exp());


        System.out.println(p3);

        Magasin m1 = new Magasin();

        Magasin m2 = new Magasin(1, "ariana");

        m2.ajouter(p1);
        m2.ajouter(p2);

        m1.ajouter(p2);

        System.out.println("Total des produits" + Magasin.getTotalProduit());

        m2.ajouter(p3);
        System.out.println("Total des produits" + Magasin.getTotalProduit());


        m2.afficherLibellePr();

        m1.afficherLibellePr();


        System.out.println(p5.comparer(p2));


        System.out.println(Produit.comparer(p3, p5));


        m2.ajouter(p1);

        System.out.println(m1.plusProduit(m2));

        System.out.println(Magasin.plusProduit(m1, m2));
        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");

        Employe caissier1 = new Caissier(1, "ahmed", "Adresse1", 160, "Caisse1");
        Employe vendeur1 = new Vendeur(2, "rihab", "Adresse2", 160, 0.1);
        Employe responsable1 = new Responsable(3, "mayssa", "Adresse3", 160, 500);

        Employe caissier2 = new Caissier(4, "Aya", "Adresse4", 160, "Caisse2");
        Employe vendeur2_1 = new Vendeur(5, "Elaa", "Adresse5", 160, 0.12);
        Employe vendeur2_2 = new Vendeur(6, "May", "Adresse6", 160, 0.15);
        Employe vendeur2_3 = new Vendeur(7, "sss", "Adresse7", 160, 0.11);
        Employe responsable2 = new Responsable(8, "cddr", "Adresse8", 160, 600);

        System.out.println(caissier1.getNom() + " : " + ((Caissier) caissier1).getNumeroDeCaisse());
        System.out.println(vendeur1.getNom() + " : " + ((Vendeur) vendeur1).getTauxDeVente());
        System.out.println(responsable1.getNom() + " : " + ((Responsable) responsable1).getPrime());

        System.out.println(caissier2.getNom() + " : " + ((Caissier) caissier2).getNumeroDeCaisse());
        System.out.println(vendeur2_1.getNom() + " : " + ((Vendeur) vendeur2_1).getTauxDeVente());
        System.out.println(vendeur2_2.getNom() + " : " + ((Vendeur) vendeur2_2).getTauxDeVente());
        System.out.println(vendeur2_3.getNom() + " : " + ((Vendeur) vendeur2_3).getTauxDeVente());
        System.out.println(responsable2.getNom() + " : " + ((Responsable) responsable2).getPrime());
        Produit produit1 = new Produit(1, "Marque1", "Libelle1", new Date());
        Produit produit2 = new Produit(2, "Marque2", "Libelle2", new Date());
        Produit produit3 = new Produit(3, "Marque3", "Libelle3", new Date());

        magasin1.ajouter(produit1);
        magasin1.ajouter(produit2);

        magasin2.ajouter(produit3);

        System.out.println("Détails du magasin 1 :");
        System.out.println(magasin1.toString());

        System.out.println("Détails du magasin 2 :");
        System.out.println(magasin2.toString());


    }}