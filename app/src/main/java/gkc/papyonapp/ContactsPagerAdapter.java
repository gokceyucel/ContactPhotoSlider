package gkc.papyonapp;

/**
 * Created by gkc on 06/08/16.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import gkc.papyonapp.fragments.ContactFragment;
import gkc.papyonapp.helpers.Contact;

/**
 * A simple pager adapter that represents contact photos in sequence.
 */
public class ContactsPagerAdapter extends FragmentStatePagerAdapter {

    private int NUM_CONTACTS;
    private List<Contact> contacts;

    public ContactsPagerAdapter(FragmentManager fm, List<Contact> contacts) {
        super(fm);

        this.NUM_CONTACTS = contacts.size();
        this.contacts = contacts;
    }

    @Override
    public Fragment getItem(int position) {

        return ContactFragment.newInstance(contacts.get(position), position, this.NUM_CONTACTS);
    }

    @Override
    public int getCount() {
        return NUM_CONTACTS;
    }

}
