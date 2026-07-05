package defpackage;

import android.os.Trace;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rkh extends hqb implements pu9, vd6, ujf {
    public String S;
    public tkh T;
    public wt7 U;
    public int V;
    public boolean W;
    public int X;
    public int Y;
    public k54 Z;
    public HashMap a0;
    public hrc b0;
    public tkh c0;
    public pkh d0;
    public qkh e0;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        return q1(fmaVar).a(i, fmaVar.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    @Override // defpackage.vd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(defpackage.cv9 r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkh.I0(cv9):void");
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        return sf5.m(q1(fmaVar).e(fmaVar.getLayoutDirection()).f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bz7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pkh] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        pkh pkhVar = this.d0;
        ?? r0 = pkhVar;
        if (pkhVar == null) {
            final int i = 0;
            ?? r02 = new bz7(this) { // from class: pkh
                public final /* synthetic */ rkh F;

                {
                    this.F = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
                @Override // defpackage.bz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r33) {
                    /*
                        Method dump skipped, instruction units count: 320
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pkh.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.d0 = r02;
            r0 = r02;
        }
        ckf.w(ekfVar, new zb0(this.S));
        qkh qkhVar = this.e0;
        if (qkhVar != null) {
            boolean zC = qkhVar.c();
            dkf dkfVar = akf.E;
            wn9[] wn9VarArr = ckf.a;
            wn9 wn9Var = wn9VarArr[17];
            ekfVar.a(dkfVar, Boolean.valueOf(zC));
            zb0 zb0Var = new zb0(qkhVar.b());
            dkf dkfVar2 = akf.D;
            wn9 wn9Var2 = wn9VarArr[16];
            ekfVar.a(dkfVar2, zb0Var);
        }
        final int i2 = 1;
        ekfVar.a(ojf.l, new e5(null, new bz7(this) { // from class: pkh
            public final /* synthetic */ rkh F;

            {
                this.F = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pkh.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i3 = 2;
        ekfVar.a(ojf.m, new e5(null, new bz7(this) { // from class: pkh
            public final /* synthetic */ rkh F;

            {
                this.F = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.pkh.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        ekfVar.a(ojf.n, new e5(null, new p3f(17, this)));
        ckf.d(ekfVar, r0);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            hrc hrcVarQ1 = q1(q5bVar);
            boolean zB = hrcVarQ1.b(j, q5bVar.getLayoutDirection());
            frc frcVar = hrcVarQ1.n;
            if (frcVar != null) {
                frcVar.c();
            }
            x30 x30Var = hrcVarQ1.j;
            x30Var.getClass();
            wjh wjhVar = x30Var.d;
            long j2 = hrcVarQ1.l;
            if (zB) {
                yfd.U(this, 2).o1();
                HashMap map = this.a0;
                if (map == null) {
                    map = new HashMap(2);
                    this.a0 = map;
                }
                map.put(xt.a, Integer.valueOf(Math.round(wjhVar.d(0))));
                map.put(xt.b, Integer.valueOf(Math.round(wjhVar.d(wjhVar.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            c3d c3dVarU = h5bVar.u(sf5.G(i, i, i2, i2));
            HashMap map2 = this.a0;
            map2.getClass();
            return q5bVar.U(i, i2, map2, new mf1(c3dVarU, 9));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        return sf5.m(q1(fmaVar).e(fmaVar.getLayoutDirection()).j());
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        return q1(fmaVar).a(i, fmaVar.getLayoutDirection());
    }

    public final hrc p1() {
        tkh tkhVar = this.c0;
        if (tkhVar == null) {
            tkhVar = this.T;
        }
        tkh tkhVar2 = tkhVar;
        if (this.b0 == null) {
            this.b0 = new hrc(this.S, tkhVar2, this.U, this.V, this.W, this.X, this.Y);
        }
        hrc hrcVar = this.b0;
        hrcVar.getClass();
        return hrcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hrc q1(defpackage.q5b r10) {
        /*
            r9 = this;
            r0 = 1
            boolean r0 = r9.r1(r0)
            if (r0 == 0) goto L21
            tkh r0 = r9.c0
            if (r0 != 0) goto Ld
            tkh r0 = r9.T
        Ld:
            r3 = r0
            hrc r1 = r9.p1()
            java.lang.String r2 = r9.S
            wt7 r4 = r9.U
            int r5 = r9.V
            boolean r6 = r9.W
            int r7 = r9.X
            int r8 = r9.Y
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L21:
            qkh r0 = r9.e0
            if (r0 == 0) goto L35
            boolean r1 = r0.c()
            if (r1 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L35
            hrc r0 = r0.a()
            if (r0 != 0) goto L39
        L35:
            hrc r0 = r9.p1()
        L39:
            r0.d(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkh.q1(q5b):hrc");
    }

    public final boolean r1(int i) {
        tkh tkhVar = this.c0;
        tkh tkhVar2 = this.T;
        dae daeVar = new dae();
        daeVar.E = tkhVar2;
        j8.m0(this, "StyleOuterNode", new la0(daeVar, i, tkhVar2, 3));
        this.c0 = (tkh) daeVar.E;
        if (tkhVar == null) {
            return false;
        }
        return !tkhVar.equals(r6);
    }
}
