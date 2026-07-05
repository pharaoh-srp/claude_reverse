package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gr0 extends iwe {
    public final nu0 b;
    public final koi c;
    public final rc8 d;
    public final lsc e;
    public final zy1 f;
    public final lsc g;
    public final lsc h;

    public gr0(nu0 nu0Var, koi koiVar, rc8 rc8Var, h86 h86Var) {
        super(h86Var);
        this.b = nu0Var;
        this.c = koiVar;
        this.d = rc8Var;
        this.e = mpk.P(Boolean.FALSE);
        this.f = x44.a();
        this.g = mpk.P(lm6.E);
        this.h = mpk.P(Boolean.TRUE);
        O();
    }

    public final void O() {
        lsc lscVar = this.e;
        if (((Boolean) lscVar.getValue()).booleanValue() || !((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        lscVar.setValue(Boolean.TRUE);
        gb9.D(this.a, null, null, new cj(this, null, 3), 3);
    }
}
