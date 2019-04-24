package com.wikia.webdriver.common.templates.fandom;

import com.wikia.webdriver.common.core.configuration.Configuration;
import com.wikia.webdriver.common.core.url.FandomUrlBuilder;
import com.wikia.webdriver.common.templates.core.CoreTestTemplate;

public class FandomTestTemplate extends CoreTestTemplate {

  protected FandomUrlBuilder urlBuilder = new FandomUrlBuilder();
  private String mainURL = "http://sandbox-qa.fandom.wikia.com/";

  @Override
  protected void prepareURLs() {

  }

  @Override
  protected void loadFirstPage() {
    Configuration.setTestValue("forceFandomWikiaDomain", "true");
    driver.navigate().to(mainURL);
  }
}
