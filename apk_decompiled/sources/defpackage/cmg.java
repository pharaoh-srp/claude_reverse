package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cmg extends e4 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.e4
    public final boolean a(d4 d4Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(bmg.a);
        return true;
    }

    @Override // defpackage.e4
    public final tp4[] b(d4 d4Var) {
        this.a.set(null);
        return u00.b;
    }
}
