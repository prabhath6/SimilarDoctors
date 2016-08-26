# SimilarDoctors

### Similar Doctors are obtained in three ways.

1. Based on same Specialization and equal or better ratings.
2. Based on same Specialization, equal or better ratings and location specific.
3. Based on Specialization.

##### Explanation

Since No data is provided I created a sample data, Which is used to create the application
and test it.

#### Features of Doctor

1. Name
2. Specialization
3. Rating
4. Location

#### Options to get similar doctors

1. **Based on same Specialization and equal or better ratings.**

        public ArrayList<Doctor> equalOrBetterDoctors(String doctorName, double doctorRating)

    It used to get similar doctors with the same Specialization and have rating equals to or greater than
    specified *doctorRating*.

2. **Based on same Specialization, equal or better ratings and location specific.**

        public ArrayList<Doctor> equalOrBetterDoctorsLocation(String doctorName, String location, double doctorRating)

    It used to get similar doctors with the same Specialization, have rating equals to or greater than
    specified *doctorRating* and location equals to specified *location* .

3. **Based on Specialization.**

        public ArrayList<Doctor> getSimilarDoctors(String doctorName)

    It used to get similar doctors with the same Specialization irrespective of rating and location.
    
#### Testing

I have used junit and hamcrest matchers to test the business logic. Used to test all the three methods.
Hamcrest matchers are used to check every element of the returned result.

#### Future Scope

If more time was given then, i could have searched for better data and created a database with it. Working with database 
would have simplified as we can use order by and group by to get similar doctors from database.
