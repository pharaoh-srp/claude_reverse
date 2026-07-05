package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p2g extends e4 {
    public long a;
    public ua2 b;

    @Override // defpackage.e4
    public final boolean a(d4 d4Var) {
        n2g n2gVar = (n2g) d4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = n2gVar.M;
        if (j < n2gVar.N) {
            n2gVar.N = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.e4
    public final tp4[] b(d4 d4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((n2g) d4Var).x(j);
    }
}
