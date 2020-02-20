package org.download.client.utils;

import io.quarkus.qute.TemplateExtension;
import lombok.extern.slf4j.Slf4j;
import org.download.client.rss.dto.FeedItem;

@Slf4j
@TemplateExtension
public class DownloadExistsUtil {
    public static boolean isAlreadyDownloaded(FeedItem feedItem, String downloadUrl, String downloadFolder) {
        return false;
    }

    public static boolean isAlreadyDownloaded(FeedItem feedItem, String downloadUrl) {
        return false;
    }

    public static boolean isDownloadFinished(FeedItem feedItem, String downloadUrl) {
        return false;
    }

    public static boolean isDownloadFinished(FeedItem feedItem, String downloadUrl, String downloadFolder) {
        return false;
    }
}
