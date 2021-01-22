package com.sxexesx.data;

import com.sxexesx.model.Person;

import java.util.Arrays;
import java.util.List;

public class PersonData {

    public static List<Person> getPersonData() {
        return Arrays.asList(
                new Person("Bart", "", "male", 10),
                new Person("Maggie", "", "female", 1),
                new Person("Homer", "", "male", 39),
                new Person("Lisa", "", "female", 8),
                new Person("Margie", "", "female", 36)
        );
    }

}
