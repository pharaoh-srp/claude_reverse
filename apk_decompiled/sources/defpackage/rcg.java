package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rcg {
    public wcg a;
    public long b;
    public boolean c;
    public int d;

    public rcg(long j, wcg wcgVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = wcgVar;
        this.b = j;
        a6f a6fVar = ycg.a;
        if (j != 0) {
            wcg wcgVarD = d();
            long j2 = wcgVarD.G;
            long[] jArr = wcgVarD.H;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = wcgVarD.F;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = wcgVarD.E;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (ycg.c) {
                iA = ycg.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(rcg rcgVar) {
        ycg.b.c(rcgVar);
    }

    public final void a() {
        synchronized (ycg.c) {
            b();
            p();
        }
    }

    public void b() {
        ycg.d = ycg.d.e(g());
    }

    public abstract void c();

    public wcg d() {
        return this.a;
    }

    public abstract bz7 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract bz7 i();

    public final rcg j() {
        w3c w3cVar = ycg.b;
        rcg rcgVar = (rcg) w3cVar.get();
        w3cVar.c(this);
        return rcgVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(img imgVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ycg.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(wcg wcgVar) {
        this.a = wcgVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract rcg u(bz7 bz7Var);
}
