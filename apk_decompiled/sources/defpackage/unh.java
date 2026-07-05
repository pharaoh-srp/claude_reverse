package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class unh implements a45 {
    public final Object E;
    public final ThreadLocal F;
    public final wnh G;

    public unh(Object obj, ThreadLocal threadLocal) {
        this.E = obj;
        this.F = threadLocal;
        this.G = new wnh(threadLocal);
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return this.G.equals(b45Var) ? im6.E : this;
    }

    public final void a(Object obj) {
        this.F.set(obj);
    }

    public final Object b() {
        ThreadLocal threadLocal = this.F;
        Object obj = threadLocal.get();
        threadLocal.set(this.E);
        return obj;
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return this.G;
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.E + ", threadLocal = " + this.F + ')';
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        if (this.G.equals(b45Var)) {
            return this;
        }
        return null;
    }
}
