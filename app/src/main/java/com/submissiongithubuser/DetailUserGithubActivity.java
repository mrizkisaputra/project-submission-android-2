package com.submissiongithubuser;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.submissiongithubuser.databinding.ActivityDetailUserGithubBinding;
import com.submissiongithubuser.pojo.UserGithub;

public class DetailUserGithubActivity extends AppCompatActivity {
    private ActivityDetailUserGithubBinding binding;
    public static final String EXTRA_PARCELABLE = "Extra Parcelable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailUserGithubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dataReceived();
    }

    @SuppressLint("SetTextI18n")
    private void dataReceived() {
            UserGithub userGithub = getIntent().getParcelableExtra(EXTRA_PARCELABLE);

            binding.tvNameUserGithub.setText("my name "+userGithub.getNameUserGithub());
            binding.tvLocationUserGithub.setText("location "+userGithub.getLocationUserGithub());
            binding.tvCompanyUserGithub.setText("i work is company "+userGithub.getCompanyUserGithub());
            binding.tvStoryUserGithub.setText(String.valueOf(userGithub.getStoryUserGithub()));
            binding.imgUserGithub.setImageResource(userGithub.getPhotoUserGithub());
            binding.tvFollowingUserGithub.setText(String.valueOf(userGithub.getFollowingUserGithub()));
            binding.tvFollowersUserGithub.setText(String.valueOf(userGithub.getFollowersUserGithub()));
            binding.tvRepositoryUserGithub.setText(String.valueOf(userGithub.getRepositoryUserGithub()));

            binding.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(DetailUserGithubActivity.this, "You share "+userGithub.getNameUserGithub(), Toast.LENGTH_SHORT).show();
                }
            });

            binding.btnFollow.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                    Toast.makeText(DetailUserGithubActivity.this, "You Follow " + userGithub.getNameUserGithub(), Toast.LENGTH_SHORT).show();
                    binding.btnFollow.setBackgroundColor(R.color.colorAccent);
                    binding.btnFollow.setText("Unfollow");
                }
            });
    }
}