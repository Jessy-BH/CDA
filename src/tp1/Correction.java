package tp1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Correction {

    
    public static void main(String[] args) {
    
        System.out.println("Mes Exercices :");
        //exo1();
        //exo2();
        dateToString();
        stringToDate();
        try {
            stringToDate2();
        } catch (ParseException e) {
            System.out.println("Format de date incorrect");
            e.printStackTrace();
        }
    }

    public static void exo1() {
        hello();    
    }
    
    public static void exo2() {
        int i = 1;
        System.out.println("i = " + i);
        i = i + 1;
        System.out.println("i = " + i);
    }
    
    public static void hello() {
        System.out.println("Hello");
    }
    
    public static void dateToString() {
        Date ceJour = new Date();
        System.out.println(ceJour);
        // On est obliger de mettre 'h' entre quotes
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yy H'h'mm");
        // H : 15
        // h : 3
        // hh : 03
        String resultat = formater.format(ceJour);
        System.out.println(resultat);    
    }
    
    /**
     * On l'attrape
     */
    public static void stringToDate() {
        String date_saisie ="11/11/2011";
        // TODO Transform in date
        
        SimpleDateFormat formatteur = new SimpleDateFormat("dd/MM/yyyy");
        
        Date resultat = null;
        
        try {
            resultat = formatteur.parse(date_saisie);
        }catch (ParseException error)
        {
            System.out.println("Format de date incorrect.");
            System.err.println(error.getMessage());
        }

        System.out.println(resultat);
    }
    
    /**
     * On laisse passer
     * @throws ParseException
     */
    public static void stringToDate2() throws ParseException {
        String date_saisie = "11/11/2011";
        // TODO Transform in date
        
        SimpleDateFormat formatteur = new SimpleDateFormat("dd-MM-yyyy");    
        Date resultat = formatteur.parse(date_saisie);
        System.out.println(resultat);
    }
    
    
    public static void changeFormat() {
        try {
            String date_saisie = "11/11/2011";
            // TODO Change format to dd-mm-yyyy
        
            SimpleDateFormat format_saisie = new SimpleDateFormat("dd/MM/YYYY");
            Date date_temp = format_saisie.parse(date_saisie);
            
            SimpleDateFormat format_affichage = new SimpleDateFormat("dd-MM-YYYY");
            String resultat = format_affichage.format(date_temp);
            System.out.println(resultat);
            
        
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
}