package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h1a implements a0a {
    public final /* synthetic */ lx9 a;

    public h1a(lx9 lx9Var) {
        this.a = lx9Var;
    }

    @Override // defpackage.a0a
    public final int a() {
        lx9 lx9Var = this.a;
        return (int) (lx9Var.g().q == ukc.E ? lx9Var.g().g() & 4294967295L : lx9Var.g().g() >> 32);
    }

    @Override // defpackage.a0a
    public final float b() {
        lx9 lx9Var = this.a;
        return (((isc) lx9Var.d.b).h() * 500) + ((isc) lx9Var.d.c).h();
    }

    @Override // defpackage.a0a
    public final int c() {
        lx9 lx9Var = this.a;
        return (-lx9Var.g().n) + lx9Var.g().r;
    }

    @Override // defpackage.a0a
    public final float d() {
        lx9 lx9Var = this.a;
        int iH = ((isc) lx9Var.d.b).h();
        int iH2 = ((isc) lx9Var.d.c).h();
        return lx9Var.d() ? (iH * 500) + iH2 + 100.0f : (iH * 500) + iH2;
    }

    @Override // defpackage.a0a
    public final o44 e() {
        return new o44(-1, -1);
    }

    @Override // defpackage.a0a
    public final Object f(int i, e41 e41Var) {
        y5f y5fVar = lx9.w;
        lx9 lx9Var = this.a;
        lx9Var.getClass();
        Object objC = lx9Var.c(zwb.E, new al8(lx9Var, i, (tp4) null), e41Var);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objC != m45Var) {
            objC = ieiVar;
        }
        return objC == m45Var ? objC : ieiVar;
    }
}
