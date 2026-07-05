package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class taa implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ AtomicBoolean F;

    public /* synthetic */ taa(AtomicBoolean atomicBoolean, int i) {
        this.E = i;
        this.F = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        AtomicBoolean atomicBoolean = this.F;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
