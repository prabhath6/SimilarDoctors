/**
 * Created by prabhath on 8/26/16.
 */

import junit.framework.*;
import org.junit.Test;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;

public class SimilarDoctorsTest extends TestCase {

    public void testEqualOrBetterDoctors() {
        SimilarDoctors sm = new SimilarDoctors();

        ArrayList<Doctor> result = sm.equalOrBetterDoctors("Doctor1", 4.0);
        ArrayList<Double> ratings = new ArrayList<Double>();
        ArrayList<String> Specialization = new ArrayList<String>();

        for(Doctor d: result){
            ratings.add(d.getRating());
            Specialization.add(d.getSpecialization());
        }

        assertThat(ratings, everyItem(greaterThanOrEqualTo(4.0)));
        assertThat(Specialization, everyItem(equalTo("Allergy & Immunology")));
    }

    @Test
    public void testGetSimilarDoctors() {
        SimilarDoctors sm = new SimilarDoctors();

        ArrayList<Doctor> result = sm.getSimilarDoctors("Doctor6");
        ArrayList<String> Specialization = new ArrayList<String>();

        for(Doctor d: result){
            Specialization.add(d.getSpecialization());
        }

        assertThat(Specialization, everyItem(equalTo("Clinical Psychology")));
    }


    public void testEqualOrBetterDoctorsLocation() {
        SimilarDoctors sm = new SimilarDoctors();

        ArrayList<Doctor> result = sm.equalOrBetterDoctorsLocation("Doctor10", "Microsurgery", 3);
        ArrayList<Double> ratings = new ArrayList<Double>();
        ArrayList<String> Specialization = new ArrayList<String>();
        ArrayList<String> location = new ArrayList<String>();

        for(Doctor d: result){
            ratings.add(d.getRating());
            Specialization.add(d.getSpecialization());
            location.add(d.getLocation());
        }

        assertThat(location, everyItem(equalTo("mountain view")));
        assertThat(ratings, everyItem(greaterThanOrEqualTo(4.0)));
        assertThat(Specialization, everyItem(equalTo("Microsurgery")));

    }


}
