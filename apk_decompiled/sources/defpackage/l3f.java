package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l3f implements kw9, Serializable {
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(l3f.class, Object.class, "F");
    public volatile zy7 E;
    public volatile Object F;

    @Override // defpackage.kw9
    public final boolean b() {
        return this.F != lja.d0;
    }

    @Override // defpackage.kw9
    public final Object getValue() {
        Object obj = this.F;
        lja ljaVar = lja.d0;
        if (obj != ljaVar) {
            return obj;
        }
        zy7 zy7Var = this.E;
        if (zy7Var != null) {
            Object objA = zy7Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ljaVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != ljaVar) {
                }
            }
            this.E = null;
            return objA;
        }
        return this.F;
    }

    public final String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
