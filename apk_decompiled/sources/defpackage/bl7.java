package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bl7 implements ymf {
    public final ymf a;
    public final boolean b;
    public final bz7 c;

    public bl7(ymf ymfVar, boolean z, bz7 bz7Var) {
        ymfVar.getClass();
        bz7Var.getClass();
        this.a = ymfVar;
        this.b = z;
        this.c = bz7Var;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new al7(this);
    }
}
