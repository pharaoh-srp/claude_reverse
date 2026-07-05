package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class xo9 extends hqb implements wo9 {
    public bz7 S;
    public bz7 T;

    @Override // defpackage.wo9
    public final boolean L(KeyEvent keyEvent) {
        bz7 bz7Var = this.S;
        if (bz7Var != null) {
            return ((Boolean) bz7Var.invoke(so9.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.wo9
    public final boolean l(KeyEvent keyEvent) {
        bz7 bz7Var = this.T;
        if (bz7Var != null) {
            return ((Boolean) bz7Var.invoke(so9.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
