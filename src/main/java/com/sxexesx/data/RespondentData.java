package com.sxexesx.data;

import com.sxexesx.model.Car;
import com.sxexesx.model.Household;
import com.sxexesx.model.MobileBrand;
import com.sxexesx.model.Respondent;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RespondentData {

    public static List<Respondent> getExample1Data() {
        return Arrays.asList(
                new Respondent(1, "male"),
                new Respondent(2, "female")
        );
    }

    public static List<Respondent> getExample2Data() {
        return Arrays.asList(
                new Respondent(1, "male", true),
                new Respondent(2, "female", false),
                new Respondent(2, "female", true)
        );
    }

    public static List<Respondent> getExample3Data() {
        return Arrays.asList(
                new Respondent(1, "male", false, 18),
                new Respondent(2, "female", true, 66),
                new Respondent(3, "male", true, 14),
                new Respondent(4, "female", true, 13),
                new Respondent(5, "male", true, 28),
                new Respondent(6, "female", true, 56)
        );
    }

    public static List<Respondent> getExample4Data() {
        return Arrays.asList(
                new Respondent(1, "male", 14, Arrays.asList("cat", "dog", "fish")),
                new Respondent(2, "female", 38, Collections.singletonList("cat")),
                new Respondent(3, "male", 56, Collections.singletonList("dog")),
                new Respondent(4, "female", 44, Collections.emptyList()),
                new Respondent(4, "female", 8, Collections.singletonList("cat"))
        );
    }

    public static List<Respondent> getExample5Data() {
        return Arrays.asList(
                new Respondent(1, 38, "MSK"),
                new Respondent(2, 16, "NIG"),
                new Respondent(3, 60, "OMS"),
                new Respondent(4, 41, "VLD")
        );
    }

    public static List<Respondent> getExample6Data() {
        return Arrays.asList(
                new Respondent(1, Collections.singletonList("MOBILE")),
                new Respondent(2, Arrays.asList("COMPUTER", "LAPTOP", "MOBILE", "TV")),
                new Respondent(3, Arrays.asList("LAPTOP", "MOBILE")),
                new Respondent(4, Collections.singletonList("MOBILE"))
        );
    }

    public static List<Respondent> getExample7Data() {
        return Arrays.asList(
                new Respondent(1, new HashMap<String, String>() {{
                    put("EDUCATION", "University");
                }}),
                new Respondent(2, new HashMap<String, String>() {{
                    put("EDUCATION", "School");
                }}),
                new Respondent(3, new HashMap<String, String>() {{
                    put("EDUCATION", "College");
                }}),
                new Respondent(4, new HashMap<String, String>() {{
                    put("EDUCATION", "No_info");
                }})
        );
    }

    public static List<Respondent> getExample8Data() {
        return Arrays.asList(
                new Respondent(1, new Car(1, "Toyota", "Camry", 2010)),
                new Respondent(2, new Car(1, "Mazda", "RX-7", 1995)),
                new Respondent(3, new Car(1, "Land Rover", "DISCOVERY", 2008)),
                new Respondent(4, new Car(1, "Tesla", "Model X", 2020))
        );
    }

    public static List<Respondent> getExample9Data() {
        return Arrays.asList(
                new Respondent(1, MobileBrand.XIAOMI),
                new Respondent(2, MobileBrand.SAMSUNG),
                new Respondent(3, MobileBrand.HUAWEI),
                new Respondent(4, MobileBrand.APPLE)
        );
    }

    public static List<Respondent> getExample10Data() {
        return Arrays.asList(
                new Respondent(1,
                        new Household(100, new HashMap<String, String[]>() {{
                            put("TVDevices", new String[]{"Nintendo", "PlayStation"});
                        }})
                ),
                new Respondent(2,
                        new Household(200, new HashMap<String, String[]>() {{
                            put("TVDevices", new String[]{"Chromecast", "VHS Player"});
                        }})
                ),
                new Respondent(3,
                        new Household(300, new HashMap<String, String[]>() {{
                            put("TVDevices", new String[]{});
                        }})
                ),
                new Respondent(4,
                        new Household(400, new HashMap<String, String[]>() {{
                            put("TVDevices", new String[]{"XBox", "PlayStation"});
                        }})
                ));
    }

    public static List<Respondent> getExample11Data() {
        return Arrays.asList(
                new Respondent(1, true, 56),
                new Respondent(2, true, 150),
                new Respondent(3, true, -10)
        );
    }

}
