package io.github.kurau.pages;

import io.github.kurau.pages.elements.Header;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface MainPage extends WebPage {

    @FindBy("//header")
    Header header();

}
