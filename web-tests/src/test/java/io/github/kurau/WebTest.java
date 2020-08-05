package io.github.kurau;

import io.github.kurau.steps.MainSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class WebTest {

    private WebDriver webDriver;
    private MainSteps mainSteps;
    private WebConfig webConfig;

    @BeforeEach
    void setup() {
        webDriver = new ChromeDriver();
        mainSteps = new MainSteps(webDriver);
        webConfig = mainSteps.webConfig();
    }

    @Test
    void shouldSeeExploreLink() {
        mainSteps.open(webConfig.mainUrl());
        mainSteps.onMainPage().header().navItem("Explore").should(isDisplayed());
    }

    @AfterEach
    void stopDriver() {
        webDriver.quit();
    }
}
