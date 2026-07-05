package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq5 extends iwe implements by5 {
    public final zy1 b;
    public final lsc c;
    public final lsc d;

    public rq5(h86 h86Var) {
        super(h86Var);
        this.b = x44.a();
        Boolean bool = Boolean.FALSE;
        this.c = mpk.P(bool);
        this.d = mpk.P(bool);
    }

    @Override // defpackage.by5
    public final boolean D() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.by5
    public final void I() {
        this.c.setValue(Boolean.TRUE);
        this.d.setValue(Boolean.FALSE);
        gb9.D(this.a, null, null, new ed3(this, null, 27), 3);
    }

    @Override // defpackage.by5
    public final gh2 M() {
        return this.b;
    }

    public abstract Object O(tp4 tp4Var);

    @Override // defpackage.by5
    public final boolean s() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
