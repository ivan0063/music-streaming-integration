package com.jimm0063.magi.music.models.spotify.search;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Item{
    private Album album;
    private List<Artist> artists;
    private Integer disc_number;
    private Integer duration_ms;
    private Boolean explicit;
    private ExternalIds external_ids;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private Boolean is_local;
    private Boolean is_playable;
    private String name;
    private Integer popularity;
    private String preview_url;
    private Integer track_number;
    private String type;
    private String uri;
}
