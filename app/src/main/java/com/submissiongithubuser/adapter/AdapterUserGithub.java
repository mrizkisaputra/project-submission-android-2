package com.submissiongithubuser.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.submissiongithubuser.R;
import com.submissiongithubuser.pojo.UserGithub;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterUserGithub extends BaseAdapter {
    private Context context;
    private List<UserGithub> listDataUserGithub;

    public AdapterUserGithub(Context context, ArrayList<UserGithub> listDataUserGithub) {
        this.context = context;
        this.listDataUserGithub = listDataUserGithub;
    }

    @Override
    public int getCount() {
        return listDataUserGithub.size();
    }

    @Override
    public Object getItem(int position) {
        return listDataUserGithub.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.github_user, parent, false);
        }

        UserGithubViewHolder userGithubViewHolder = new UserGithubViewHolder(view);
        UserGithub userGithub = (UserGithub) getItem(position);
        userGithubViewHolder.bind(userGithub);
        return view;
    }

    private static class UserGithubViewHolder {
        private TextView tvName, tvStory, tvLocation;
        private CircleImageView imgPhoto;

        public UserGithubViewHolder(View view) {
            tvName = view.findViewById(R.id.tv_name_user_github);
            tvLocation = view.findViewById(R.id.tv_location_github_user);
            tvStory = view.findViewById(R.id.tv_story_user_github);
            imgPhoto = view.findViewById(R.id.img_user_github);
        }

        public void bind(UserGithub userGithub) {
            tvName.setText(userGithub.getNameUserGithub());
            String location = "Location | "+userGithub.getLocationUserGithub();
            tvLocation.setText(location);
            tvStory.setText(userGithub.getStoryUserGithub());
            imgPhoto.setImageResource(userGithub.getPhotoUserGithub());
        }
    }
}
