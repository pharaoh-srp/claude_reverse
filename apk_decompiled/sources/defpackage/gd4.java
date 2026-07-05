package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class gd4 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ hd4 E;

    public gd4(hd4 hd4Var) {
        this.E = hd4Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.E.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        hd4 hd4Var = this.E;
        hd4Var.f.a.clear();
        rpe rpeVar = hd4Var.g;
        synchronized (rpeVar) {
            rpeVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        hd4 hd4Var = this.E;
        hd4Var.f.a.clear();
        rpe rpeVar = hd4Var.g;
        synchronized (rpeVar) {
            rpeVar.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.E.s.c.setValue(Boolean.valueOf(z));
    }
}
