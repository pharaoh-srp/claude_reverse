package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 {
    public final c9i a;
    public final Object b;
    public final long c;
    public final zy7 d;
    public final lsc e;
    public sb0 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final lsc i = mpk.P(Boolean.TRUE);

    public lb0(Object obj, c9i c9iVar, sb0 sb0Var, long j, Object obj2, long j2, zy7 zy7Var) {
        this.a = c9iVar;
        this.b = obj2;
        this.c = j2;
        this.d = zy7Var;
        this.e = mpk.P(obj);
        this.f = j8.w(sb0Var);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.a();
    }

    public final Object b() {
        return this.a.b().invoke(this.f);
    }
}
