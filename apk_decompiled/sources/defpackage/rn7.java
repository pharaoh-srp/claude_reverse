package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rn7 implements ymf {
    public final ymf a;
    public final bz7 b;
    public final bz7 c;

    public rn7(ymf ymfVar, bz7 bz7Var, bz7 bz7Var2) {
        ymfVar.getClass();
        bz7Var.getClass();
        this.a = ymfVar;
        this.b = bz7Var;
        this.c = bz7Var2;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new qn7(this);
    }
}
