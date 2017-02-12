package gkc.papyonapp.fragments;

/**
 * Created by gkc on 30/07/16.
 */

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import gkc.papyonapp.helpers.Contact;
import gkc.papyonapp.R;

public class ContactFragment extends Fragment {
    private String contactName;
    private String contactPhoneNumber;
    private String contactPhotoUri;
    private int position;
    private int total;

    /**
     * Create a new instance of CountingFragment, providing "num"
     * as an argument.
     */
    public static ContactFragment newInstance(Contact contact, int position, int total) {
        ContactFragment f = new ContactFragment();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putString("contactPhotoUri", contact.getUriPhoto());
        args.putString("contactName", contact.getName());
        args.putString("contactPhoneNumber", contact.getPhoneNumber());
        args.putInt("position", position);
        args.putInt("total", total);
        f.setArguments(args);

        return f;
    }

    /**
     * When creating, retrieve this instance's number from its arguments.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactPhotoUri = getArguments() != null ? getArguments().getString("contactPhotoUri") : null;
        contactPhoneNumber = getArguments() != null ? getArguments().getString("contactPhoneNumber") : null;
        contactName = getArguments() != null ? getArguments().getString("contactName") : null;
        position = getArguments() != null ? getArguments().getInt("position") : -1;
        total = getArguments() != null ? getArguments().getInt("total") : -1;
    }

    /**
     * The Fragment's UI is just a simple text view showing its
     * instance number.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup v = (ViewGroup)inflater.inflate(R.layout.fragment_contact, container, false);
        ImageView iv = (ImageView)v.findViewById(R.id.contact_photo);
        TextView tv = (TextView) v.findViewById(R.id.contact_numbers);

        iv.setImageURI(Uri.parse(contactPhotoUri));
        tv.setText(position + " / " + total);
        return v;
    }
}