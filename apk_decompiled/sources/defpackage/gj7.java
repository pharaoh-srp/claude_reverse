package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class gj7 extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj7(Context context) {
        super(context);
        context.getClass();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((action == 1 || action == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
