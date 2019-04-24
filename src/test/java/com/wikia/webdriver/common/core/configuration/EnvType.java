package com.wikia.webdriver.common.core.configuration;

import lombok.Getter;

public enum EnvType {
  PROD("prod", "wikia.com", "fandom.com", "wikia.org", "fandom.com"),
  SANDBOX("sandbox", "wikia.com", "fandom.com", "wikia.org", "fandom.wikia.com"),
  DEV("dev", "wikia-dev.pl", "fandom-dev.pl", "wikia-dev.pl", "fandom.com");

  @Getter
  private final String wikiaDomain;

  @Getter
  private final String fandomDomain;

  @Getter
  private final String wikiaOrgDomain;

  @Getter
  private final String fandomWikiaOrgDomain;

  @Getter
  private final String key;

  EnvType(String key, String wikiaDomain, String fandomDomain, String wikiaOrgDomain, String fandomWikiaOrgDomain) {
    this.key = key;
    this.wikiaDomain = wikiaDomain;
    this.fandomDomain = fandomDomain;
    this.wikiaOrgDomain = wikiaOrgDomain;
    this.fandomWikiaOrgDomain = fandomWikiaOrgDomain;
  }

  public String getDomain() {
    if(Configuration.getForceFandomDomain()){
      return fandomDomain;
    }else if(Configuration.getForceWikiOrg()){
      return wikiaOrgDomain;
    }else if(Configuration.getForceFandomWikiaDomain()){
      return fandomWikiaOrgDomain;
    }
    else
      return wikiaDomain;
  }

  public String getDomain(String currentURL) {
    if(currentURL.contains("fandom.com")){
      return fandomDomain;
    }else if(currentURL.contains("wikia.org")){
      return wikiaOrgDomain;
    }else
      return wikiaDomain;
  }
}
