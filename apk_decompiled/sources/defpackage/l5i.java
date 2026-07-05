package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l5i implements ymf {
    public final ymf a;
    public final bz7 b;

    public l5i(ymf ymfVar, bz7 bz7Var) {
        ymfVar.getClass();
        bz7Var.getClass();
        this.a = ymfVar;
        this.b = bz7Var;
    }

    public final rn7 c(d6f d6fVar) {
        return new rn7(this.a, this.b, d6fVar);
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new k5i(this);
    }
}
