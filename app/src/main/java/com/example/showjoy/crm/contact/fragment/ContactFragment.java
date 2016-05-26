package com.example.showjoy.crm.contact.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.showjoy.crm.R;
import com.example.showjoy.crm.contact.adapter.ContactAdapter;
import com.example.showjoy.crm.contact.model.Contact;

import java.util.ArrayList;

/**
 * Created by ShowJoy on 16/5/26.
 */
public class ContactFragment extends Fragment {

    private View view;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.fragment_contact, container, false);
            initView();
            initData();
        }

        return view;
    }

    private void initView() {
        listView = (ListView) view.findViewById(R.id.list_view);

    }

    private void initData() {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact contact;
        for(int i=0 ; i<15; i++) {
            contact = new Contact();
            contact.setName("联系人" + i);
            contacts.add(contact);
        }
        ContactAdapter adapter = new ContactAdapter(getContext(), contacts);
        listView.setAdapter(adapter);
    }
}
