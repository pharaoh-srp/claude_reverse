package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b0a implements a0a {
    public final /* synthetic */ koc a;
    public final /* synthetic */ boolean b;

    public b0a(koc kocVar, boolean z) {
        this.a = kocVar;
        this.b = z;
    }

    @Override // defpackage.a0a
    public final int a() {
        koc kocVar = this.a;
        return (int) (kocVar.k().e == ukc.E ? kocVar.k().g() & 4294967295L : kocVar.k().g() >> 32);
    }

    @Override // defpackage.a0a
    public final float b() {
        return xzk.y(this.a);
    }

    @Override // defpackage.a0a
    public final int c() {
        koc kocVar = this.a;
        return (-kocVar.k().f) + kocVar.k().d;
    }

    @Override // defpackage.a0a
    public final float d() {
        koc kocVar = this.a;
        return moc.a(kocVar.k(), kocVar.l());
    }

    @Override // defpackage.a0a
    public final o44 e() {
        boolean z = this.b;
        koc kocVar = this.a;
        return z ? new o44(kocVar.l(), 1) : new o44(1, kocVar.l());
    }

    @Override // defpackage.a0a
    public final Object f(int i, e41 e41Var) {
        Object objR = koc.r(this.a, i, e41Var);
        return objR == m45.E ? objR : iei.a;
    }
}
