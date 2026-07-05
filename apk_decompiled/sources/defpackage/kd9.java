package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class kd9 implements DefaultLifecycleObserver {
    public final /* synthetic */ md9 E;

    public kd9(md9 md9Var) {
        this.E = md9Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(m4a m4aVar) {
        m4aVar.getClass();
        cd9 cd9Var = this.E.g;
        if (cd9Var != null) {
            cd9Var.a(false);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        m4aVar.getClass();
        cd9 cd9Var = this.E.g;
        if (cd9Var != null) {
            cd9Var.a(true);
        }
    }
}
