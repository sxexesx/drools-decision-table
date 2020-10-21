package com.sxexesx.data;

import com.sxexesx.model.Devices;
import com.sxexesx.model.Respondent;

import java.util.Arrays;
import java.util.Collections;
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
                new Respondent(1, Collections.singletonList(Devices.MOBILE)),
                new Respondent(2, Arrays.asList(Devices.COMPUTER, Devices.LAPTOP, Devices.MOBILE, Devices.TV)),
                new Respondent(3, Arrays.asList(Devices.LAPTOP, Devices.MOBILE)),
                new Respondent(4, Collections.singletonList(Devices.MOBILE))
        );
    }

}
