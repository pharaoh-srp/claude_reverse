package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m4h implements ymf {
    public final ymf a;
    public final bz7 b;

    public m4h(ymf ymfVar, bz7 bz7Var) {
        ymfVar.getClass();
        this.a = ymfVar;
        this.b = bz7Var;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new qn7(this);
    }
}
