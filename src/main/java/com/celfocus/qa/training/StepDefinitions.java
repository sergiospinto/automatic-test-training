package com.celfocus.qa.training;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

  private WebDriver driver;
  private Scenario scenario;

  @Before
  public void setup(Scenario scenario) {
    this.driver = new ChromeDriver();
    this.scenario = scenario;
  }

  @Given("I access the product subscription configurator page")
  public void iAccessTheProductSubscriptionConfiguratorPage() {
    driver.get("https://sergiospinto.github.io/");
  }

  @After
  public void tearDown() {
    scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),
        "image/png", "Final Screenshot");
    driver.quit();
  }
}
