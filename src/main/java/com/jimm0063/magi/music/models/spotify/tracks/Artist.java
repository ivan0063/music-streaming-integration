package com.jimm0063.magi.music.models.spotify.tracks;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Artist {
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;
}
