package com.jimm0063.magi.music.models.spotify.playlist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Owner{
    private String display_name;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private String type;
    private String uri;
}
