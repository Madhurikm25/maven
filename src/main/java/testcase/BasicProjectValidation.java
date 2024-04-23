package testcase;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


class BasicProjectValidation extends Base{


    @Test
    public void PageTitle()
    {

        String Expectedurl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(Expectedurl, actualUrl, "mismatch in the url");


    }
}
