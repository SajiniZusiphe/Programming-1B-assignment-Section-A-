/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamingcompany;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class StreamingCompany 
{

   
public static void main(String[] args) 
{
  
 Scanner scanner = new Scanner(System.in);
 Series input = new Series(); // object for series class

 System.out.println("LATEST SERIES - 2025");
 System.out.println("*******************************");
 System.out.print("Enter (1) to launch menu or any other key to exit: ");
 String choice = scanner.nextLine();

 if (!choice.equals("1")) 
 {
 System.out.println("Application exited.");
 return;
 }
 
 
 while (true) 
 {
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Capture a new series.");
            System.out.println("(2) Search for a series.");
            System.out.println("(3) Update series age restriction.");
            System.out.println("(4) Delete a series.");
            System.out.println("(5) Print series report - 2025");
            System.out.println("(6) Exit Application.");

            System.out.print("Enter choice: ");
            String option = scanner.nextLine();
            

switch(option){

case "1": 
System.out.println("Enter Series ID: ");
String ID = scanner.nextLine();
System.out.println("Enter Series Name: ");
String Name = scanner.nextLine();
String age;
do 
{
System.out.println("Enter Series Age (2–18): ");
age = scanner.nextLine();
if (!input.isAgeValid(age)) //ask for help
{
System.out.println("Invalid age, try again!");
}
} while (!input.isAgeValid(age));

System.out.println("Enter Number of Episodes: ");
String episodes = scanner.nextLine();

SeriesModel model = new SeriesModel(); // object for seriesmodel class
                    model.setSeriesID(ID);
                    model.setSeriesName(Name);
                    model.setSeriesAge(age);
                    model.setSeriesNumberofEpisodes(episodes);

                    input.addSeries(model);
                    System.out.println("Series added successfully!");
                    break;


case "2":
System.out.println("Enter Series ID to search: ");
String searchId = scanner.nextLine();
SeriesModel result = input.SearchSeries(searchId);
if (result != null)
{
System.out.println(result);
} else 
 {
System.out.println("Series with ID " + searchId + " not found.");
 } break;


case "3":
System.out.println("Enter Series ID to update: ");
String updateId = scanner.nextLine();
System.out.println("Enter New Name: ");
String newName = scanner.nextLine();
System.out.println("Enter New Age (2–18): ");
String newAge = scanner.nextLine();
System.out.println("Enter New Number of Episodes: ");
String newEpisodes = scanner.nextLine();

if (input.UpdateSeries(updateId, newName, newAge, newEpisodes))
{
System.out.println("Series updated successfully!");
} else
 {
System.out.println("Series not found!");
 } break;


case "4":
System.out.println("Enter Series ID to delete: ");
String deleteId = scanner.nextLine();
if (input.DeleteSeries(deleteId))
{
System.out.println("Series deleted successfully!");
} else 
 {
System.out.println("Series not found!");
 } break;


case "5":
System.out.println(input.SeriesReport());
break;


case "6":
System.out.println("Exiting Application. Goodbye!");
return;

default:
System.out.println("Invalid option. Try again.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}


}
}
