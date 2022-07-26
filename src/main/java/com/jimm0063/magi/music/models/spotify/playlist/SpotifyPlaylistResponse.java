package com.jimm0063.magi.music.models.spotify.playlist;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SpotifyPlaylistResponse {
    private String href;
    private List<Item> items;
    private Integer limit;
    private String next;
    private Integer offset;
    private Object previous;
    private Integer total;
}