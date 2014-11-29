package in.srain.cube.views.ptr.demo.ui.classic;

import android.widget.TextView;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.demo.R;

public class ReleaseToRefresh extends WithTextViewInFrameLayoutFragment {

    @Override
    protected void setupViews(PtrClassicFrameLayout ptrFrame) {
        setHeaderTitle(R.string.ptr_demo_title_release_to_refresh);
        ptrFrame.setPullToRefresh(false);
    }
}