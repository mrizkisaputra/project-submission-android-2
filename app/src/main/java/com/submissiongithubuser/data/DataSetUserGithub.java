package com.submissiongithubuser.data;

import com.submissiongithubuser.R;
import com.submissiongithubuser.pojo.UserGithub;

import java.util.ArrayList;

public class DataSetUserGithub {
    private static String[] dataNameUserGithub = {
            "Jake Wharton", "Amit Shekhar", "Romain Guy", "Chris Banes", "David", "Ravi Tamada", "Deny Prasetyo", "Budi Oktaviyan", "Hendi Santika", "Sidiq Permana"
    };

    private static String[] dataLocationUserGithub = {
      "Pittsburgh, PA, USA", "New Delhi, India", "California", "Sydney, Australia", "Trondheim, Norway", "India", "Kotagede, Yogyakarta, Indonesia", "Jakarta, Indonesia", "Bojongsoang - Bandung Jawa Barat", "Jakarta Indonesia"
    };

    private static String[] dataStoryUserGithub = {
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer",
            "lorem Ipsum has been the industry standard dummy text ever since the when an unknown printer"
    };

    private static String[] dataCompanyUserGithub = {
            "Google, Inc.", "MindOrksOpenSource", "Google", "Google working on @android", "Working Group Two", "AndroidHive | Droid5", "gojek-engineering", "KotlinID", "JVMDeveloperID @KotlinID @IDDevOps", "Nusantara Beta Studio"
    };

    private static int[] dataPhotoUserGithub = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10
    };

    private static int[] dataFollowersUserGithub = {
            56995, 5153, 7972, 14725, 788, 18628, 277, 178, 428, 465
    };

    private static int[] dataFollowingUserGithub = {
            12, 3, 0, 0, 1, 3, 67, 31, 9, 56
    };

    private static int[] dataRepositoryUserGithub = {
            102, 37, 9, 30, 56, 28, 44, 110, 1064, 65
    };


    //used for take all data end return all data
    public static ArrayList<UserGithub> getAllDataUserGithub() {
        ArrayList<UserGithub> listDataUserGithub = new ArrayList<>();

        for (int i = 0; i < dataNameUserGithub.length; i++) {
            UserGithub userGithub = new UserGithub();

            userGithub.setNameUserGithub(dataNameUserGithub[i]);
            userGithub.setLocationUserGithub(dataLocationUserGithub[i]);
            userGithub.setCompanyUserGithub(dataCompanyUserGithub[i]);
            userGithub.setStoryUserGithub(dataStoryUserGithub[i]);
            userGithub.setFollowersUserGithub(dataFollowersUserGithub[i]);
            userGithub.setFollowingUserGithub(dataFollowingUserGithub[i]);
            userGithub.setPhotoUserGithub(dataPhotoUserGithub[i]);
            userGithub.setRepositoryUserGithub(dataRepositoryUserGithub[i]);

            listDataUserGithub.add(userGithub);
        }

        return listDataUserGithub;
    }
}
