package com.notonly.calendar.user_interface.adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.dimeno.adapter.RecyclerAdapter;
import com.notonly.calendar.domain.HistoryResponse;
import com.notonly.calendar.user_interface.holder.HistoryViewHolder;

import java.util.List;

/**
 * HistoryAdapter
 * Created by wangzhen on 2020/6/13.
 */
public class HistoryAdapter extends RecyclerAdapter<HistoryResponse.DataBean> {

    public HistoryAdapter(List<HistoryResponse.DataBean> list) {
        super(list);
    }

    @Override
    public RecyclerView.ViewHolder onAbsCreateViewHolder(ViewGroup parent, int viewType) {
        return new HistoryViewHolder(parent);
    }
}
