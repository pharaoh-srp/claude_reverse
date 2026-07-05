package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements DefaultLifecycleObserver {
    public final /* synthetic */ int E;
    public final /* synthetic */ ua2 F;

    public /* synthetic */ i(ua2 ua2Var, int i) {
        this.E = i;
        this.F = ua2Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        int i = this.E;
        iei ieiVar = iei.a;
        ua2 ua2Var = this.F;
        switch (i) {
            case 0:
                ua2Var.resumeWith(ieiVar);
                break;
            default:
                ua2Var.resumeWith(ieiVar);
                break;
        }
    }
}
