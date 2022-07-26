package com.jimm0063.magi.music.models.spotify.search;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Tracks{
    private String href;
    private List<Item> items;
    private Integer limit;
    private String next;
    private Integer offset;
    private String previous;
    private Integer total;
}
