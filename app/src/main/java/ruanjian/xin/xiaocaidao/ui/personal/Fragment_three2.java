package ruanjian.xin.xiaocaidao.ui.personal;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ruanjian.xin.xiaocaidao.R;
import ruanjian.xin.xiaocaidao.adapter.Myadapter4;
import ruanjian.xin.xiaocaidao.adapter.Myadapter6;
import ruanjian.xin.xiaocaidao.domain.Name2;


/**
 * Created by 你的账户 on 2016/11/23.
 */

public class Fragment_three2 extends Fragment {
    private List<Name2> list = new ArrayList<>();
    private ListView listView;
    private Myadapter6 myadapter6;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.fragment_three2,container,false);
        getData();
        listView = (ListView)v.findViewById(R.id.fragment_three_list);
        myadapter6= new Myadapter6(getActivity(),list);
        listView.setAdapter(myadapter6);
        return  v;
    }
    private void getData(){
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
        list.add(new Name2(0,"楼主好人啊","keyi试试","55"));
    }
}