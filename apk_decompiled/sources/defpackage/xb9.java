package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class xb9 extends nf9 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater M = AtomicIntegerFieldUpdater.newUpdater(xb9.class, "_invoked$volatile");
    public final ty4 L;
    private volatile /* synthetic */ int _invoked$volatile;

    public xb9(ty4 ty4Var) {
        this.L = ty4Var;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return true;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        if (M.compareAndSet(this, 0, 1)) {
            this.L.invoke(th);
        }
    }
}
