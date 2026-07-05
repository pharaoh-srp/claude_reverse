package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class fig implements View.OnLayoutChangeListener {
    public final /* synthetic */ kig a;
    public final /* synthetic */ fnf b;

    public fig(kig kigVar, fnf fnfVar) {
        this.a = kigVar;
        this.b = fnfVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            kig kigVar = this.a;
            boolean zA = kigVar.f.a();
            fnf fnfVar = this.b;
            if (zA) {
                kigVar.h = fnfVar;
                return;
            }
            mr9 mr9Var = kigVar.g;
            if (mr9Var == null) {
                return;
            }
            kigVar.g = null;
            fnfVar.h().postOnAnimation(new yw5(fnfVar, 25, mr9Var));
        }
    }
}
