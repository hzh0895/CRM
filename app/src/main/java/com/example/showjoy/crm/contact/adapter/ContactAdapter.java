package com.example.showjoy.crm.contact.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.showjoy.crm.R;
import com.example.showjoy.crm.contact.model.Contact;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ShowJoy on 16/5/26.
 */
public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            convertView = LayoutInflater.from((getContext())).inflate(R.layout.layout_contact, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.userImg = (ImageView) convertView.findViewById(R.id.user_img);
            viewHolder.nameText = (TextView) convertView.findViewById(R.id.name_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = getItem(position);
        viewHolder.nameText.setText(contact.getName());

        return convertView;
    }

    private static class ViewHolder {
        ImageView userImg;
        TextView nameText;
    }
}
