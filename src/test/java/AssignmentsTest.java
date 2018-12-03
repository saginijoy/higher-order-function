
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.contains;

final class AssignmentsTest {

    @Test
    void checkIfTheListIsNull(){
        //setup
        final List<String> names = Collections.singletonList(null);
        //execrise
        final List<String> actual =  Assignments.slowFoxes(names);
        //assert
        assertThat(actual.isEmpty(), is(false));
    }
    @Test
    void checkIfTheListIsEmpty(){
        //setup
        final List<String> names = Collections.emptyList();
        //execrise
        final List<String> actual =  Assignments.slowFoxes(names);
        //assert
        assertThat(actual.isEmpty(), is(true));
    }

    @Test
    void checkIfTheListShouldNotContainSwiftFox(){
        //setup
        final List<String> names = Arrays.asList("Kit Fox", "Swift Fox");
        //execrise
        final List<String> actual =  Assignments.slowFoxes(names);
        //assert
        assertThat(actual, contains("Kit Fox"));
    }

    //Second Assignment
    @Test
    void adultsReturnNoElements(){
        //setup
        final List<Person> persons = Arrays.asList();
        //execrise
        final List<Person> actual =  Assignments.adults(persons);
        //assert
        assertThat(actual.isEmpty(), is(true));
    }
    @Test
    void adultsReturnOneElements(){
        //setup
        final List<Person> persons = Arrays.asList(new Person("John","Smith",32));
        //execrise
        final List<Person> actual =  Assignments.adults(persons);
        //assert
        assertThat(actual, is(persons));
    }
    @Test
    void adultsWithAgeGreaterThanOrEqualToEighteen(){
        //setup
        final List<Person> persons = Arrays.asList(new Person("Kenny","Johnson",12),new Person("John","Smith",32));
        final List<Person> expected = Arrays.asList(new Person("John","Smith",32));
        //exercise
        final List<Person> actual = Assignments.adults(persons);
        //assert
        assertThat(actual.get(0).getFirtsName(),is(expected.get(0).getFirtsName()));
        assertThat(actual.get(0).getLastName(),is(expected.get(0).getLastName()));
        assertThat(actual.get(0).getAge(),is(expected.get(0).getAge()));
    }


}
