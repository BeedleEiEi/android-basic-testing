package cc.somkiat.basicunittesting;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        onView(allOf(withId(R.id.userNameInput), isDisplayed())).perform(replaceText("name"), closeSoftKeyboard());
        onView(allOf(withId(R.id.emailInput), isDisplayed())).perform(replaceText("asd@gmail.com"), closeSoftKeyboard());
        onView(
                allOf(withId(R.id.saveButton), isDisplayed())).perform(click());
    }

    @Test
    public void revertTest() {
        onView(allOf(withId(R.id.userNameInput), isDisplayed())).perform(replaceText("nameEE"), closeSoftKeyboard());
        onView(allOf(withId(R.id.emailInput), isDisplayed())).perform(replaceText("asd@gmail.com"), closeSoftKeyboard());
        onView(
                allOf(withId(R.id.saveButton), isDisplayed())).perform(click());
        onView(
                allOf(withId(R.id.revertButton), isDisplayed())).perform(click());
    }

}
