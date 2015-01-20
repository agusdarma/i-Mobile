package com.agusdarma.emobile;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.agusdarma.emobile.adapter.ListViewDemoAdapter;
import com.agusdarma.emobile.adapter.ListViewItem;

public class UserFragment extends Fragment {
	private List<ListViewItem> mItems;        // ListView items list
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_user, container, false);
      // initialize the items list
      mItems = new ArrayList<ListViewItem>();
      Resources resources = getResources();
      
      mItems.add(new ListViewItem(resources.getDrawable(R.drawable.ic_home), "agusdarma", getString(R.string.hello_world)));
      mItems.add(new ListViewItem(resources.getDrawable(R.drawable.ic_home), "budianto", getString(R.string.hello_world)));
      mItems.add(new ListViewItem(resources.getDrawable(R.drawable.ic_home), "yolanda", getString(R.string.hello_world)));
      ListView listUser = (ListView)rootView.findViewById(R.id.listUser);
      listUser.setAdapter(new ListViewDemoAdapter(getActivity(), mItems));
      listUser.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getActivity(), "tesss", Toast.LENGTH_SHORT).show();
				
			}
		});
      listUser.setDivider(null);
         
        return rootView;
    }
}
