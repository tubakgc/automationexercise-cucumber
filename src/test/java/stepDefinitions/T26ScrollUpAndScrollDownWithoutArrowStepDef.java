package stepDefinitions;

import io.cucumber.java.en.When;
import pages.T25ScrollUpAndScrollDownWithArrowPage;
import utilities.ReusableMethods;

public class T26ScrollUpAndScrollDownWithoutArrowStepDef {
    T26ScrollUpAndScrollDownWithoutArrowPage sASWAP= new T26ScrollUpAndScrollDownWithoutArrowPage();
    T25ScrollUpAndScrollDownWithArrowPage sASDWA =new T25ScrollUpAndScrollDownWithArrowPage();
    @When("I manually scroll up to the top of the page")
    public void ıManuallyScrollUpToTheTopOfThePage() {
        ReusableMethods.jsScroll(sASDWA.scrollUpAutamationVerfiyText);
    }
}
