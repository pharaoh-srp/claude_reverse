package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o16 extends jrd implements u06 {
    public final ctd e0;
    public final txb f0;
    public final cbi g0;
    public final zp3 h0;
    public final d16 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o16(bo5 bo5Var, hrd hrdVar, wc0 wc0Var, int i, ow5 ow5Var, boolean z, sxb sxbVar, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ctd ctdVar, txb txbVar, cbi cbiVar, zp3 zp3Var, d16 d16Var) {
        super(bo5Var, hrdVar, wc0Var, i, ow5Var, z, sxbVar, i2, neg.n, z2, z3, z6, z4, z5);
        bo5Var.getClass();
        wc0Var.getClass();
        if (i == 0) {
            throw null;
        }
        ow5Var.getClass();
        sxbVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        ctdVar.getClass();
        txbVar.getClass();
        cbiVar.getClass();
        zp3Var.getClass();
        this.e0 = ctdVar;
        this.f0 = txbVar;
        this.g0 = cbiVar;
        this.h0 = zp3Var;
        this.i0 = d16Var;
    }

    @Override // defpackage.g16
    public final cbi C() {
        return this.g0;
    }

    @Override // defpackage.g16
    public final txb J() {
        return this.f0;
    }

    @Override // defpackage.g16
    public final d16 L() {
        return this.i0;
    }

    @Override // defpackage.jrd
    public final jrd P0(bo5 bo5Var, int i, ow5 ow5Var, hrd hrdVar, int i2, sxb sxbVar) {
        bo5Var.getClass();
        if (i == 0) {
            throw null;
        }
        ow5Var.getClass();
        if (i2 == 0) {
            throw null;
        }
        sxbVar.getClass();
        return new o16(bo5Var, hrdVar, getAnnotations(), i, ow5Var, this.J, sxbVar, i2, this.R, this.S, isExternal(), this.V, this.T, this.e0, this.f0, this.g0, this.h0, this.i0);
    }

    public final ctd V0() {
        return this.e0;
    }

    @Override // defpackage.jrd, defpackage.w9b
    public final boolean isExternal() {
        return on7.D.e(this.e0.H).booleanValue();
    }

    @Override // defpackage.g16
    public final b3 t() {
        return this.e0;
    }
}
