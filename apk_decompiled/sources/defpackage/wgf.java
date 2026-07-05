package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wgf extends qw5 implements pu9, vd6, r78 {
    public yhf U;
    public final kdh V;

    public wgf(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, bz7 bz7Var, int i, boolean z, int i2, int i3, List list, bz7 bz7Var2, yhf yhfVar, k54 k54Var) {
        this.U = yhfVar;
        kdh kdhVar = new kdh(zb0Var, tkhVar, wt7Var, bz7Var, i, z, i2, i3, list, bz7Var2, yhfVar, k54Var, null);
        p1(kdhVar);
        this.V = kdhVar;
        if (this.U == null) {
            throw vb7.x("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        return this.V.A0(fmaVar, h5bVar, i);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        this.V.I0(cv9Var);
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        return this.V.N0(fmaVar, h5bVar, i);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        return this.V.b(q5bVar, h5bVar, j);
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        return this.V.h(fmaVar, h5bVar, i);
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        return this.V.l0(fmaVar, h5bVar, i);
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        yhf yhfVar = this.U;
        if (yhfVar != null) {
            yhfVar.H = epk.p(yhfVar.H, m5cVar, null, 2);
            sif sifVar = yhfVar.F;
            long j = yhfVar.E;
            tif tifVar = (tif) sifVar;
            tifVar.a = false;
            uhf uhfVar = tifVar.e;
            if (uhfVar != null) {
                uhfVar.invoke(Long.valueOf(j));
            }
        }
    }
}
