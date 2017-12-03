package io.refdata.iso.country;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CountryCodeTest {

    public final static int EXPECTED_NUMBER_OF_ISO_COUNTRY_CODES = 249;
    public final static int EXPECTED_NUMBER_OF_SOVEREIGN_STATES = 194;

    @Test
    public void testNumberOfCountryCodes() {
        assertEquals(EXPECTED_NUMBER_OF_ISO_COUNTRY_CODES, CountryCode.values().length);
    }

    @Test
    public void testFirstCountryCode() {
        testCountryCode(CountryCode.values()[0], "AFGHANISTAN", "AF", "AFG", "Afghanistan", "Afghanistan (l')", 4, true);
    }

    @Test
    public void testLastCountryCode() {
        testCountryCode(CountryCode.values()[CountryCode.values().length-1], "ZIMBABWE", "ZW", "ZWE", "Zimbabwe", "Zimbabwe (le)", 716, true);
    }

    @Test
    public void testNumberOfSovereignStates(){
        assertEquals( EXPECTED_NUMBER_OF_SOVEREIGN_STATES,
                Arrays.stream( CountryCode.values() )
                        .filter(e -> e.isIndependant())
                        .count());
    }

    // Utility method that encapsulates all the CountryCode checks
    private void testCountryCode(final CountryCode countryCode, final String expectedName, final String expectedAlpha2Code, final String expectedAlpha3Code, final String expectedShortNameEN, final String expectedShortNameFR, final int expectedNumericCode, final boolean expectedIsIndependant) {
        assertEquals(expectedName, countryCode.getName());
        assertEquals(expectedAlpha2Code, countryCode.getAlpha2Code());
        assertEquals(expectedAlpha3Code, countryCode.getAlpha3Code());
        assertEquals(expectedShortNameEN, countryCode.getShortNameEN());
        assertEquals(expectedShortNameFR, countryCode.getShortNameFR());
        assertEquals(expectedNumericCode, countryCode.getNumericCode());
        assertEquals(expectedIsIndependant,countryCode.isIndependant());
    }

}
