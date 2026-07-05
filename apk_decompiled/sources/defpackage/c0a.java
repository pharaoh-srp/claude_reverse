package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c0a implements a0a {
    public final wz5 a;
    public final /* synthetic */ x0a b;
    public final /* synthetic */ boolean c;

    public c0a(x0a x0aVar, boolean z) {
        this.b = x0aVar;
        this.c = z;
        this.a = mpk.w(new a23(x0aVar, 2));
    }

    @Override // defpackage.a0a
    public final int a() {
        x0a x0aVar = this.b;
        return (int) (x0aVar.h().p == ukc.E ? x0aVar.h().g() & 4294967295L : x0aVar.h().g() >> 32);
    }

    @Override // defpackage.a0a
    public final float b() {
        x0a x0aVar = this.b;
        return (((isc) x0aVar.e.b).h() * 500) + ((isc) x0aVar.e.c).h();
    }

    @Override // defpackage.a0a
    public final int c() {
        x0a x0aVar = this.b;
        return (-x0aVar.h().l) + x0aVar.h().q;
    }

    @Override // defpackage.a0a
    public final float d() {
        x0a x0aVar = this.b;
        int iH = ((isc) x0aVar.e.b).h();
        int iH2 = ((isc) x0aVar.e.c).h();
        return x0aVar.d() ? (iH * 500) + iH2 + 100.0f : (iH * 500) + iH2;
    }

    @Override // defpackage.a0a
    public final o44 e() {
        boolean z = this.c;
        wz5 wz5Var = this.a;
        return z ? new o44(((Number) wz5Var.getValue()).intValue(), 1) : new o44(1, ((Number) wz5Var.getValue()).intValue());
    }

    @Override // defpackage.a0a
    public final Object f(int i, e41 e41Var) {
        Object objK = x0a.k(this.b, i, e41Var);
        return objK == m45.E ? objK : iei.a;
    }
}
