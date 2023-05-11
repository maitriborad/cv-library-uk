package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "selection")
    public Object[][] getData(){
        Object[][] data=new Object[][]{
                {"Tester", "Harrow,Greater London","5 miles", "30000", "50000", "Per annum", "Permanent","Permanent Tester jobs in Harrow"},
                {"Test manager","London","50 miles","3000","5000","Per month","Contract","Contract Test Manager jobs in London"},
                {"Business analyst","Birmingham","5 miles","20","50","Per hour","Temporary","Temporary Business Analyst jobs in Birmingham"},
                {"Quality Assurance","United Kingdom","75 miles","2000","6000","Per month","Permanent","Permanent Quality Assurance jobs"},
                {"Scrum Master","London","7 miles","45000","60000","Per annum","Permanent","Permanent Scrum Master jobs in London"},
                {"Tester","Manchester","25 miles","2000","5000","Per month","Contract","Contract Tester jobs in Manchester"}
        };
        return data;
    }
}
