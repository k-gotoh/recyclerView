package html5api.jp.glssample.recycler.adapter;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import html5api.jp.glssample.Items;
import html5api.jp.glssample.R;
import html5api.jp.glssample.recycler.holder.ViewHolders;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<ViewHolders> {

    private List<Items> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<Items> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_list, null);
        ViewHolders rcv = new ViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.cvTxt.setText(itemList.get(position).getName());
        holder.cvImg.setImageResource(itemList.get(position).getImageResource());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
