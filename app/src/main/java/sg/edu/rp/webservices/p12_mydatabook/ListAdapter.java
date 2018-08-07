package sg.edu.rp.webservices.p12_mydatabook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {
    private ArrayList<List> food;
    private Context context;
    private ImageView ivImage;
    private TextView tv;

    public ListAdapter(Context context, int resource, ArrayList<List> objects) {
        super(context, resource, objects);
        food = objects;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object

        // Get the ImageView object
        ivImage = (ImageView) rowView.findViewById(R.id.iv);
        tv = (TextView) rowView.findViewById(R.id.tv);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        List currentFood = food.get(position);
        // Set the TextView to show the food

        tv.setText(currentFood.getText());
        // Set the image to star or nostar accordingly
        if (position == 0) {
            ivImage.setImageResource(R.drawable.info);
        } else if (position == 1){
            ivImage.setImageResource(R.drawable.pen);
        }
     else if (position == 2){
        ivImage.setImageResource(R.drawable.calendar);
    }else{
            ivImage.setImageResource(R.drawable.star);
        }
        return rowView;
    }
}
