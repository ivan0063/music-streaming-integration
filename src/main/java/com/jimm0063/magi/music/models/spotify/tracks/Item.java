package com.jimm0063.magi.music.models.spotify.tracks;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Item{
    private Date added_at;
    private AddedBy added_by;
    private Boolean is_local;
    private Object primary_color;
    private Track track;
    private VideoThumbnail video_thumbnail;
}
