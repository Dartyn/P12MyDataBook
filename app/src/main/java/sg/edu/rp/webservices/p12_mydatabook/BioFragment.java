package sg.edu.rp.webservices.p12_mydatabook;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class BioFragment extends Fragment {

    Button btn;
    TextView tv;

    public BioFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.biofragment, container, false);
        // Inflate the layout for this fragment
        btn = (Button)view.findViewById(R.id.btnEdit);

        tv = (TextView)view.findViewById(R.id.tvbf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "You clicked yes",
                        Toast.LENGTH_LONG).show();

                View ep = inflater.inflate(R.layout.editphrase, null);
                final EditText et = (EditText) ep.findViewById(R.id.editText);
                AlertDialog.Builder build = new AlertDialog.Builder(getActivity());
                build.setTitle("Edit Bio")
                        .setView(ep)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String text = et.getText().toString();
                                tv.setText(text.toString());
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getContext(), "You clicked no",
                                Toast.LENGTH_LONG).show();
                    }
                });


                AlertDialog alertDialog = build.create();
                alertDialog.show();
            }
        });
        return view;

    }


}
