package html5api.jp.glssample.recycler.holder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import html5api.jp.glssample.R;

/**
 * Created by kgotoh on 2016/05/12.
 */
public class ViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView cvTxt;
    public ImageView cvImg;

    public ViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        cvTxt = (TextView) itemView.findViewById(R.id.txt);
        cvImg = (ImageView) itemView.findViewById(R.id.img);
    }

    @Override
    public void onClick(View view) {

    }
}
