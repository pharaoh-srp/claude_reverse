package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b86 extends n7f {
    public static final /* synthetic */ AtomicIntegerFieldUpdater K = AtomicIntegerFieldUpdater.newUpdater(b86.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.n7f, defpackage.vf9
    public final void t(Object obj) {
        v(obj);
    }

    @Override // defpackage.n7f, defpackage.vf9
    public final void v(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = K;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    a86.a(zni.I(this.J), dgj.L(obj));
                    return;
                } else {
                    sz6.j("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
