package com.mindorks.framework.mvp.ui.user.business;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.Users;

import java.util.List;

/**
 * Created by ritzIpsy on 2/11/2018.
 */

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    UserViewHolder viewHolder;
    List<Users> usersList;

    public UserAdapter(List<Users> usersList){
        this.usersList=usersList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_user_list, parent, false);
        viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.onBind(usersList.get(position));
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
