package com.example.androidunittestcalculator;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityUiTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void mainActivity_FivePressed_ReturnsTrue() {
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("5")));
    }


    @Test
    public void mainActivity_SixPressed_ReturnsTrue() {
        onView(withId(R.id.button_num_six))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("6")));
    }


    @Test
    public void mainActivity_SevenPressed_ReturnsTrue() {
        onView(withId(R.id.button_num_seven))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("7")));
    }

    @Test
    public void mainActivity_SixPlusFive_ReturnsTrue() {
        onView(withId(R.id.button_num_six))
                .perform(click());
        onView(withId(R.id.button_plus))
                .perform(click());
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.button_equals))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("11")));
    }

    @Test
    public void mainActivity_SixDecimalTwoPlusFive_ReturnsTrue() {
        onView(withId(R.id.button_num_six))
                .perform(click());
        onView(withId(R.id.button_decimal))
                .perform(click());
        onView(withId(R.id.button_num_two))
                .perform(click());
        onView(withId(R.id.button_plus))
                .perform(click());
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.button_equals))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("11.2")));
    }

    @Test
    public void mainActivity_LongMath_ReturnsTrue() {
        onView(withId(R.id.button_num_nine))
                .perform(click());
        onView(withId(R.id.button_decimal))
                .perform(click());
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.button_multiply))
                .perform(click());
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.button_num_five))
                .perform(click());
        onView(withId(R.id.button_plus))
                .perform(click());
        onView(withId(R.id.button_num_eight))
                .perform(click());
        onView(withId(R.id.button_num_four))
                .perform(click());
        onView(withId(R.id.button_equals))
                .perform(click());
        onView(withId(R.id.text_display))
                .check(matches(withText("606.5")));
    }


}
