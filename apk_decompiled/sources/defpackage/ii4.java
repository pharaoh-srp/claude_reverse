package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class ii4 implements DefaultLifecycleObserver {
    public final d7 E;
    public boolean F;

    public ii4(d7 d7Var) {
        this.E = d7Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(m4a m4aVar) {
        m4aVar.getClass();
        this.F = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        m4aVar.getClass();
        if (this.F) {
            this.E.a();
        }
    }
}
