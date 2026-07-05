package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class iig implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ jig E;
    public final /* synthetic */ View F;

    public iig(jig jigVar, View view) {
        this.E = jigVar;
        this.F = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.E.f.a()) {
            return false;
        }
        this.F.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
