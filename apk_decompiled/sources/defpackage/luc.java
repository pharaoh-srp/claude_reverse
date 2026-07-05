package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class luc implements dh4 {
    public final mze E;
    public final String F;
    public final pz7 G;
    public final u0h H = new u0h(new dg8(20, this));

    public luc(mze mzeVar, String str, pz7 pz7Var) {
        this.E = mzeVar;
        this.F = str;
        this.G = pz7Var;
    }

    @Override // defpackage.dh4
    public final Object D(boolean z, pz7 pz7Var, vp4 vp4Var) {
        kuc kucVar = (kuc) vp4Var.getContext().x0(kuc.F);
        juc jucVar = kucVar != null ? kucVar.E : null;
        if (jucVar != null) {
            return pz7Var.invoke(jucVar, vp4Var);
        }
        juc jucVar2 = new juc(this.G, (lze) this.H.getValue());
        return gb9.c0(new kuc(jucVar2), new rrb(pz7Var, jucVar2, null, 1), vp4Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        u0h u0hVar = this.H;
        if (u0hVar.b()) {
            ((lze) u0hVar.getValue()).close();
        }
    }
}
