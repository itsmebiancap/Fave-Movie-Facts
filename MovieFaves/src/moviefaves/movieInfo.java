/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviefaves;


/**
 *
 * @author Bebe
 */
public class movieInfo {

   
    /**
     *
     */
    public String name;
    private String title;
    private String movieTitle;
    private String rating;
    private String year;
    private String runTime;

    /**
     *
     * @param name
     * @param movieTitle
     * @param rating
     * @param year
     * @param runTime
     */
    public movieInfo(String name, String movieTitle, String rating,String year, String runTime)
    {
        this.name= name;
        this.movieTitle = title;
        this.rating = rating;
        this.year = year;
        this.runTime = runTime;
    }
       //add get and set to allow the information to be pulled

    // movieInfo(String movieTitle, String rating, String year, String runTime) {
 
    
    public String getMovieTitle()
    {
        return movieTitle;
    }
    public void setmovieTitle(String value)
    {
        movieTitle = value;
    }
    public String getrating()
    {
        return rating;
    }
    public void setRating(String value)
    {
        rating = value;
    }
    public String getYear()
    {
      return year;
    }
    public void setYear(String value)
    {
        year = value;
    }
    public String geRunTime()
    {
        return runTime;
    }
    public void setRunTime(String value)
    {
        runTime = value;
        
     }
   
}
