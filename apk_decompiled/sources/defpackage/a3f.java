package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class a3f implements tp4, n45 {
    public static final AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(a3f.class, Object.class, "result");
    public final tp4 E;
    private volatile Object result;

    public a3f(tp4 tp4Var, m45 m45Var) {
        this.E = tp4Var;
        this.result = m45Var;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        m45 m45Var = m45.F;
        if (obj == m45Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
            m45 m45Var2 = m45.E;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, m45Var, m45Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != m45Var) {
                    obj = this.result;
                }
            }
            return m45.E;
        }
        if (obj == m45.G) {
            return m45.E;
        }
        if (obj instanceof hre) {
            throw ((hre) obj).E;
        }
        return obj;
    }

    @Override // defpackage.n45
    public final n45 getCallerFrame() {
        tp4 tp4Var = this.E;
        if (tp4Var instanceof n45) {
            return (n45) tp4Var;
        }
        return null;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.E.getContext();
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            m45 m45Var = m45.F;
            if (obj2 == m45Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, m45Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != m45Var) {
                        break;
                    }
                }
                return;
            }
            m45 m45Var2 = m45.E;
            if (obj2 != m45Var2) {
                sz6.j("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F;
            m45 m45Var3 = m45.G;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, m45Var2, m45Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != m45Var2) {
                    break;
                }
            }
            this.E.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.E;
    }
}
