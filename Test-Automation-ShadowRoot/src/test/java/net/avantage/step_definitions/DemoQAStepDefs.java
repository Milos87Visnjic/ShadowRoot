package net.avantage.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.avantage.pages.DemoQaPage;
import net.avantage.utils.BrowserUtils;
import net.avantage.utils.Driver;
import net.avantage.utils.JavaScriptExecutorUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class DemoQAStepDefs {
    DemoQaPage demoQaPage = new DemoQaPage();

    @Given("User navigates to demoQa page")
    public void userNavigatesToDemoQaPage() {
        Driver.get().get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("alerts"));
        wait.until(ExpectedConditions.urlToBe("https://demoqa.com/alerts"));
    }

    @When("User handles alerts")
    public void user_handles_alerts() {
        demoQaPage.handleAlerts();
    }

    @When("User clicks on first click me button")
    public void user_clicks_on_first_click_me_button() {
        demoQaPage.clickClickMe("alert");
    }

    @When("User clicks on second click me button")
    public void user_clicks_on_second_click_me_button() {
        demoQaPage.clickClickMe("timerAlert");
    }

    @Then("User handles timer alerts")
    public void user_handles_timer_alerts() {
        demoQaPage.handleTimerAlerts();
    }

    @When("User clicks on third click me button")
    public void user_clicks_on_third_click_me_button() {
        demoQaPage.clickClickMe("confirm");
    }

    @Then("User handles confirm alerts")
    public void user_handles_confirm_alerts() {
        demoQaPage.handleConfirmAlerts();
    }

    @When("User clicks on fourth click me button")
    public void user_clicks_on_fourth_click_me_button() {
        demoQaPage.clickClickMe("promt");
    }

    @Then("User handles prompt alerts")
    public void user_handles_prompt_alerts() {
        demoQaPage.handlePromptAlerts();
    }

    @Given("User navigates to demoQa windows page")
    public void userNavigatesToDemoQaWindowsPage() {
        Driver.get().get("https://demoqa.com/browser-windows");
    }

    @When("User clicks on new tab button")
    public void user_clicks_on_new_tab_button() {
        demoQaPage.clickOnNewTabButton();
    }
    @Then("User validates new tab")
    public void user_validates_new_tab() {
        demoQaPage.validateNewTab();
    }

    @When("User clicks on new window button")
    public void userClicksOnNewWindowButton() {
        demoQaPage.clickOnNewWindowButton();
    }

    @Then("User validates new window")
    public void userValidatesNewWindow() {
        demoQaPage.validateNewWindow();
    }

    @And("Users opens new tab")
    public void usersOpensNewTab() {
        Driver.get().switchTo().newWindow(WindowType.TAB);
    }

    @And("User navigates to Game Portal on new tab")
    public void userNavigatesToGamePortalOnNewTab() {
        demoQaPage.navigateToGamePortalOnNewTab();
    }

    @Then("User validates new tab using Set")
    public void userValidatesNewTabUsingSet() {
        demoQaPage.usingSetHandlingNewTab();
    }

    @Then("User validates new window using Set")
    public void userValidatesNewWindowUsingSet() {
        demoQaPage.usingSetHandlingNewTab();
    }

    @And("User navigates to Game Portal on new tab using Set")
    public void userNavigatesToGamePortalOnNewTabUsingSet() {
        demoQaPage.navigateToGamePortalUsingSet();
    }

    @Given("User navigates to Demo QA droppable page")
    public void userNavigatesToDemoQADroppablePage() {
        Driver.get().get("https://demoqa.com/droppable/");
    }
    @When("User drags dragMe item to DropHere")
    public void userDragsDragMeItemToDropHere() {
        demoQaPage.dragAndDrop();
    }
    @Then("User verifies text changed in DropHere item")
    public void userVerifiesTextChangedInDropHereItem() {
        demoQaPage.verifyDropHereTextChanged();
    }

    @Given("User navigates to DemoQa page")
    public void user_navigates_to_demo_qa_page() {
        Driver.get().get("https://demoqa.com/buttons");
    }
    @Then("User prints title using jse")
    public void user_prints_title_using_jse() throws IOException {
        System.out.println(JavaScriptExecutorUtil.getTitleByJS());
    }
    @Then("User Double clicks on double click me button using jse")
    public void user_double_clicks_on_double_click_me_button_using_jse() throws IOException {
        BrowserUtils.waitForClickablility(demoQaPage.doubleClickButton,3);
        JavaScriptExecutorUtil.doubleClickByJS(demoQaPage.doubleClickButton);
    }
    @Then("User verifies double clickMe message using jse")
    public void user_verifies_double_click_me_message_using_jse() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.get();
        System.out.println((String) jse.executeScript("return arguments[0].innerHTML;", demoQaPage.doubleClickButton));
    }
    @Then("User right clicks on the right click me button")
    public void user_right_clicks_on_the_right_click_me_button() {
        demoQaPage.clickOnTheRightClickButton();
    }

    @Then("User gets coordinates of clickMe button")
    public void user_gets_coordinates_of_click_me_button(){
        BrowserUtils.getCords(demoQaPage.clickMeButton);
    }
    @Then("User clicks on the clickMe button using jse")
    public void user_clicks_on_the_click_me_button_using_jse() throws IOException {
        JavaScriptExecutorUtil.clickElementByJS(demoQaPage.clickMeButton);
    }
    @Then("User verifies dynamic clickMe message")
    public void user_verifies_dynamic_click_me_message() {
        demoQaPage.verifyDinamycClickMeMessage();
    }

}
