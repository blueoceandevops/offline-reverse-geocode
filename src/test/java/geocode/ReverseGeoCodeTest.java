package geocode;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by indra.basak on 10/13/16.
 */
public class ReverseGeoCodeTest {

    public static void main(String[] args) throws IOException {
        InputStream in = ReverseGeoCodeTest.class.getResourceAsStream("/allCountries.txt");
//        ReverseGeoCode reverseGeoCode =
//                new ReverseGeoCode(new FileInputStream("allCountries.txt"),
//                        true);

        ReverseGeoCode reverseGeoCode = new ReverseGeoCode(in, true);

        System.out.println(
                "Nearest to -23.456, 123.456 is " + reverseGeoCode.nearestPlace(
                        -23.456, 123.456));

        System.out.println(
                "Nearest to 51.5032520, -0.1278990 is " + reverseGeoCode.nearestPlace(
                        51.5032520, -0.1278990));

        GeoName name3 = reverseGeoCode.nearestPlace(
                45.3628510,-122.6419330);

        System.out.println(
                "Nearest to 45.3628510,-122.6419330 is " + name3.name + ", " + name3.majorPlace + ", " + name3.country);
        System.out.println(name3.data);
    }
}
