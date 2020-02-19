/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package org.download.client.web;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import lombok.extern.slf4j.Slf4j;
import org.download.client.rss.dto.FeedItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class WebController {

    String downloadFolder = "dummy";

    @Autowired
    Template feed;

    @Autowired
    Template workingFeed;

    // Mock
    List<FeedItem> feedItems = new ArrayList<>();

    public WebController() {
        FeedItem item = new FeedItem();
        item.setTitel("Titel");
        item.setUrls(Collections.singletonList("url"));
        feedItems.add(item);
    }

    @GetMapping(value = "/working", produces = MediaType.TEXT_HTML)
    public TemplateInstance showWorkingFeed() {
        return workingFeed.data("feed", feedItems)
                .data("downloadFolder", downloadFolder);
    }

    @GetMapping(value = "/error", produces = MediaType.TEXT_HTML)
    public TemplateInstance showErrorFeed() {
        return feed.data("feed", feedItems)
                .data("downloadFolder", downloadFolder);
    }
}
