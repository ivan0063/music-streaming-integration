package com.jimm0063.magi.music.models.spotify.search;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Artist{
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;
    private List<Object> items;
    private Integer limit;
    private Object next;
    private Integer offset;
    private String previous;
    private Integer total;
}
