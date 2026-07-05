package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class swb extends rok {
    public final lsc F;
    public final lsc G;

    public swb(Object obj) {
        super(7);
        this.F = mpk.P(obj);
        this.G = mpk.P(obj);
    }

    public final boolean L0() {
        return x44.r(this.F.getValue(), this.G.getValue()) && !((Boolean) ((lsc) this.E).getValue()).booleanValue();
    }

    public final void M0(Object obj) {
        this.G.setValue(obj);
    }

    @Override // defpackage.rok
    public final Object q0() {
        return this.F.getValue();
    }

    @Override // defpackage.rok
    public final Object t0() {
        return this.G.getValue();
    }

    @Override // defpackage.rok
    public final void x0(Object obj) {
        this.F.setValue(obj);
    }

    @Override // defpackage.rok
    public final void y0(a6i a6iVar) {
    }

    @Override // defpackage.rok
    public final void z0() {
    }
}
