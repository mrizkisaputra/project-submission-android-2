package com.submissiongithubuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.submissiongithubuser.adapter.AdapterUserGithub;
import com.submissiongithubuser.data.DataSetUserGithub;
import com.submissiongithubuser.databinding.ActivityMainBinding;
import com.submissiongithubuser.pojo.UserGithub;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<UserGithub> listData = new ArrayList<>();
    private UserGithub userGithub = new UserGithub();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listData.addAll(DataSetUserGithub.getAllDataUserGithub());
        setListview();
        setClickedListview();
    }

    //method setlistview adapter
    private void setListview() {
        AdapterUserGithub adapterUserGithub = new AdapterUserGithub(this, this.listData);
        binding.myListView.setAdapter(adapterUserGithub);
    }

    //method click item listview
    private void setClickedListview() {
        binding.myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                userGithub.setNameUserGithub(listData.get(position).getNameUserGithub());
                userGithub.setCompanyUserGithub(listData.get(position).getCompanyUserGithub());
                userGithub.setPhotoUserGithub(listData.get(position).getPhotoUserGithub());
                userGithub.setLocationUserGithub(listData.get(position).getLocationUserGithub());
                userGithub.setFollowingUserGithub(listData.get(position).getFollowingUserGithub());
                userGithub.setFollowersUserGithub(listData.get(position).getFollowersUserGithub());
                userGithub.setStoryUserGithub(listData.get(position).getStoryUserGithub());
                userGithub.setRepositoryUserGithub(listData.get(position).getRepositoryUserGithub());

                Intent intent = new Intent(MainActivity.this, DetailUserGithubActivity.class);
                intent.putExtra(DetailUserGithubActivity.EXTRA_PARCELABLE, userGithub);
                startActivity(intent);
            }
        });
    }
}