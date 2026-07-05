package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class s5c {
    public static final mvb a;

    static {
        mvb mvbVar = vac.a;
        a = new mvb();
    }

    public static final void a(hqb hqbVar, int i, int i2) {
        if (!(hqbVar instanceof qw5)) {
            b(hqbVar, i & hqbVar.G, i2);
            return;
        }
        qw5 qw5Var = (qw5) hqbVar;
        int i3 = qw5Var.S;
        b(hqbVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (hqb hqbVar2 = qw5Var.T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
            a(hqbVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(hqb hqbVar, int i, int i2) {
        if (i2 != 0 || hqbVar.e1()) {
            if ((i & 2) != 0 && (hqbVar instanceof pu9)) {
                yfd.W((pu9) hqbVar).T();
                if (i2 == 2) {
                    yfd.U(hqbVar, 2).t1();
                }
            }
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 && i2 != 2) {
                yfd.W(hqbVar).T();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                yfd.W(hqbVar).u0(false);
            }
            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 && (hqbVar instanceof r78)) {
                if (i2 == 1) {
                    av9 av9VarW = yfd.W(hqbVar);
                    av9VarW.A0(av9VarW.t0 + 1);
                } else if (i2 == 2) {
                    yfd.W(hqbVar).A0(r0.t0 - 1);
                }
                if (i2 != 2) {
                    av9 av9VarW2 = yfd.W(hqbVar);
                    if (av9VarW2.t0 != 0 && !av9VarW2.u() && !av9VarW2.B() && !av9VarW2.s0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) dv9.a(av9VarW2);
                        q28 q28Var = androidComposeView.D0.e;
                        q28Var.getClass();
                        if (av9VarW2.t0 > 0) {
                            ((wwb) q28Var.F).b(av9VarW2);
                            av9VarW2.s0 = true;
                        }
                        androidComposeView.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (hqbVar instanceof vd6)) {
                wd6.t0((vd6) hqbVar);
            }
            if ((i & 8) != 0 && (hqbVar instanceof ujf)) {
                yfd.W(hqbVar).W = true;
            }
            if ((i & 64) != 0 && (hqbVar instanceof nsc)) {
                yfd.W((nsc) hqbVar).U();
            }
            if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 && (hqbVar instanceof ys7)) {
                ys7 ys7Var = (ys7) hqbVar;
                ma2.b = null;
                ys7Var.K(ma2.a);
                if (ma2.b != null) {
                    bok.i(ys7Var);
                }
            }
            if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && (hqbVar instanceof ds7)) {
                ds7 ds7Var = (ds7) hqbVar;
                ns7 ns7Var = ((ts7) yfd.X(ds7Var).getFocusOwner()).d;
                if (ns7Var.d.a(ds7Var)) {
                    ns7Var.a();
                }
            }
            if ((i & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 && (hqbVar instanceof u19) && i2 == 2) {
                ((u19) hqbVar).v0();
            }
        }
    }

    public static final void c(hqb hqbVar) {
        if (!hqbVar.R) {
            b39.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(hqbVar, -1, 0);
    }

    public static final int d(gqb gqbVar) {
        int i = gqbVar instanceof mu9 ? 3 : 1;
        if (gqbVar instanceof ud6) {
            i |= 4;
        }
        if (gqbVar instanceof sjf) {
            i |= 8;
        }
        if (gqbVar instanceof c8d) {
            i |= 16;
        }
        if (gqbVar instanceof fhh) {
            i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        if (gqbVar instanceof msc) {
            i |= 64;
        }
        return gqbVar instanceof lx1 ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(defpackage.hqb r4) {
        /*
            int r0 = r4.G
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r4.getClass()
            mvb r1 = defpackage.s5c.a
            int r2 = r1.d(r0)
            if (r2 < 0) goto L16
            int[] r4 = r1.c
            r4 = r4[r2]
            return r4
        L16:
            boolean r2 = r4 instanceof defpackage.pu9
            if (r2 == 0) goto L1c
            r2 = 3
            goto L1d
        L1c:
            r2 = 1
        L1d:
            boolean r3 = r4 instanceof defpackage.vd6
            if (r3 == 0) goto L23
            r2 = r2 | 4
        L23:
            boolean r3 = r4 instanceof defpackage.ujf
            if (r3 == 0) goto L29
            r2 = r2 | 8
        L29:
            boolean r3 = r4 instanceof defpackage.d8d
            if (r3 == 0) goto L2f
            r2 = r2 | 16
        L2f:
            boolean r3 = r4 instanceof defpackage.mqb
            if (r3 == 0) goto L35
            r2 = r2 | 32
        L35:
            boolean r3 = r4 instanceof defpackage.nsc
            if (r3 == 0) goto L3b
            r2 = r2 | 64
        L3b:
            boolean r3 = r4 instanceof defpackage.hec
            if (r3 == 0) goto L43
            r3 = 4194304(0x400000, float:5.877472E-39)
        L41:
            r2 = r2 | r3
            goto L51
        L43:
            boolean r3 = r4 instanceof defpackage.yt9
            if (r3 == 0) goto L4b
            r3 = 4194432(0x400080, float:5.877651E-39)
            goto L41
        L4b:
            boolean r3 = r4 instanceof defpackage.s5b
            if (r3 == 0) goto L51
            r2 = r2 | 128(0x80, float:1.8E-43)
        L51:
            boolean r3 = r4 instanceof defpackage.r78
            if (r3 == 0) goto L57
            r2 = r2 | 256(0x100, float:3.59E-43)
        L57:
            boolean r3 = r4 instanceof defpackage.qn0
            if (r3 == 0) goto L5d
            r2 = r2 | 512(0x200, float:7.17E-43)
        L5d:
            boolean r3 = r4 instanceof defpackage.jt7
            if (r3 == 0) goto L63
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L63:
            boolean r3 = r4 instanceof defpackage.ys7
            if (r3 == 0) goto L69
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L69:
            boolean r3 = r4 instanceof defpackage.ds7
            if (r3 == 0) goto L6f
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L6f:
            boolean r3 = r4 instanceof defpackage.wo9
            if (r3 == 0) goto L75
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L75:
            boolean r3 = r4 instanceof defpackage.tz
            if (r3 == 0) goto L7b
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L7b:
            boolean r3 = r4 instanceof defpackage.oe4
            if (r3 == 0) goto L83
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r3
        L83:
            boolean r3 = r4 instanceof defpackage.e89
            if (r3 == 0) goto L8a
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
        L8a:
            boolean r3 = r4 instanceof defpackage.p6i
            if (r3 == 0) goto L91
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
        L91:
            boolean r3 = r4 instanceof defpackage.lx1
            if (r3 == 0) goto L98
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
        L98:
            boolean r3 = r4 instanceof defpackage.u19
            if (r3 == 0) goto L9f
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r3
        L9f:
            boolean r4 = r4 instanceof defpackage.wy9
            if (r4 == 0) goto La6
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r4
        La6:
            r1.h(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.e(hqb):int");
    }

    public static final int f(hqb hqbVar) {
        if (!(hqbVar instanceof qw5)) {
            return e(hqbVar);
        }
        qw5 qw5Var = (qw5) hqbVar;
        int iF = qw5Var.S;
        for (hqb hqbVar2 = qw5Var.T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
            iF |= f(hqbVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) | ((i & 4194304) != 0);
    }
}
