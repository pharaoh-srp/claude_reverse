package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ea1 extends nf9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater O = AtomicReferenceFieldUpdater.newUpdater(ea1.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long P = yf4.a.objectFieldOffset(ea1.class.getDeclaredField("_disposer$volatile"));
    public final ua2 L;
    public y86 M;
    public final /* synthetic */ ga1 N;
    private volatile /* synthetic */ Object _disposer$volatile;

    public ea1(ga1 ga1Var, ua2 ua2Var) {
        this.N = ga1Var;
        this.L = ua2Var;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return false;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        ua2 ua2Var = this.L;
        if (th != null) {
            sqb sqbVarH = ua2Var.H(new e94(th, false), null);
            if (sqbVarH != null) {
                ua2Var.u(sqbVarH);
                fa1 fa1VarT = t();
                if (fa1VarT != null) {
                    fa1VarT.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ga1.b;
        ga1 ga1Var = this.N;
        if (atomicIntegerFieldUpdater.decrementAndGet(ga1Var) == 0) {
            yv5[] yv5VarArr = ga1Var.a;
            ArrayList arrayList = new ArrayList(yv5VarArr.length);
            for (yv5 yv5Var : yv5VarArr) {
                arrayList.add(yv5Var.e());
            }
            ua2Var.resumeWith(arrayList);
        }
    }

    public final fa1 t() {
        O.getClass();
        return (fa1) yf4.a.getObjectVolatile(this, P);
    }

    public final void u(fa1 fa1Var) {
        O.getClass();
        yf4.a.putObjectVolatile(this, P, fa1Var);
    }
}
