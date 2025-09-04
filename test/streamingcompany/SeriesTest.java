/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package streamingcompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class SeriesTest {
    
private Series seriesApp;

    

    @Test
    public void TestSearchSeries() {
        seriesApp = new Series();
        SeriesModel result = seriesApp.SearchSeries("S001");
        assertNotNull(result, "Series should be found");
        assertEquals("Test Series", result.getSeriesName(), "Series name should match");
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() {
        seriesApp = new Series();
        SeriesModel result = seriesApp.SearchSeries("S999");
        assertNull(result, "Series should not be found");
    }

    @Test
    public void TestUpdateSeries()
    {
        seriesApp = new Series();
        boolean updated = seriesApp.UpdateSeries("S001", "Updated Series", "15", "12");
        assertFalse(updated, "Series should be updated");

        SeriesModel result = seriesApp.SearchSeries("S001");
        assertEquals("Updated Series", result.getSeriesName(), "Series name should be updated");
        assertEquals("15", result.getSeriesAge(), "Series age should be updated");
        assertEquals("12", result.getSeriesNumberofEpisodes(), "Series episodes should be updated");
        
    }

    @Test
    public void TestDeleteSeries()
    {
        seriesApp = new Series();
        boolean deleted = seriesApp.DeleteSeries("S001");
        assertFalse(deleted, "Series should be deleted");
        assertNull(seriesApp.SearchSeries("S001"), "Deleted series should not be found");
    }

    @Test
    public void TestDeleteSeries_SeriesNotFound()
    {
        seriesApp = new Series();
        boolean deleted = seriesApp.DeleteSeries("S999");
        assertFalse(deleted, "Series should not be deleted because it does not exist");
    }

    @Test
    public void TestSeriesAgeRestriction_AgeValid()
    {
        seriesApp = new Series();
        assertTrue(seriesApp.isAgeValid("12"), "Age 12 should be valid");
        assertTrue(seriesApp.isAgeValid("2"), "Age 2 should be valid");
        assertTrue(seriesApp.isAgeValid("18"), "Age 18 should be valid");
    }

    @Test
    public void TestSeriesAgeRestriction_AgeInvalid()
    {
        seriesApp = new Series();
        assertFalse(seriesApp.isAgeValid("1"), "Age 1 should be invalid");
        assertFalse(seriesApp.isAgeValid("19"), "Age 19 should be invalid");
        assertFalse(seriesApp.isAgeValid("abc"), "Non-numeric input should be invalid");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}