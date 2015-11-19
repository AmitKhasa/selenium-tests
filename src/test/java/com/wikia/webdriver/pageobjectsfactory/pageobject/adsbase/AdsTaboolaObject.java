package com.wikia.webdriver.pageobjectsfactory.pageobject.adsbase;

import com.wikia.webdriver.common.core.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @ownership AdEngineering Wikia
 */
public class AdsTaboolaObject extends AdsBaseObject {

  public static final String URL_PARAM_TRIGGER = "AbTest.TABOOLA_MODULES=GROUP_3";
  public static final String RIGHT_RAIL_CSS_SELECTOR = "#NATIVE_TABOOLA_RAIL";
  public static final String BELOW_ARTICLE_CSS_SELECTOR = "#NATIVE_TABOOLA_ARTICLE";

  public AdsTaboolaObject(WebDriver driver) {
    super(driver);
  }

  public void verifyTaboolaContainer(String slotCssSelector) {
    Assertion.assertTrue(isElementOnPage(By.cssSelector(slotCssSelector)),
                         slotCssSelector + " taboola container is not present");
  }

  public void verifyTaboolaAdsPresent(String slotCssSelector) {
    WebElement taboolaSlot = driver.findElement(By.cssSelector(slotCssSelector));
    verifyAdVisibleInSlot(slotCssSelector, taboolaSlot);
  }
}