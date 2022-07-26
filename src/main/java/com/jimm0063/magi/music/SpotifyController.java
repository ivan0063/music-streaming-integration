package com.jimm0063.magi.music;

import com.jimm0063.magi.music.service.SpotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify")
public class SpotifyController {
    @Autowired
    private SpotifyService spotifyService;

    @GetMapping("/playlist")
    public ResponseEntity findPlayList() {
        return ResponseEntity.ok(spotifyService.findPlayList());
    }

    @GetMapping("/playlist/{id}/tracks")
    public ResponseEntity findPlayList(@PathVariable String id) {
        return ResponseEntity.ok(spotifyService.findTrackByPlaylist(id));
    }
}
