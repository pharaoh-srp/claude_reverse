package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xph implements b4f {
    public final b4f E;
    public final long F;

    public xph(b4f b4fVar, long j) {
        this.E = b4fVar;
        this.F = j;
    }

    @Override // defpackage.b4f
    public final boolean a() {
        return this.E.a();
    }

    @Override // defpackage.b4f
    public final int b(qb5 qb5Var, ro5 ro5Var, int i) {
        int iB = this.E.b(qb5Var, ro5Var, i);
        if (iB == -4) {
            ro5Var.K += this.F;
        }
        return iB;
    }

    @Override // defpackage.b4f
    public final void g() {
        this.E.g();
    }

    @Override // defpackage.b4f
    public final int h(long j) {
        return this.E.h(j - this.F);
    }
}
