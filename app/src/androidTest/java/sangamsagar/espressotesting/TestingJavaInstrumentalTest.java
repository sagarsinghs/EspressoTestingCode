package sangamsagar.espressotesting;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;


@RunWith(AndroidJUnit4.class)
public class TestingJavaInstrumentalTest {


    public static final String USERNAME_TYPED = "Anupam";

    public static final String LOGIN_TEXT = "Hello Anupam";

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("sangamsagar.espressotesting", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<TestingJava> mActivityRule = new ActivityTestRule<>(
            TestingJava.class);

    @Test
    public void loginClickedSuccess() {
        onView(withId(R.id.inUsername))
                .perform(typeText(USERNAME_TYPED));
        onView(withId(R.id.inNumber))
                .perform(typeText("12345"));
        onView(withId(R.id.inConfirmNumber))
                .perform(typeText("12345"));

        onView(withId(R.id.btnLogin)).perform(click());
        onView(withId(R.id.txtLoginResult)).check(matches(withText(LOGIN_TEXT)));
    }


    @Test
    public void shouldShowToastError() {
        onView(withId(R.id.inUsername))
                .perform(typeText(USERNAME_TYPED));
        onView(withId(R.id.inNumber))
                .perform(typeText("123456"));
        onView(withId(R.id.inConfirmNumber))
                .perform(typeText("12345"), closeSoftKeyboard());

        onView(withId(R.id.btnLogin)).perform(click());
        onView(withText("toast_error")).inRoot(withDecorView(not(is(mActivityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

    @Test
    public void shouldShowToastUsernameEmpty() {
        onView(withId(R.id.inNumber))
                .perform(typeText("12345"));
        onView(withId(R.id.inConfirmNumber))
                .perform(typeText("12345"));

        onView(withId(R.id.btnLogin)).perform(click());
        onView(withText("username_empty")).inRoot(withDecorView(not(is(mActivityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }
}