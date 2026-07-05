package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.m4a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements DefaultLifecycleObserver {
    public final d0 E = new d0(this);
    public final /* synthetic */ f0 F;

    public e0(f0 f0Var) {
        this.F = f0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        this.F.H = Boolean.FALSE;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).i();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        this.F.H = Boolean.TRUE;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).x();
        }
    }
}
