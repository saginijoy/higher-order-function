/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class LibraryTest {

    @Test
    void removeShortWordsRemovesNullElements() {
        //setup
        final List<String> words = Collections.singletonList(null);
        //exercise
        final List<String> actual = words
                .stream()
                .filter(Library::removeShortWords)
                .collect(Collectors.toList());
        //assert


        assertThat(actual.isEmpty(), is(true));

        //teardown
    }

    @Test
        //@Disabled
    void removeShortWordReturnFalseForEmptyString() {
        //setup
        final boolean actual = Library.removeShortWords("");
        //exercise

        //assert

        assertThat(actual, is(false));

        //teardown
    }

    @Test
    void shortWordReturnTrueFor() {
        //setup
        final List<String> words = Collections.singletonList("aaaaaa");
        //exercise
        final List<String> actual = words
                .stream()
                .filter(Library::removeShortWords)
                .collect(Collectors.toList());
        //assert

        assertThat(actual.isEmpty(), is(false));

        //teardown
    }

    @Test
    void removeShortWordsRemovesOneKeepsOne() {
        //setup
        final List<String> words = Arrays.asList("cccc", "ccccc");
        //exercise
        final List<String> actual = words
                .stream()
                .filter(Library::removeShortWords)
                .collect(Collectors.toList());
        //assert

        assertThat(actual, contains("ccccc"));

        //teardown
    }

    @Test
    void removeShortWordsRemovesAllBs() {
        //setup
        final List<String> words = Collections.singletonList("bbbbb");
        //exercise
        final List<String> actual = words
                .stream()
                .filter(Library::removeShortWords)
                .collect(Collectors.toList());
        //assert

        assertThat(actual.isEmpty(), is(false));

        //teardown
    }

    //Dec 4
    @Test
    void reverseStringsReturnEmptyListWhenGivennull(){
        //setup
        //exercise
        List<String> actual = Library.reverseString(null);
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }
    @Test
    void reverseStringsReturnEmptyListWhenGivenEmptyList()
    {
        //setup
        List<String> actual = Library.reverseString(Collections.emptyList());
        //Exericise
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }
    @Test
    void reverseStringsReturnsOneReverseValue()
    {
        //setup
        //exercise
        final List<String> actual = Library.reverseString(Collections.singletonList("foo"));
        MatcherAssert.assertThat(actual,contains("oof"));

    }
    @Test
    void reverseStringsReturnsOneDifferentReverseValue()
    {
        //setup
        //exercise
        final List<String> actual = Library.reverseString(Collections.singletonList("rab"));
        MatcherAssert.assertThat(actual,contains("bar"));
    }

    @Test
    void reverserStringRemovedNullFromList()
    {
        //setup
        final List<String> actual = Library.reverseString(Collections.singletonList(null));
        MatcherAssert.assertThat(actual.isEmpty(),is(true));
    }
    @Test
    void reverserStringReturnsTwoReversedWords()
    {
        //setup
        final List<String> actual = Library.reverseString(Arrays.asList("Dale", "Paul", "abc"));
        MatcherAssert.assertThat(actual,contains("elaD","luaP", "cba"));



    }
    //join method test case
    @Test
    void joinReturnEmptyStringForNull()
    {
        //setup
        String actual = Library.join(null,null);

        MatcherAssert.assertThat(actual,is(""));



    }

    @Test
    void joinReturnOneElementOfString()
    {
        //setup
        String actual = Library.join(" ","abc");

        MatcherAssert.assertThat(actual,is("abc"));



    }
    @Test
    void joinReturnOneStringForAnotherOneElement()
    {
        //setup
        String actual = Library.join(" ","cdef");

        MatcherAssert.assertThat(actual,is("cdef"));



    }
    @Test
    void joinReturnOneStringJoinedForMultipleElement()
    {
        //setup
        String actual = Library.join(" ","cdef","abc","fff");

        MatcherAssert.assertThat(actual,is("cdef abc fff"));



    }
    @Test
    void joinReturnOneStringJoinedForMultipleElementWithNoDelimiter()
    {
        //setup
        String actual = Library.join("","cdef","abc","fff");

        MatcherAssert.assertThat(actual,is("cdef abc fff"));



    }

    //wordCounts method test case
    @Test
    void wordCountsReturnEmptyMapForNull()
    {
        //setup
        Map<String,Integer> actual = Library.wordCounts(null);

        MatcherAssert.assertThat(actual.isEmpty(),is(true));



    }

    @Test
    void wordCountsReturnCountOfOneElement()
    {
        //setup
        Map<String,Integer> actual = Library.wordCounts("babali");

        MatcherAssert.assertThat(actual.get("babali"), is(1));



    }

    @Test
    void wordCountsReturnCountOfMoreThanOneElement()
    {
        //setup
        Map<String,Integer> actual = Library.wordCounts("test test is good");

        MatcherAssert.assertThat(actual.get("test"), is(2));
        MatcherAssert.assertThat(actual.get("is"), is(1));
        MatcherAssert.assertThat(actual.get("good"), is(1));



    }
}
