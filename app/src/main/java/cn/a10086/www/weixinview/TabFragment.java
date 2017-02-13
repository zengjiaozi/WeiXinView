package cn.a10086.www.weixinview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author
 * @time 2017/2/13  14:42
 * @desc ${TODD}
 */
public class TabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String mTitle = "微信";
        if (getArguments() != null) {
            mTitle = getArguments().getString("Title", "微信");
        }
        TextView textView = new TextView(getActivity());
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        textView.setText(mTitle);

        return textView;
    }
}