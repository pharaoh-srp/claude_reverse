package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class p78 extends c4a {
    public static final p78 b = new p78();
    public static final o78 c = new o78();

    @Override // defpackage.c4a
    public final void a(l4a l4aVar) {
        if (!(l4aVar instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((l4aVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) l4aVar;
        o78 o78Var = c;
        defaultLifecycleObserver.onCreate(o78Var);
        defaultLifecycleObserver.onStart(o78Var);
        defaultLifecycleObserver.onResume(o78Var);
    }

    @Override // defpackage.c4a
    public final a4a b() {
        return a4a.I;
    }

    @Override // defpackage.c4a
    public final void c(l4a l4aVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
