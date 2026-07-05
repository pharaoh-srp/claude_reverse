package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bhe {
    public final /* synthetic */ q0a a;
    public final /* synthetic */ ukc b;

    public bhe(q0a q0aVar, ukc ukcVar) {
        this.a = q0aVar;
        this.b = ukcVar;
    }

    public final q0a a() {
        return this.a;
    }

    public final int b() {
        return this.a.a;
    }

    public final Object c() {
        return this.a.l;
    }

    public final long d() {
        int i = this.a.p;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return yfd.e(0, i);
        }
        if (iOrdinal == 1) {
            return yfd.e(i, 0);
        }
        wg6.i();
        return 0L;
    }

    public final long e() {
        int i = this.a.q;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return csg.f(0, i);
        }
        if (iOrdinal == 1) {
            return csg.f(i, 0);
        }
        wg6.i();
        return 0L;
    }
}
