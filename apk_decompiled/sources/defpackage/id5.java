package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class id5 implements xwg {
    public static final i12 G = new i12(new ed5(3), dyb.F);
    public final nz8 E;
    public final long[] F;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public id5(defpackage.vde r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id5.<init>(vde):void");
    }

    @Override // defpackage.xwg
    public final int d(long j) {
        int iA = tpi.a(this.F, j, false);
        if (iA < this.E.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.xwg
    public final long g(int i) {
        fd9.E(i < this.E.size());
        return this.F[i];
    }

    @Override // defpackage.xwg
    public final List i(long j) {
        int iD = tpi.d(this.F, j, false);
        if (iD != -1) {
            return (nz8) this.E.get(iD);
        }
        iz8 iz8Var = nz8.F;
        return vde.I;
    }

    @Override // defpackage.xwg
    public final int l() {
        return this.E.size();
    }
}
