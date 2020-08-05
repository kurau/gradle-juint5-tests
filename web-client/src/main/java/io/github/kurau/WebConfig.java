package io.github.kurau;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:testing.properties")
public interface WebConfig extends Config {

    @Key("guthub.url")
    @DefaultValue("https://github.com")
    String mainUrl();

}
