package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l2g implements y86 {
    public final n2g E;
    public final long F;
    public final Object G;
    public final ua2 H;

    public l2g(n2g n2gVar, long j, Object obj, ua2 ua2Var) {
        this.E = n2gVar;
        this.F = j;
        this.G = obj;
        this.H = ua2Var;
    }

    @Override // defpackage.y86
    public final void a() {
        n2g n2gVar = this.E;
        synchronized (n2gVar) {
            if (this.F >= n2gVar.r()) {
                Object[] objArr = n2gVar.L;
                objArr.getClass();
                long j = this.F;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    o2g.c(objArr, j, o2g.a);
                    n2gVar.m();
                }
            }
        }
    }
}
