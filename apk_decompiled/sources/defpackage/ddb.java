package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class ddb implements ActionProvider.VisibilityListener {
    public ro6 a;
    public final ActionProvider b;

    public ddb(gdb gdbVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ro6 ro6Var = this.a;
        if (ro6Var != null) {
            vcb vcbVar = ((adb) ro6Var.F).n;
            vcbVar.h = true;
            vcbVar.p(true);
        }
    }
}
