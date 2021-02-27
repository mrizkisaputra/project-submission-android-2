package com.submissiongithubuser.pojo;


import android.os.Parcel;
import android.os.Parcelable;

public class UserGithub implements Parcelable {
    private String nameUserGithub, locationUserGithub, storyUserGithub, companyUserGithub;
    private int followersUserGithub, followingUserGithub, repositoryUserGithub, photoUserGithub;

    public UserGithub() {

    }

    protected UserGithub(Parcel in) {
        nameUserGithub = in.readString();
        locationUserGithub = in.readString();
        storyUserGithub = in.readString();
        companyUserGithub = in.readString();
        followersUserGithub = in.readInt();
        followingUserGithub = in.readInt();
        repositoryUserGithub = in.readInt();
        photoUserGithub = in.readInt();
    }

    public static final Creator<UserGithub> CREATOR = new Creator<UserGithub>() {
        @Override
        public UserGithub createFromParcel(Parcel in) {
            return new UserGithub(in);
        }

        @Override
        public UserGithub[] newArray(int size) {
            return new UserGithub[size];
        }
    };

    public String getNameUserGithub() {
        return nameUserGithub;
    }

    public void setNameUserGithub(String nameUserGithub) {
        this.nameUserGithub = nameUserGithub;
    }

    public String getLocationUserGithub() {
        return locationUserGithub;
    }

    public void setLocationUserGithub(String locationUserGithub) {
        this.locationUserGithub = locationUserGithub;
    }

    public String getStoryUserGithub() {
        return storyUserGithub;
    }

    public void setStoryUserGithub(String storyUserGithub) {
        this.storyUserGithub = storyUserGithub;
    }

    public String getCompanyUserGithub() {
        return companyUserGithub;
    }

    public void setCompanyUserGithub(String companyUserGithub) {
        this.companyUserGithub = companyUserGithub;
    }

    public int getFollowersUserGithub() {
        return followersUserGithub;
    }

    public void setFollowersUserGithub(int followersUserGithub) {
        this.followersUserGithub = followersUserGithub;
    }

    public int getFollowingUserGithub() {
        return followingUserGithub;
    }

    public void setFollowingUserGithub(int followingUserGithub) {
        this.followingUserGithub = followingUserGithub;
    }

    public int getRepositoryUserGithub() {
        return repositoryUserGithub;
    }

    public void setRepositoryUserGithub(int repositoryUserGithub) {
        this.repositoryUserGithub = repositoryUserGithub;
    }

    public int getPhotoUserGithub() {
        return photoUserGithub;
    }

    public void setPhotoUserGithub(int photoUserGithub) {
        this.photoUserGithub = photoUserGithub;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameUserGithub);
        dest.writeString(locationUserGithub);
        dest.writeString(storyUserGithub);
        dest.writeString(companyUserGithub);
        dest.writeInt(followersUserGithub);
        dest.writeInt(followingUserGithub);
        dest.writeInt(repositoryUserGithub);
        dest.writeInt(photoUserGithub);
    }
}
