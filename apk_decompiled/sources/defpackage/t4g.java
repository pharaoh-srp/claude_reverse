package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t4g {
    public final rwe a;
    public final r4g b;

    public t4g(rwe rweVar, r4g r4gVar) {
        rweVar.getClass();
        r4gVar.getClass();
        this.a = rweVar;
        this.b = r4gVar;
    }

    public final void a() {
        this.b.a();
    }

    public final boolean b() {
        return x44.M(((bf3) this.a.F.getValue()).c) < 1;
    }

    public final void c() {
        rwe rweVar = this.a;
        if (x44.M(((bf3) rweVar.F.getValue()).c) <= 1) {
            a();
            return;
        }
        rweVar.E.m(gge.i0, new hyf(26));
    }

    public final void d(Object obj) {
        obj.getClass();
        gyf gyfVar = new gyf(12, obj);
        hyf hyfVar = new hyf(27);
        rwe rweVar = this.a;
        rweVar.getClass();
        rweVar.E.m(gyfVar, hyfVar);
    }
}
