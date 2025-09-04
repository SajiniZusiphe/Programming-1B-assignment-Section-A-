/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamingcompany;

/**
 *
 * @author lab_services_student
 */
public class SeriesModel 
{
    
 private String SeriesID;
 private String SeriesName;
 private String SeriesAge;
 private String SeriesNumberOfEpisodes;
 
 
 // SET METHODS
 public void setSeriesID(String seriesid)
 {
   this.SeriesID = seriesid; 
 }
 public void setSeriesName(String seriesname)
 {
   this.SeriesName= seriesname; 
 }
 public void setSeriesAge(String seriesage)
 {
   this.SeriesAge = seriesage; 
 }
 public void setSeriesNumberofEpisodes(String seriesnumofepisodes)
 {
   this.SeriesNumberOfEpisodes = seriesnumofepisodes; 
 }
 
 // GET METHODS
 public String getSeriesID()
 {
    return SeriesID; 
 }
 public String getSeriesName()
 {
    return SeriesName; 
 }
  public String getSeriesAge()
 {
    return SeriesAge; 
 }
  public String getSeriesNumberofEpisodes()
 {
    return SeriesNumberOfEpisodes; 
 }
 
  
public String toString() {
return "SERIES ID: " + SeriesID +
                "\nSERIES NAME: " + SeriesName +
                "\nSERIES AGE: " + SeriesAge +
                "\nNUMBER OF EPISODES: " + SeriesNumberOfEpisodes;
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    
}
