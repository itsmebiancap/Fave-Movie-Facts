/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviefaves;

import java.util.Scanner;

/**
 *
 * @author Bebe
 */
public class MovieFaves {

    
    public static void main(String[] args) {
        // get movie name, rating, year and runtime 
        // print it out using a two string method
    
    //declare variable that connects both classes together
    Scanner input = new Scanner(System.in);

    //movieInfo favoriteMovie;
    
    //ask for user's name
    System.out.println("Hi, what is your name?");
    String name = input.nextLine();
     
    //gather information from user
    System.out.println(name + " ,we need to gather some information from you..." 
                        + " as to find out what is your favorite movie.");
    
    //fave movie
    System.out.println(name + ", what is the name of your favorite movie?");
    String movieTitle = input.nextLine();            
      
    
    
    
    
    //movie rating
    System.out.println(name + ", what was the rating for " + movieTitle + " ?");
    String rating = input.nextLine();
    
    //movie year
    System.out.println(name + ", what year did " + movieTitle + " come out?");
    String year =input.nextLine();    
    
    //movie runtime
    System.out.println(name + ", what was " + movieTitle + " runtime?");
    String runTime =input.nextLine();
    
        //wrapping it all together
    System.out.println(name + ", here are the results: " + " \n Movie Title: " +
            movieTitle + "\n Rating: " + rating + " \n Release Year: " + year +
            "\n Movie Runtime: " + runTime);
}
}
