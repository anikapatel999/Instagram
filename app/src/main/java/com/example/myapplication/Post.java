package com.example.myapplication;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.json.JSONArray;

import java.util.List;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_LIKES = "numLikes";
    public static final String KEY_USERLIKES = "usersLiked";

    public String getKeyDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public int getNumLikes() {
        return getInt(KEY_LIKES);
    }

    public void setNumLikes(int numLikes) {
        put(KEY_LIKES, numLikes);
    }

    public JSONArray getUsersLiked() {
        return getJSONArray(KEY_USERLIKES);
    }

    public void setUsersLiked(JSONArray likes) {
        put(KEY_USERLIKES, likes);
    }

}
