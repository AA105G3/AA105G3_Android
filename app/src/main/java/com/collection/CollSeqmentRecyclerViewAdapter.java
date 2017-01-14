package com.collection;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidbelieve.drawerwithswipetabs.R;

import java.util.List;


/**
 * Created by cuser on 2016/12/30.
 */

public class CollSeqmentRecyclerViewAdapter extends RecyclerView.Adapter<CollSeqmentRecyclerViewAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<CollectionVO> collectionVOList;

    public CollSeqmentRecyclerViewAdapter(){
        super();
    }

    public CollSeqmentRecyclerViewAdapter(Context context, List<CollectionVO> collectionVOList) {

        layoutInflater = LayoutInflater.from(context);
        this.collectionVOList = collectionVOList;
    }

    @Override
    public int getItemCount() {
        return collectionVOList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.collection_item_seqment, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        final CollectionVO collectionVO = collectionVOList.get(position);

        viewHolder.tv_collection_all_no.setText(collectionVO.getAll_no());
        viewHolder.tv_collection_class_no.setText(collectionVO.getClass_no());
        viewHolder.tv_collection_coll_no.setText(collectionVO.getColl_no());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_collection_all_no, tv_collection_class_no, tv_collection_coll_no;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_collection_all_no = (TextView) itemView.findViewById(R.id.tv_coll_segment_all_no);
            tv_collection_class_no = (TextView) itemView.findViewById(R.id.tv_coll_segment_class_no);
            tv_collection_coll_no = (TextView) itemView.findViewById(R.id.tv_coll_segment_coll_no);
        }
    }
}

