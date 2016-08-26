/**
 * Created by prabhath on 8/26/16.
 */

import java.util.*;

class Doctor{

    private String name;
    private String specialization;
    private double rating;
    private String location;

    public Doctor(String name, String specialization, double rating, String location){
        this.name=  name;
        this.specialization = specialization;
        this.rating = rating;
        this.location = location;
    }

    public String toString(){
        return name + " - " + specialization + " - " + rating + " - " + location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

public class Doctors {

    /*
    * Since i don't have any data i am creating some for testing.
     */

    public ArrayList<Doctor> getDoctors(){

        Doctor d = new Doctor("Doctor1", "Allergy & Immunology", 4.5, "Santa Clara");
        Doctor d1 = new Doctor("Doctor2", "Allergy & Immunology", 4, "Santa Clara");
        Doctor d2 = new Doctor("Doctor3", "Allergy & Immunology", 2, "Santa Clara");
        Doctor d3 = new Doctor("Doctor4", "Allergy & Immunology", 4.5, "Sunnyvale");
        Doctor d4 = new Doctor("Doctor5", "Clinical Psychology", 4.5, "Sunnyvale");
        Doctor d5 = new Doctor("Doctor6", "Clinical Psychology", 2, "Sunnyvale");
        Doctor d6 = new Doctor("Doctor7", "Clinical Psychology", 3, "SFO");
        Doctor d7 = new Doctor("Doctor8", "Gastroenterology", 5, "SFO");
        Doctor d8 = new Doctor("Doctor9", "Gynecology", 3, "Berkeley");
        Doctor d9 = new Doctor("Doctor10", "Microsurgery", 3, "mountain view");
        Doctor d10 = new Doctor("Doctor11", "Microsurgery", 3, "mountain view");

        ArrayList<Doctor> docs = new ArrayList<Doctor>(Arrays.asList(d, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10));

        return docs;
    }

}
