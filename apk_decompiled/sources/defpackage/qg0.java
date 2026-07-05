package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class qg0 implements rn4, vdb {
    public final /* synthetic */ ah0 E;

    public /* synthetic */ qg0(ah0 ah0Var) {
        this.E = ah0Var;
    }

    @Override // defpackage.vdb
    public void a(vcb vcbVar, boolean z) {
        zg0 zg0Var;
        vcb vcbVarK = vcbVar.k();
        int i = 0;
        boolean z2 = vcbVarK != vcbVar;
        if (z2) {
            vcbVar = vcbVarK;
        }
        ah0 ah0Var = this.E;
        zg0[] zg0VarArr = ah0Var.i0;
        int length = zg0VarArr != null ? zg0VarArr.length : 0;
        while (true) {
            if (i < length) {
                zg0Var = zg0VarArr[i];
                if (zg0Var != null && zg0Var.h == vcbVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                zg0Var = null;
                break;
            }
        }
        if (zg0Var != null) {
            if (!z2) {
                ah0Var.i(zg0Var, z);
            } else {
                ah0Var.g(zg0Var.a, zg0Var, vcbVarK);
                ah0Var.i(zg0Var, true);
            }
        }
    }

    @Override // defpackage.vdb
    public boolean s(vcb vcbVar) {
        Window.Callback callback;
        if (vcbVar != vcbVar.k()) {
            return true;
        }
        ah0 ah0Var = this.E;
        if (!ah0Var.c0 || (callback = ah0Var.J.getCallback()) == null || ah0Var.n0) {
            return true;
        }
        callback.onMenuOpened(108, vcbVar);
        return true;
    }
}
