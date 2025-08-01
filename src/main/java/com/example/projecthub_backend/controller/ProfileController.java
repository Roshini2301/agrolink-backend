package com.example.projecthub_backend.controller;

import com.example.projecthub_backend.model.Profile;
import com.example.projecthub_backend.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{username}")
    public Optional<Profile> getProfile(@PathVariable String username) {
        return profileService.getProfileByUsername(username);
    }

    @PostMapping("/save")
    public Profile saveOrUpdateProfile(@RequestBody Profile profile) {
        return profileService.saveOrUpdateProfile(profile);
    }
}
