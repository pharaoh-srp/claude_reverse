package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTask;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wb5 {
    public static final o54 A;
    public static final o54 B;
    public static final o54 C;
    public static final o54 D;
    public static final o54 E;
    public static final o54 F;
    public static xb5 a;
    public static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM};
    public static final o54 c;
    public static final o54 d;
    public static final o54 e;
    public static final o54 f;
    public static final float g;
    public static final o54 h;
    public static final float i;
    public static final o54 j;
    public static final o54 k;
    public static final float l;
    public static final o54 m;
    public static final float n;
    public static final o54 o;
    public static final float p;
    public static final o54 q;
    public static final o54 r;
    public static final o54 s;
    public static final o54 t;
    public static final o54 u;
    public static final o54 v;
    public static final o54 w;
    public static final o54 x;
    public static final o54 y;
    public static final o54 z;

    static {
        o54 o54Var = o54.M;
        c = o54Var;
        o54 o54Var2 = o54.P;
        d = o54Var2;
        e = o54.X;
        o54 o54Var3 = o54.L;
        f = o54Var3;
        g = 0.38f;
        h = o54Var3;
        i = 0.38f;
        j = o54Var3;
        k = o54Var3;
        l = 0.38f;
        m = o54Var3;
        n = 0.38f;
        o = o54Var3;
        p = 0.38f;
        o54 o54Var4 = o54.E;
        q = o54Var4;
        r = o54Var4;
        s = o54Var3;
        t = o54Var4;
        u = o54Var;
        v = o54Var4;
        w = o54Var2;
        x = o54Var3;
        y = o54Var2;
        z = o54Var;
        A = o54Var;
        B = o54Var3;
        C = o54Var;
        D = o54Var;
        E = o54Var;
        F = o54Var;
    }

    public static BitmapPainter a(r20 r20Var, int i2) {
        Bitmap bitmap = r20Var.a;
        BitmapPainter bitmapPainter = new BitmapPainter(r20Var, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        bitmapPainter.L = i2;
        return bitmapPainter;
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1602934582);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var = ud0.L;
            long j2 = gm3.a(e18Var).O;
            fqb fqbVar = fqb.E;
            iv1.b(ud0Var, null, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), ef2.F, j2, e18Var, 3504, 0);
            kxk.g(e18Var, b.t(fqbVar, 4.0f));
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, i3 & 14, 0, 262142);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i2, 22);
        }
    }

    public static final void c(CCRStarterTask cCRStarterTask, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1989206647);
        int i3 = i2 | (e18Var.f(cCRStarterTask) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = m7fVarN.a(jce.a.b(z74.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            z74 z74Var = (z74) objN;
            boolean zF2 = e18Var.f(cCRStarterTask.getDescription());
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = z74Var.a(cCRStarterTask.getDescription());
                e18Var.k0(objN2);
            }
            vve vveVarB = xve.b(20.0f);
            iqbVar2 = iqbVar;
            pzg.a(androidx.compose.foundation.b.c(xn5.V(b.c(iqbVar2, 1.0f), vveVarB), false, null, null, null, zy7Var, 15), vveVarB, gm3.a(e18Var).n, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(1.0f, gm3.a(e18Var).v), fd9.q0(720324366, new l4d((jz0) objN2, i4), e18Var), e18Var, 12582912, 56);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(zy7Var, cCRStarterTask, iqbVar2, i2, 5);
        }
    }

    public static final void d(int i2, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        int i3;
        e18 e18Var;
        iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1671064282);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.ccr_suggestions, e18Var2), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 0, 131064);
            e18Var = e18Var2;
            e18Var.a0(215129275);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CCRStarterTask cCRStarterTask = (CCRStarterTask) it.next();
                boolean zF = e18Var.f(cCRStarterTask) | ((i4 & 112) == 32);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new ytf(bz7Var, 0, cCRStarterTask);
                    e18Var.k0(objN);
                }
                c(cCRStarterTask, (zy7) objN, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), e18Var, 384);
            }
            iqbVar2 = fqbVar;
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p22(list, bz7Var, iqbVar2, i2, 2);
        }
    }

    public static final void e(List list, iqb iqbVar, String str, ld4 ld4Var, int i2, int i3) {
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1257607016);
        int i5 = (e18Var.f(list) ? 4 : 2) | i2;
        int i6 = i5 | 48;
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i5 | 432;
        } else {
            i4 = (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | i6;
        }
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            if (i7 != 0) {
                str = null;
            }
            j8.c(sq6.m(gm3.a(e18Var).N, on4.a), fd9.q0(-1530866728, new nwh(str, list), e18Var), e18Var, 56);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        String str2 = str;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(list, iqbVar2, str2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000e, B:10:0x0013, B:15:0x001b, B:17:0x0027, B:22:0x0037, B:23:0x003e, B:25:0x0042, B:26:0x0049, B:27:0x004b), top: B:31:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000e, B:10:0x0013, B:15:0x001b, B:17:0x0027, B:22:0x0037, B:23:0x003e, B:25:0x0042, B:26:0x0049, B:27:0x004b), top: B:31:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xb5 g(android.content.Context r4, defpackage.ub5 r5) {
        /*
            java.lang.Class<wb5> r0 = defpackage.wb5.class
            monitor-enter(r0)
            xb5 r1 = defpackage.wb5.a     // Catch: java.lang.Throwable -> L34
            r2 = 1
            if (r1 != 0) goto L3e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            r3 = 30
            if (r1 < r3) goto L3e
            ub5 r1 = defpackage.ub5.I     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r5 == r1) goto L1a
            ub5 r1 = defpackage.ub5.G     // Catch: java.lang.Throwable -> L34
            if (r5 != r1) goto L18
            goto L1a
        L18:
            r5 = r3
            goto L1b
        L1a:
            r5 = r2
        L1b:
            android.os.Bundle r4 = defpackage.yb5.s(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "android.net.http.EnableTelemetry"
            boolean r4 = r4.getBoolean(r1, r5)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3e
            xb5 r4 = new xb5     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            defpackage.wb5.a = r4     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            goto L3e
        L34:
            r4 = move-exception
            goto L4d
        L36:
            r4 = move-exception
            java.lang.String r5 = "wb5"
            java.lang.String r1 = "Exception creating an instance of CronetLoggerImpl"
            android.util.Log.e(r5, r1, r4)     // Catch: java.lang.Throwable -> L34
        L3e:
            xb5 r4 = defpackage.wb5.a     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L49
            xb5 r4 = new xb5     // Catch: java.lang.Throwable -> L34
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L34
            defpackage.wb5.a = r4     // Catch: java.lang.Throwable -> L34
        L49:
            xb5 r4 = defpackage.wb5.a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r4
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.g(android.content.Context, ub5):xb5");
    }

    public static jpc h(float f2) {
        if (va6.a(f2, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0) {
            return new jpc(f2, 3, 0);
        }
        sz6.p("Offset must larger than or equal to 0 dp.");
        return null;
    }

    public static jpc i(float f2) {
        if (va6.a(f2, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0) {
            return new jpc(f2, 2, 1);
        }
        sz6.p("Offset must larger than or equal to 0 dp.");
        return null;
    }

    public static void j(int i2, ssc sscVar) {
        sscVar.J(7);
        byte[] bArr = sscVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final xh3 k(bo5 bo5Var) {
        bo5 bo5VarH = bo5Var.h();
        if (bo5VarH == null || (bo5Var instanceof wmc)) {
            return null;
        }
        if (!(bo5VarH.h() instanceof wmc)) {
            return k(bo5VarH);
        }
        if (bo5VarH instanceof xh3) {
            return (xh3) bo5VarH;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.z4 l(defpackage.dg2 r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = defpackage.wb5.b
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            z4 r1 = new z4
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.l(dg2):z4");
    }

    public static void m(dg2 dg2Var, y4 y4Var) throws ParserException {
        int iG = dg2Var.g(5);
        dg2Var.o(2);
        if (dg2Var.f()) {
            dg2Var.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            dg2Var.n();
        }
        if (dg2Var.f()) {
            int iG2 = dg2Var.g(3);
            if (y4Var.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                y4Var.b = iG;
            }
            if (dg2Var.f()) {
                p(dg2Var);
            }
        }
    }

    public static void n(dg2 dg2Var, y4 y4Var) throws ParserException {
        dg2Var.o(2);
        boolean zF = dg2Var.f();
        int iG = dg2Var.g(8);
        for (int i2 = 0; i2 < iG; i2++) {
            dg2Var.o(2);
            if (dg2Var.f()) {
                dg2Var.o(5);
            }
            if (zF) {
                dg2Var.o(24);
            } else {
                if (dg2Var.f()) {
                    if (!dg2Var.f()) {
                        dg2Var.o(4);
                    }
                    y4Var.c = dg2Var.g(6) + 1;
                }
                dg2Var.o(4);
            }
        }
        if (dg2Var.f()) {
            dg2Var.o(3);
            if (dg2Var.f()) {
                p(dg2Var);
            }
        }
    }

    public static final qqb o(tqb tqbVar, ww7 ww7Var) {
        xh3 xh3VarE;
        fab fabVarK0;
        tqbVar.getClass();
        ww7Var.getClass();
        if (!ww7Var.d()) {
            g1a g1aVar = tqbVar.a0(ww7Var.e()).K;
            sxb sxbVarF = ww7Var.f();
            sxbVarF.getClass();
            xh3 xh3VarE2 = g1aVar.e(sxbVarF, 4);
            qqb qqbVar = xh3VarE2 instanceof qqb ? (qqb) xh3VarE2 : null;
            if (qqbVar != null) {
                return qqbVar;
            }
            qqb qqbVarO = o(tqbVar, ww7Var.e());
            if (qqbVarO == null || (fabVarK0 = qqbVarO.k0()) == null) {
                xh3VarE = null;
            } else {
                sxb sxbVarF2 = ww7Var.f();
                sxbVarF2.getClass();
                xh3VarE = fabVarK0.e(sxbVarF2, 4);
            }
            if (xh3VarE instanceof qqb) {
                return (qqb) xh3VarE;
            }
        }
        return null;
    }

    public static void p(dg2 dg2Var) throws ParserException {
        int iG = dg2Var.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        dg2Var.o(iG * 8);
    }

    public abstract String f();
}
