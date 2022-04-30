package com.coman.SpringCloudAWS.datastore;

import com.coman.SpringCloudAWS.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("5da1ce30-66e4-42da-ac81-71dd19cc5079"),
                "tot el",
                null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("afa75068-fb19-4417-a05f-f3f16f5127fc"),
                "chiar el",
                null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
