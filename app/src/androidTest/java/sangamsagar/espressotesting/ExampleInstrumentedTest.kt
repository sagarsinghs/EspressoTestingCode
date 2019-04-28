package sangamsagar.espressotesting

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
/*
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    //public val rule  = ActivityTestRule(MainActivity::class.java)
    public val rule =  getRule()

    private val username_to_be_typed = "sagar"
    private val correct_passwrd="passwo"
    private val  wrong_password= "passme123"

    private  fun  getRule(): ActivityTestRule<MainActivity> {
        Log.e("Initalising rule","getting Mainactivity")
        return ActivityTestRule(MainActivity::class.java)
    }

    companion object {


        fun before_class_method()
        {
            Log.e("@Before Class","Hi this is run before anything")
        }

        fun after_class_method(){
            Log.e("@After Class","Hi this is run before anything")
        }
    }

    @Before
    fun before_test_method()
    {

        Log.e("@Before","Hi this is the run before every test function")
    }


    @Test
    fun login_success()
    {
        Log.e("@Test","performing login success test")
        Espresso.onView((withId(R.id.user_name)))
            .perform(ViewActions.typeText(username_to_be_typed))

        Espresso.onView(withId(R.id.password))
            .perform(ViewActions.typeText(correct_passwrd))

        Espresso.onView(withId(R.id.login_result))
            .perform(ViewActions.click())

        Espresso.onView(withId(R.id.login_result))
            .check(matches(withText("login_success")))
    }

    @Test
    fun login_failure(){
        Log.e("@Test","Performing login failure test")
        Espresso.onView((withId(R.id.user_name)))
            .perform(ViewActions.typeText(username_to_be_typed))

        Espresso.onView(withId(R.id.password))
            .perform(ViewActions.typeText(wrong_password))

        Espresso.onView(withId(R.id.login_button))
            .perform(ViewActions.click())

        Espresso.onView(withId(R.id.login_result))
            .check(matches(withText("login_failed")))

    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("sangamsagar.espressotesting", appContext.packageName)
    }
    @After
    fun after_test_method() {
        Log.e("@After", "Hi this is run after every test function")
    }

}
*/

/*
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.RootMatchers.withDecorView
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
      var testingJava = ActivityTestRule(TestingJava::class.java)

    @Test
      fun useAppContext() {
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("sangamsagar.espressotesting", appContext.packageName)


    }

    @Test
    fun loginClickedSuccess() {
        onView(withId(R.id.user_name)).perform(typeText(USERNAME_TYPED))

        onView(withId(R.id.inNumber)).perform(typeText("12345"))

        onView(withId(R.id.inConfirmNumber)).perform(typeText("12345"))


        onView(withId(R.id.btnLogin)).perform(click())
        onView(withId(R.id.txtLoginResult)).check(matches(withText(LOGIN_TEXT)))


    }

    @Test
    fun shouldShowToastError() {
        onView(withId(R.id.user_name)).perform(typeText(USERNAME_TYPED))

        onView(withId(R.id.inNumber)).perform(typeText("123456"))

        onView(withId(R.id.inConfirmNumber)).perform(typeText("123456"))

        onView(withId(R.id.btnLogin)).perform(click())
        onView(withText("toast_error")).inRoot(withDecorView(not<View>(`is`<View>(testingJava.activity.window.decorView))))
            .check(matches(isDisplayed()))
    }

    @Test
    fun shouldShowToastUsernameEmpty() {


        onView(withId(R.id.inNumber)).perform(typeText("12345"))

        onView(withId(R.id.inConfirmNumber)).perform(typeText("12345"))

        onView(withId(R.id.btnLogin)).perform(click())

        onView(withText("username_empty")).inRoot(withDecorView(not<View>(`is`<View>(testingJava.activity.window.decorView))))
            .check(matches(isDisplayed()))
    }

    companion object {

        const val USERNAME_TYPED = "Sagar"
        const val LOGIN_TEXT = "Hello Sagar"
    }
}



*/
