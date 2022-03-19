package com.example.ussd;
import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.Manifest.permission.CALL_PHONE;

public class displayAdapter extends RecyclerView.Adapter<displayAdapter.viewHolder>{
   private static final int REQUEST_CALL=1;
    Context context;
    Activity activity;
    ArrayList<Model> arrayList;
    DatabaseHelper database_helper;
    CardView cardView;
    MainActivity mainActivity;
    public ArrayList<Model> arrayListFiltered;
    public displayAdapter(Context context, Activity activity, ArrayList<Model> arrayList) {
        this.context = context;
        this.activity  = activity ;
        this.arrayList = arrayList;
        arrayListFiltered = arrayList;
    }

    @Override
    public displayAdapter.viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(final displayAdapter.viewHolder holder, final int position) {
        cardView=holder.itemView.findViewById(R.id.card);

            if (position == 0) {
                cardView.setCardBackgroundColor(Color.parseColor("#002063"));
            }
            if (position == 1) {
                cardView.setCardBackgroundColor(Color.parseColor("#7330a5"));
            }
            if (position == 2) {
                cardView.setCardBackgroundColor(Color.parseColor("#212421"));
            }
            if (position == 3) {
                cardView.setCardBackgroundColor(Color.parseColor("#ff0000"));
            }
            if (position == 4) {
                cardView.setCardBackgroundColor(Color.parseColor("#00b252"));
            }
            if (position == 5) {
                cardView.setCardBackgroundColor(Color.parseColor("#0071c6"));
            }
            if (position == 6) {
                cardView.setCardBackgroundColor(Color.parseColor("#7b6100"));
            }
            if (position == 7) {
                cardView.setCardBackgroundColor(Color.parseColor("#313c52"));
            }
            if (position == 8) {
                cardView.setCardBackgroundColor(Color.parseColor("#c65910"));
            }
            if (position == 9) {
                cardView.setCardBackgroundColor(Color.parseColor("#295594"));
            }
            if (position == 10) {
                cardView.setCardBackgroundColor(Color.parseColor("#000000"));
            }
            if (position == 11) {
                cardView.setCardBackgroundColor(Color.parseColor("#737173"));
            }
            if (position == 12) {
                cardView.setCardBackgroundColor(Color.parseColor("#313c4a"));
            }
            if (position == 13) {
                cardView.setCardBackgroundColor(Color.parseColor("#c65910"));
            }
            if (position == 14) {
                cardView.setCardBackgroundColor(Color.parseColor("#7330a5"));
            }
            if (position == 15) {
                cardView.setCardBackgroundColor(Color.parseColor("#002063"));
            }
            if (position == 16) {
                cardView.setCardBackgroundColor(Color.parseColor("#00b252"));
            }
            if (position == 17) {
                cardView.setCardBackgroundColor(Color.parseColor("#002063"));
            }
            if (position == 18) {
                cardView.setCardBackgroundColor(Color.parseColor("#7330a5"));
            }
            if (position == 19) {
                cardView.setCardBackgroundColor(Color.parseColor("#212421"));
            }
            if (position == 20) {
                cardView.setCardBackgroundColor(Color.parseColor("#ff0000"));
            }
            if (position == 21) {
                cardView.setCardBackgroundColor(Color.parseColor("#00b252"));
            }
            if (position == 22) {
                cardView.setCardBackgroundColor(Color.parseColor("#0071c6"));
            }
            if (position == 23) {
                cardView.setCardBackgroundColor(Color.parseColor("#7b6100"));
            }
            if (position == 24) {
                cardView.setCardBackgroundColor(Color.parseColor("#313c52"));
            }
            if (position == 25) {
                cardView.setCardBackgroundColor(Color.parseColor("#c65910"));
            }
            if (position == 26) {
                cardView.setCardBackgroundColor(Color.parseColor("#295594"));
            }
            if (position == 27) {
                cardView.setCardBackgroundColor(Color.parseColor("#000000"));
            }
            if (position == 28) {
                cardView.setCardBackgroundColor(Color.parseColor("#737173"));
            }
            if (position == 29) {
                cardView.setCardBackgroundColor(Color.parseColor("#313c4a"));
            }
            if (position == 30) {
                cardView.setCardBackgroundColor(Color.parseColor("#c65910"));
            }
            if (position == 31) {
                cardView.setCardBackgroundColor(Color.parseColor("#7330a5"));
            }
            if (position == 32) {
                cardView.setCardBackgroundColor(Color.parseColor("#002063"));
            }
            if (position == 33) {
                cardView.setCardBackgroundColor(Color.parseColor("#00b252"));
            }


        holder.title.setText(arrayList.get(position).getTitle());
        holder.description.setText(arrayList.get(position).getDes());
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone=holder.title.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: " + Uri.encode(phone)));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        }); holder.description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone=holder.title.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: " + Uri.encode(phone)));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone=holder.title.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: " + Uri.encode(phone)));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
        database_helper = new DatabaseHelper(context);

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

 
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        ImageView delete, edit;

        public viewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);



        }
    }

    public void showDialog(final int pos) {
        final EditText title, des;
        Button submit;
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        dialog.setContentView(R.layout.dialog);
        params.copyFrom(dialog.getWindow().getAttributes());
        params.height = WindowManager.LayoutParams.MATCH_PARENT;
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.gravity = Gravity.CENTER;
        dialog.getWindow().setAttributes(params);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        title = (EditText) dialog.findViewById(R.id.title);
        des = (EditText) dialog.findViewById(R.id.description);
        submit = (Button) dialog.findViewById(R.id.submit);

        title.setText(arrayList.get(pos).getTitle());
        des.setText(arrayList.get(pos).getDes());

        submit.setOnClickListener(new View.OnClickListener() {;
            @Override
            public void onClick(View v) {
                if (title.getText().toString().isEmpty()) {
                    title.setError("Please Enter Title");
                }else if(des.getText().toString().isEmpty()) {
                    des.setError("Please Enter Description");
                }else {
                    //updating note
                    database_helper.updateNote(title.getText().toString(), des.getText().toString(), arrayList.get(pos).getID());
                    arrayList.get(pos).setTitle(title.getText().toString());
                    arrayList.get(pos).setDes(des.getText().toString());
                    dialog.cancel();
                    //notify list
                    notifyDataSetChanged();
                }
            }
        });
    }

}
