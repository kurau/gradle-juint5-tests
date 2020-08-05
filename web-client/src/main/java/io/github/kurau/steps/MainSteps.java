package io.github.kurau.steps;

import io.github.kurau.WebConfig;
import io.github.kurau.pages.MainPage;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class MainSteps {

    private WebDriver webDriver;

    public MainSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public <T extends WebPage> T on(Class<T> pageClass) {
        Atlas atlas = new Atlas(new WebDriverConfiguration(webDriver));
        return atlas.create(webDriver, pageClass);
    }

    public WebConfig webConfig() {
        return ConfigFactory.create(WebConfig.class, System.getProperties(), System.getenv());
    }

    public MainPage onMainPage() {
        return on(MainPage.class);
    }


    public void open(String url) {
        webDriver.get(url);
    }


}
