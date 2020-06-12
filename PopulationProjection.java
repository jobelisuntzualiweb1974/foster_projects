
package populationprojection;

/**
 * Chapter 1 Exercise 1.11
 *      (Population projection) The U.S Census Bureau projects population based on the following assumptions:
 *              - One birth every 7 seconds
 *              - One death every 13 seconds
 *              - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 * 
 * @author adrianfoster
 * 04/25/2020
 */
public class PopulationProjection {

    public static void main(String[] args) {
        
        double birthRateInSeconds = 7.0; //One birth every 7 seconds
        double deathRateInSeconds = 13.0; //One death every 13 seconds;
        double newImmigrantsInSeconds = 45.0; //One new immigrant every 45 seconds
        
        double currentPopulation = 312032486; //Current population;
        
        double secondsInYears = 60 * 60 * 24 * 365; //Total seconds in a year
        
        double numBirths = secondsInYears / birthRateInSeconds; //Total number of births per year
        double numDeaths = secondsInYears / deathRateInSeconds; //Total number of deaths per year
        double numImmigrants = secondsInYears / newImmigrantsInSeconds; //Total number of immigrants per year
        
        for (int i = 1; 1 <= 5; i++)  {
        currentPopulation += numBirths + numImmigrants - numDeaths;
        System.out.println("The current population after year five is: " + (int)currentPopulation);
        
        }  
        
    }
    
}
