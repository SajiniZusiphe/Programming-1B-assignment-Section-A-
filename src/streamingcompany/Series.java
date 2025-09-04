/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamingcompany;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class Series {
    
    

private ArrayList<SeriesModel> seriesList = new ArrayList<>();

// Add a series directly
public void addSeries(SeriesModel series)
{
seriesList.add(series);
}

// Search series by ID
public SeriesModel SearchSeries(String id)
{
for (int i = 0; i < seriesList.size(); i++)
{
if (seriesList.get(i).getSeriesID().equals(id))
{
return seriesList.get(i);
}
}
return null;
}

// Update series[used chatgpt]
public boolean UpdateSeries(String id, String newName, String newAge, String newEpisodes) 
{
for (int i = 0; i < seriesList.size(); i++) 
{
if (seriesList.get(i).getSeriesID().equals(id))
{
seriesList.get(i).setSeriesName(newName);
seriesList.get(i).setSeriesAge(newAge);
seriesList.get(i).setSeriesNumberofEpisodes(newEpisodes);
return true;
}
}
return false;
}

// Delete series[  used chatgpt]
public boolean DeleteSeries(String id)
{
for (int i = 0; i < seriesList.size(); i++) 
{
if (seriesList.get(i).getSeriesID().equals(id))
{
seriesList.remove(i);
return true;
}
}
return false;
}

// Validate age restriction
public boolean isAgeValid(String ageInput) {
    // Check if every character in the input is a digit
for (int i = 0; i < ageInput.length(); i++) {
if (!Character.isDigit(ageInput.charAt(i))) {
return false; 
        }
    }

    
    int ageNumber = Integer.parseInt(ageInput);
    return ageNumber >= 2 && ageNumber <= 18;
}
































public ArrayList<SeriesModel> getSeriesList()
{
return seriesList;
}

// Report
public String SeriesReport()
{
if (seriesList.isEmpty())
{
return "No series available to display.";
}
StringBuilder report = new StringBuilder();
for (int i = 0; i < seriesList.size(); i++) {
report.append("\nSeries ").append(i + 1).append("\n")
.append(seriesList.get(i).toString()).append("\n");
}
return report.toString();
}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

