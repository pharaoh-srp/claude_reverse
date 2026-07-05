package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class l1c implements ll4 {
    public final ConnectivityManager a;

    public l1c(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.ll4
    public final k92 a(ql4 ql4Var) {
        ql4Var.getClass();
        return j8.q(new ba9(ql4Var, this, null, 8));
    }

    @Override // defpackage.ll4
    public final boolean b(tgj tgjVar) {
        return (tgjVar.j.d() == null && tgjVar.j.f() == t1c.E) ? false : true;
    }
}
