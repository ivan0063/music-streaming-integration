package com.jimm0063.magi.music.service;

import com.jimm0063.magi.music.models.spotify.playlist.SpotifyPlaylistResponse;
import com.jimm0063.magi.music.models.spotify.search.SpotifySearchResponse;
import com.jimm0063.magi.music.models.spotify.tracks.PlaylistItemsResponse;
import com.jimm0063.magi.music.rest.spotify.SpotifyWebApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Log4j2
public class SpotifyService {
    @Autowired
    private SpotifyWebApi spotifySearchResponse;

    @Value("${spotify.oauth}")
    private String spotifyToken;

    public List search(String trackName, String artist) {
        Map<String, String> searchProps = new HashMap();
        searchProps.put("q","name: " + trackName + " artist: " + artist);
        searchProps.put("type","track");
        searchProps.put("limit","10");

        String auth = "Bearer " + spotifyToken;

        SpotifySearchResponse response = spotifySearchResponse.search(searchProps, auth);

        return response.getTracks().getItems().stream()
                .map(item -> "TRACK: " + item.getName() + " Album:" + item.getAlbum().getName())
                .collect(Collectors.toList());
    }

    public List findPlayList() {
        Map<String, String> searchProps = new HashMap();

        String auth = "Bearer " + spotifyToken;

        SpotifyPlaylistResponse response = spotifySearchResponse.findPlaylist(searchProps, auth);

        return response.getItems().stream()
                .map(item -> "ID: " + item.getId() + " LIST: " + item.getName())
                .collect(Collectors.toList());
    }

    public List findTrackByPlaylist(String playlistId) {
        Map<String, String> searchProps = new HashMap();

        String auth = "Bearer " + spotifyToken;

        PlaylistItemsResponse response = spotifySearchResponse.findTracksByPlaylist(playlistId, auth);

        return response.getItems().stream()
                .map(item -> "Name: " + item.getTrack().getName() + " Album: " + item.getTrack().getAlbum().getName())
                .collect(Collectors.toList());
    }
}
