package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rp1 implements vef {
    public final tp1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public rp1(tp1 tp1Var, long j, long j2, long j3, long j4, long j5) {
        this.a = tp1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        xef xefVar = new xef(j, sp1.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new uef(xefVar, xefVar);
    }

    @Override // defpackage.vef
    public final long g() {
        return this.b;
    }
}
