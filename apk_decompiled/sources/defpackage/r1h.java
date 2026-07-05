package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r1h extends m59 {
    public bz7 V;
    public gdj W;

    @Override // defpackage.h59, defpackage.hqb
    public final void h1() {
        View viewQ = eve.Q(this);
        WeakHashMap weakHashMap = gdj.x;
        gdj gdjVarE = s4i.e(viewQ);
        gdjVarE.a(viewQ);
        wbj wbjVar = (wbj) this.V.invoke(gdjVarE);
        if (!x44.r(wbjVar, this.U)) {
            this.U = wbjVar;
            q1();
        }
        this.W = gdjVarE;
        super.h1();
    }

    @Override // defpackage.h59, defpackage.hqb
    public final void i1() {
        View viewQ = eve.Q(this);
        gdj gdjVar = this.W;
        if (gdjVar != null) {
            int i = gdjVar.v - 1;
            gdjVar.v = i;
            if (i == 0) {
                WeakHashMap weakHashMap = mvi.a;
                fvi.c(viewQ, null);
                mvi.j(viewQ, null);
                viewQ.removeOnAttachStateChangeListener(gdjVar.w);
            }
        }
        super.i1();
    }
}
