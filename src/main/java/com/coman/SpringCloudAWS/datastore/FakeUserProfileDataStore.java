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
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),
                "tot el",
                null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),
                "chiar el",
                null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
