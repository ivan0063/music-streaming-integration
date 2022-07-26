package com.jimm0063.magi.music.models.spotify.tracks;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlaylistItemsResponse {
    private String href;
    private List<Item> items;
    private Integer limit;
    private Object next;
    private Integer offset;
    private Object previous;
    private Integer total;
}
