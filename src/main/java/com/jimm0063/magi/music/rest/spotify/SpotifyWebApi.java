package com.jimm0063.magi.music.rest.spotify;

import com.jimm0063.magi.music.models.spotify.playlist.SpotifyPlaylistResponse;
import com.jimm0063.magi.music.models.spotify.search.SpotifySearchResponse;
import com.jimm0063.magi.music.models.spotify.tracks.PlaylistItemsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "SpotifySearch", url = "https://api.spotify.com/v1/")
public interface SpotifyWebApi {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    SpotifySearchResponse search(@SpringQueryMap Map<String, String> params, @RequestHeader("Authorization") String bearerToken);

    @RequestMapping(value = "/me/playlists", method = RequestMethod.GET)
    SpotifyPlaylistResponse findPlaylist(@SpringQueryMap Map<String, String> params, @RequestHeader("Authorization") String bearerToken);

    @RequestMapping(value = "/playlists/{playlist_id}/tracks", method = RequestMethod.GET)
    PlaylistItemsResponse findTracksByPlaylist(@PathVariable String playlist_id,
                                               @RequestHeader("Authorization") String bearerToken);

}
