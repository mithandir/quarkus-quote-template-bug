/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package org.download.client.rss.dto;

import lombok.Data;

import java.util.List;

@Data
public class FeedItem {
    private String titel;
    private String content;
    private List<String> urls;
}
