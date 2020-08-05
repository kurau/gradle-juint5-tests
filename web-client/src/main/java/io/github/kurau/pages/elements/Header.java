package io.github.kurau.pages.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface Header extends AtlasWebElement {

    @FindBy(".//nav/ul/li[contains(., '{{ value }}')]")
    AtlasWebElement navItem(@Param("value") String value);

}
