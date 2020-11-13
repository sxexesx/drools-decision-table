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

    public static List<Respondent> getRespondentData() {
        return Arrays.asList(
                new Respondent(
                        1,
                        true,
                        "male",
                        18,
                        Arrays.asList("cat", "dog", "fish"),
                        "MSK",
                        Collections.singletonList("MOBILE"),
                        new HashMap<String, String>() {{
                            put("EDUCATION", "University");
                        }},
                        new Car(1, "Toyota", "Camry", 2010),
                        MobileBrand.XIAOMI,
                        new Household(
                                100,
                                new HashMap<String, String[]>() {{
                                    put("TVDevices", new String[]{"Nintendo", "PlayStation"});
                                }})
                ),

                new Respondent(
                        2,
                        true,
                        "female",
                        66,
                        Collections.singletonList("cat"),
                        "NIG",
                        Arrays.asList("COMPUTER", "LAPTOP", "MOBILE", "TV"),
                        new HashMap<String, String>() {{
                            put("EDUCATION", "School");
                        }},
                        new Car(1, "Mazda", "RX-7", 1995),
                        MobileBrand.SAMSUNG,
                        new Household(
                                200,
                                new HashMap<String, String[]>() {{
                                    put("TVDevices", new String[]{"Chromecast", "VHS Player"});
                                }})
                ),

                new Respondent(
                        3,
                        true,
                        "male",
                        14,
                        Collections.singletonList("dog"),
                        "OMS",
                        Arrays.asList("LAPTOP", "MOBILE"),
                        new HashMap<String, String>() {{
                            put("EDUCATION", "College");
                        }},
                        new Car(1, "Land Rover", "DISCOVERY", 2008),
                        MobileBrand.HUAWEI,
                        new Household(
                                300,
                                new HashMap<String, String[]>() {{
                                    put("TVDevices", new String[]{});
                                }})

                ),

                new Respondent(
                        4,
                        true,
                        "female",
                        33,
                        Collections.emptyList(),
                        "VLD",
                        Collections.singletonList("MOBILE"),
                        new HashMap<String, String>() {{
                            put("EDUCATION", "No_info");
                        }},
                        new Car(1, "Tesla", "Model X", 2020),
                        MobileBrand.APPLE,
                        new Household(
                                400,
                                new HashMap<String, String[]>() {{
                                    put("TVDevices", new String[]{"XBox", "PlayStation"});
                                }})
                )
        );
    }


}
