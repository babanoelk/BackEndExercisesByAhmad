package week3.fridayReview;

import jakarta.persistence.*;

@Entity //For at fortælle java, at den her kommer til at repræsentere en tabel i en database.
@Table(name = "persons") //Navnet på tabellen i databasen.
public class Person {

    // Unique identifier for the person entity in the database
    @Id // Indicates this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies auto-increment strategy for the primary key
    @Column(name = "id") // Specifies column name in the database table
    private int id; // Unique identifier of the person in java

}
