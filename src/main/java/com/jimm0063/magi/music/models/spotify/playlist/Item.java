package com.jimm0063.magi.music.models.spotify.playlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Item{
    private boolean collaborative;
    private String description;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private Owner owner;
    private Object primary_color;
    @JsonProperty("private")
    private boolean myprivate;
    private String snapshot_id;
    private Tracks tracks;
    private String type;
    private String uri;
}