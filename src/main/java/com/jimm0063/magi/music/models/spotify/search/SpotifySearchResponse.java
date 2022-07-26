package com.jimm0063.magi.music.models.spotify.search;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SpotifySearchResponse {
    private Artist artists;
    private Tracks tracks;
}