package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class eig implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ kig E;
    public final /* synthetic */ View F;

    public eig(kig kigVar, View view) {
        this.E = kigVar;
        this.F = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        mr9 mr9Var;
        kig kigVar = this.E;
        if (kigVar.f.a()) {
            return false;
        }
        this.F.getViewTreeObserver().removeOnPreDrawListener(this);
        fnf fnfVar = kigVar.h;
        if (fnfVar == null || (mr9Var = kigVar.g) == null) {
            return true;
        }
        kigVar.g = null;
        fnfVar.h().postOnAnimation(new yw5(fnfVar, 25, mr9Var));
        return true;
    }
}
