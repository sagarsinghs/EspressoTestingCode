package sangamsagar.espressotesting;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import sangamsagar.espressotesting.BasicExampleEspresso.BasicExample;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;


/*import android.content.Context;
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
*/
@RunWith(AndroidJUnit4.class)
public class TestingBasicEspresso {

    public static final String STRING_TO_BE_TYPED ="Espresso";

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("sangamsagar.espressotesting", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<BasicExample> mActivityRule = new ActivityTestRule<>(
            BasicExample.class);

    @Test
    public void changeText_sameActivity()
    {
        onView(withId(R.id.editTextUserInput)).perform(typeText(STRING_TO_BE_TYPED),closeSoftKeyboard());

        onView(withId(R.id.changeTextBt)).perform(click());

        onView(withId(R.id.textToBeChanged)).check(matches(withText(STRING_TO_BE_TYPED)));

    }

    @Test
    public void changeText_newActivity()
    {
        onView(withId(R.id.editTextUserInput)).perform(typeText(STRING_TO_BE_TYPED),closeSoftKeyboard());

        onView(withId(R.id.activityChangeTextBtn)).perform(click());

        onView(withId(R.id.show_text_view)).check(matches(withText(STRING_TO_BE_TYPED)));

    }
}
