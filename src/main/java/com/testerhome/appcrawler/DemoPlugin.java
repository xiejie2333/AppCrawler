package com.testerhome.appcrawler;

import com.testerhome.appcrawler.plugin.Plugin;

public class DemoPlugin extends Plugin {
    @Override
    public void init(Crawler crawler) {
        System.out.println("demo init");
        log().debug("demo init");
    }

    @Override
    public void beforeElementAction(URIElement element) {
        log().info(element);

    }
}