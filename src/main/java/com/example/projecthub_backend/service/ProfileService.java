package com.example.projecthub_backend.service;

import com.example.projecthub_backend.model.Profile;
import com.example.projecthub_backend.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Optional<Profile> getProfileByUsername(String username) {
        return profileRepository.findByUsername(username);
    }

    public Profile saveOrUpdateProfile(Profile profile) {
        return profileRepository.save(profile);
    }
}
