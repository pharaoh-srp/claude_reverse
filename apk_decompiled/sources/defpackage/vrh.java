package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes2.dex */
public final class vrh extends ko3 {
    public boolean r0;
    public bz7 s0;
    public final g2h t0;

    public vrh(boolean z, zub zubVar, h19 h19Var, boolean z2, boolean z3, vue vueVar, bz7 bz7Var) {
        super(zubVar, h19Var, z2, z3, null, vueVar, new gv0(3, bz7Var, z));
        this.r0 = z;
        this.s0 = bz7Var;
        this.t0 = new g2h(7, this);
    }

    @Override // defpackage.u0
    public final void s1(ekf ekfVar) {
        ckf.x(ekfVar, this.r0 ? wrh.E : wrh.F);
        ckf.k(ekfVar, lz1.I);
        ckf.o(ekfVar, new g20(AutofillValue.forToggle(this.r0)));
        ckf.h(ekfVar, new urh(ekfVar, 0));
    }
}
