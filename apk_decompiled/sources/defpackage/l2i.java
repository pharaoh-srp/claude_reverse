package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l2i {
    public final fxb a;
    public final swb b = new swb(Boolean.FALSE);
    public ua2 c;

    public l2i(fxb fxbVar) {
        this.a = fxbVar;
    }

    public final void a() {
        this.b.M0(Boolean.FALSE);
    }

    public final boolean b() {
        swb swbVar = this.b;
        return ((Boolean) swbVar.F.getValue()).booleanValue() || ((Boolean) swbVar.G.getValue()).booleanValue();
    }

    public final Object c(zwb zwbVar, xzg xzgVar) {
        tp4 tp4Var = null;
        Object objB = this.a.b(zwbVar, new py(this, zwbVar, new hm(this, tp4Var, 7), tp4Var, 8), xzgVar);
        return objB == m45.E ? objB : iei.a;
    }
}
