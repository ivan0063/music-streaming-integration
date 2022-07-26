package com.jimm0063.magi.music.models.spotify.search;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Album{
    private String album_type;
    private List<Artist> artists;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private String release_date;
    private String release_date_precision;
    private Integer total_tracks;
    private String type;
    private String uri;
}
