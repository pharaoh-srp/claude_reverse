package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class g60 implements jeh {
    public final View a;
    public final bz7 b;
    public final zy7 c;
    public final fxb d = new fxb();
    public final odg e = new odg(new z50(this, 0));
    public final z50 f = new z50(this, 1);
    public final z50 g = new z50(this, 2);
    public ActionMode h;
    public f60 i;
    public Runnable j;

    public g60(View view, bz7 bz7Var, zy7 zy7Var) {
        this.a = view;
        this.b = bz7Var;
        this.c = zy7Var;
    }

    @Override // defpackage.jeh
    public final Object a(beh behVar, xzg xzgVar) {
        Object objB = this.d.b(zwb.E, new ny(this, behVar, null, 1), xzgVar);
        return objB == m45.E ? objB : iei.a;
    }
}
