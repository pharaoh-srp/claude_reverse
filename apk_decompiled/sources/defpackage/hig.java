package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.anthropic.claude.mainactivity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class hig implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ jig E;
    public final /* synthetic */ MainActivity F;

    public hig(jig jigVar, MainActivity mainActivity) {
        this.E = jigVar;
        this.F = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (n5d.z(view2)) {
            SplashScreenView splashScreenViewQ = n5d.q(view2);
            splashScreenViewQ.getClass();
            WindowInsets windowInsetsBuild = pa8.j().build();
            windowInsetsBuild.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.E.j = (windowInsetsBuild == splashScreenViewQ.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
            View decorView = this.F.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
