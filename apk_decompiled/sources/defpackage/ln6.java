package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ln6 implements kn6 {
    public volatile kn6 E;

    static {
        AtomicReferenceFieldUpdater.newUpdater(ln6.class, kn6.class, "E");
    }

    @Override // defpackage.kn6
    public final void i(cf5 cf5Var) {
        this.E.i(cf5Var);
    }

    @Override // defpackage.kn6
    public final void l(cf5 cf5Var) {
        this.E.l(cf5Var);
    }
}
