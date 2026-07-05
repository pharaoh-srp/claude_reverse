package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class a7d implements u6d {
    public final t6d a;
    public final pz7 b;
    public final ua2 c;
    public final AtomicBoolean d;

    public a7d(t6d t6dVar, pz7 pz7Var, ua2 ua2Var) {
        pz7Var.getClass();
        this.a = t6dVar;
        this.b = pz7Var;
        this.c = ua2Var;
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.u6d
    public final void s(v77 v77Var, t6d t6dVar) {
        AtomicBoolean atomicBoolean = this.d;
        v77Var.getClass();
        try {
            if (atomicBoolean.get()) {
                return;
            }
            t6d t6dVar2 = this.a;
            if (t6dVar2 != null) {
                en7 en7Var = t6dVar.a;
                en7 en7Var2 = t6dVar2.a;
                for (int i = 0; i < en7Var2.a.size(); i++) {
                    if (!en7Var.a.get(en7Var2.a(i))) {
                    }
                }
                return;
            }
            this.b.invoke(v77Var, t6dVar);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            this.c.resumeWith(new hre(th));
        }
    }
}
