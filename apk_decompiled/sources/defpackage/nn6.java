package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nn6 extends iwe {
    public final fk0 b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final isc g;
    public final wz5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn6(ze0 ze0Var, fk0 fk0Var, h86 h86Var) {
        super(h86Var);
        ze0Var.getClass();
        this.b = fk0Var;
        this.c = mpk.P(null);
        this.d = mpk.P(ze0Var);
        this.e = mpk.P("https");
        this.f = mpk.P("example.com");
        this.g = new isc(443);
        this.h = mpk.w(new mn6(this, 0));
    }

    public final ze0 O() {
        return (ze0) this.d.getValue();
    }

    public final void P(int i) {
        this.g.i(i);
    }
}
