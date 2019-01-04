package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.subham.recyclerviewtask.Details;
import com.example.subham.recyclerviewtask.R;

import java.util.List;

import Model.User;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<User> list;

    public MyAdapter(Context context, List<User> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(this.context)
                .inflate(R.layout.component, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        User curr = list.get(i);
        viewHolder.name.setText(curr.getName());
        viewHolder.img.setImageResource(curr.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView name;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView)itemView.findViewById(R.id.name);
            img = (ImageView)itemView.findViewById(R.id.img);
        }

        @Override
        public void onClick(View v) {

            int pos = getAdapterPosition();
            User curr = list.get(pos);

            Intent intent = new Intent(context, Details.class);
            intent.putExtra("name", curr.getName());
            intent.putExtra("age", curr.getAge());
            intent.putExtra("email", curr.getEmail());
            intent.putExtra("image", Integer.toString(curr.getImageDrawableId()));
            intent.putExtra("contact", curr.getContact());

            context.startActivity(intent);
        }
    }
}
