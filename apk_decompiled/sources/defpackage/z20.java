package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z20 implements DefaultLifecycleObserver {
    public final v3a E;
    public final l80 F;

    public z20(v3a v3aVar, l80 l80Var) {
        this.E = v3aVar;
        this.F = l80Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(m4a m4aVar) {
        m4aVar.getClass();
        this.E.onCreate();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(m4a m4aVar) throws IOException {
        m4aVar.getClass();
        this.E.onDestroy();
        this.F.a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(m4a m4aVar) {
        m4aVar.getClass();
        this.E.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        m4aVar.getClass();
        this.E.onResume();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        m4aVar.getClass();
        this.E.c();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        this.E.b();
    }
}
