package defpackage;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fxb {
    public final AtomicReference a = new AtomicReference(null);
    public final jxb b = new jxb();

    public static final void a(fxb fxbVar, bxb bxbVar) {
        AtomicReference atomicReference = fxbVar.a;
        while (true) {
            bxb bxbVar2 = (bxb) atomicReference.get();
            if (bxbVar2 != null && bxbVar.a.compareTo(bxbVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(bxbVar2, bxbVar)) {
                if (atomicReference.get() != bxbVar2) {
                    break;
                }
            }
            if (bxbVar2 != null) {
                bxbVar2.b.d(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public final Object b(zwb zwbVar, bz7 bz7Var, tp4 tp4Var) {
        return fd9.N(new dxb(zwbVar, this, bz7Var, null), tp4Var);
    }
}
