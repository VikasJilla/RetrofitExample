package com.jilla.retrofitexample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jilla.retrofitexample.models.User;

import java.util.List;
import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserListAdapter extends RecyclerView.Adapter {

    List<User> users;

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View userDetailsItem = layoutInflater.inflate(R.layout.user_details_item, parent, false);
        return new UserViewHolder(userDetailsItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        UserViewHolder viewHolder = (UserViewHolder) holder;
        viewHolder.paintView(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.name)
        TextView nameTxt;

        @BindView(R.id.email)
        TextView emailView;

        @BindView(R.id.phone_no)
        TextView phoneNo;

        @BindView(R.id.title_icon)
        TextView iconTxt;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
//            Log.e("UserViewHolder","in constructor");
        }

        void paintView(User user){
            nameTxt.setText(user.name);
            emailView.setText(user.emailID);
            phoneNo.setText(user.phone);
            iconTxt.setText(user.userName.substring(0,2).toUpperCase());
//            Log.e("UserViewHolder","in paintView");
        }
    }
}
