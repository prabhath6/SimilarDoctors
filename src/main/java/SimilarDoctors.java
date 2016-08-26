/**
 * Created by prabhath on 8/26/16.
 */

import java.util.*;

public class SimilarDoctors {

    private static ArrayList<Doctor> doctorsList = null;

    public static void allDoctors(){
        Doctors doc = new Doctors();
        SimilarDoctors.doctorsList = doc.getDoctors();
    }

    // doctor name, ratting
    public SimilarDoctors(){
        SimilarDoctors.allDoctors();
    }

    public ArrayList<Doctor> equalOrBetterDoctors(String doctorName, double doctorRating){

        ArrayList<Doctor> result = new ArrayList<Doctor>();
        String occupation = "";

        for (Doctor d: SimilarDoctors.doctorsList){
            if(d.getName().equals(doctorName)){
                occupation = d.getSpecialization();
            }
        }

        if (!occupation.equals("")){
            for (Doctor d: SimilarDoctors.doctorsList){
                if(!d.getName().equals(doctorName)
                        && d.getSpecialization().equals(occupation)
                        && d.getRating() >= doctorRating){
                    result.add(d);
                }
            }
        } else {
            return result;
        }
        return result;
    }


    public ArrayList<Doctor> equalOrBetterDoctorsLocation(String doctorName, String location, double doctorRating){

        ArrayList<Doctor> result = new ArrayList<Doctor>();
        String occupation = "";

        for (Doctor d: SimilarDoctors.doctorsList){
            if(d.getName().equals(doctorName)){
                occupation = d.getSpecialization();
            }
        }

        if (!occupation.equals("")){
            for (Doctor d: SimilarDoctors.doctorsList){
                if(!d.getName().equals(doctorName)
                        && d.getSpecialization().equals(occupation)
                        && d.getRating() >= doctorRating && d.getLocation().equals(location)){
                    result.add(d);
                }
            }
        } else {
            return result;
        }
        return result;
    }

    public ArrayList<Doctor> getSimilarDoctors(String doctorName){

        ArrayList<Doctor> result = new ArrayList<Doctor>();
        String occupation = "";

        for (Doctor d: SimilarDoctors.doctorsList){
            if(d.getName().equals(doctorName)){
                occupation = d.getSpecialization();
            }
        }

        if (!occupation.equals("")){
            for (Doctor d: SimilarDoctors.doctorsList){
                if(!d.getName().equals(doctorName) && d.getSpecialization().equals(occupation)) {
                    result.add(d);
                }
            }
        } else {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {

        SimilarDoctors sm = new SimilarDoctors();

        // based on doctor and ratting
        ArrayList<Doctor> dp =sm.equalOrBetterDoctors("Doctor1", 4);

        // based on doctor, location and ratting
        ArrayList<Doctor> dp1 =sm.equalOrBetterDoctorsLocation("Doctor1", "Santa Clara", 4);

        // based on doctor alone
        ArrayList<Doctor> dp2 =sm.getSimilarDoctors("Doctor9");

        for(Doctor ds: dp){
            System.out.println(ds);
        }
        System.out.println();

        for(Doctor ds: dp1){
            System.out.println(ds);
        }
        System.out.println();

        for(Doctor ds: dp2){
            System.out.println(ds);
        }

    }
}
