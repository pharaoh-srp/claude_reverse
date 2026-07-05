package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class re1 implements DefaultLifecycleObserver, cje {
    public final /* synthetic */ int E;
    public final c4a F;
    public final lf9 G;

    public /* synthetic */ re1(c4a c4aVar, lf9 lf9Var, int i) {
        this.E = i;
        this.F = c4aVar;
        this.G = lf9Var;
    }

    @Override // defpackage.cje
    public Object a(o4e o4eVar) {
        return awj.d(this.F, o4eVar);
    }

    @Override // defpackage.cje
    public void b() {
        this.F.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(m4a m4aVar) {
        int i = this.E;
        lf9 lf9Var = this.G;
        switch (i) {
            case 0:
                lf9Var.d(null);
                break;
            default:
                lf9Var.d(null);
                break;
        }
    }

    @Override // defpackage.cje
    public void start() {
        this.F.a(this);
    }
}
