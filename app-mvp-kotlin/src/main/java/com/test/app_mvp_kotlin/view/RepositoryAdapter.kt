package com.test.app_mvp_kotlin.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.app_mvp_kotlin.R
import com.test.app_mvp_kotlin.model.GitHubServices
import kotlinx.android.synthetic.main.repo_item.view.*

/**
 * Created by justluvher on 2018. 6. 7..
 */
class RepositoryAdapter(
        val onRepositoryItemClickListener : OnRepositoryItemClickListener,
        val context : Context,
        var items : MutableList<GitHubServices.RepositoryItem>) : RecyclerView.Adapter<RepoViewHolder>() {

    private fun setItemsAndRefresh(items : MutableList<GitHubServices.RepositoryItem>) {
        this.items = items;
        this.notifyDataSetChanged();
    }

    private fun getItemAt(poistion : Int) : GitHubServices.RepositoryItem {
        return items[poistion];
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (items === null) {
            return 0;
        }

        return items.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val view = LayoutInflater.from(context).inflate(R.layout.repo_item, parent, false);
        return RepoViewHolder(view);
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val item = getItemAt(position);

        // click listener 정의
        /*holder.itemView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        });*/

        // lamda
        holder.itemView.setOnClickListener({ v ->
            onRepositoryItemClickListener.onRepositoryItemClick(item);
        });

        holder.repoName.text = item.name;
        holder.repoDetail.text = item.description;
        holder.starCount.text = item.starazers_count;


        //glide를 이용하여 이미지를 다운로드 한다.
        /*val imageOptions: RequestOptions = RequestOptions();
        imageOptions.circleCrop();
        imageOptions.transform(RoundedCorners(30));*/

        //glide 4
        Glide.with(context)
                .load(item.owner.avatar_rul)
                .apply(RequestOptions().circleCrop())
                .into(holder.repoImage);


    }

    interface OnRepositoryItemClickListener {
        fun onRepositoryItemClick(item : GitHubServices.RepositoryItem);
    }
}

class RepoViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val repoName = itemView.repo_name;
    val repoDetail = itemView.repo_detail;
    val repoImage = itemView.repo_image;
    val starCount = itemView.repo_star;

}