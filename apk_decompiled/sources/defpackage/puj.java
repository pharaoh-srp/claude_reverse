package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class puj {
    public static final ta4 a = new ta4(-1049093051, false, new p6(22));
    public static final ta4 b = new ta4(1852940836, false, new p6(23));
    public static final ta4 c = new ta4(947988544, false, new p6(24));
    public static final double[] d = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    public static final double[] e = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    public static final int[] f = {0, 0, 3, 2, 2};

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(535500978);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarJ = gb9.J(yfd.p(b.c(iqbVar, 1.0f), gm3.a(e18Var).p, xve.b(12.0f)), 12.0f);
            cxe cxeVarA = axe.a(ko0.e, lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjh.b(d4c.j0(R.string.session_archived_notice, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, 3, (byte) 0);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(447456859);
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            iqb iqbVarJ = gb9.J(yfd.p(b.c(iqbVar, 1.0f), gm3.a(e18Var).p, xve.b(12.0f)), 12.0f);
            cxe cxeVarA = axe.a(ko0.g, lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjh.b(d4c.j0(R.string.ccr_shared_session_notice, e18Var), new hw9(1.0f, true), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131064);
            i2 = 2;
            e18Var = e18Var;
            lnk.d(zy7Var, null, false, null, null, null, null, fwj.a, e18Var, (i3 & 14) | 805306368, 510);
            e18Var.p(true);
        } else {
            i2 = 2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, i2);
        }
    }

    public static final void c(y4g y4gVar, iqb iqbVar, z3g z3gVar, pz7 pz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        z3g z3gVarD;
        int i2;
        boolean z;
        y4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1474385384);
        int i3 = i | (e18Var2.f(y4gVar) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                k4g k4gVar = k4g.a;
                z3gVarD = k4g.d(0L, e18Var2, 15);
                i2 = i3 & (-897);
            } else {
                e18Var2.T();
                i2 = i3 & (-897);
                z3gVarD = z3gVar;
            }
            e18Var2.q();
            cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.g(0, e18Var2);
            }
            isc iscVar = (isc) objN;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new d6d(20, y4gVar);
                e18Var2.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            boolean zF = (i4 == 4) | e18Var2.f(bz7Var);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new hya(y4gVar, bz7Var, iscVar, 25);
                e18Var2.k0(objN3);
            }
            fd9.s((zy7) objN3, e18Var2);
            xo1 xo1Var = lja.N;
            iqb iqbVarB = iqbVar.B(b.c);
            boolean zF2 = e18Var2.f(bz7Var);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new nif(bz7Var, 6, iscVar);
                e18Var2.k0(objN4);
            }
            iqb iqbVarV0 = wd6.v0(iqbVarB, (bz7) objN4);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarV0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(1731777183);
            float fH = y4gVar.a.j.h();
            if (iscVar.h() == 0) {
                e18Var2.p(false);
                e18Var = e18Var2;
                z = true;
            } else {
                if (Float.isNaN(fH)) {
                    fH = iscVar.h() * 0.6f;
                }
                z = true;
                pzg.a(b.e(b.c(fqb.E, 1.0f), cz5Var.g0(fH)), k4g.b, z3gVarD.a, z3gVarD.b, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-271060983, new v3e(y4gVar, ta4Var, z3gVarD, pz7Var, 9), e18Var2), e18Var2, 12582912, 112);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            e18Var.p(z);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            z3gVarD = z3gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(y4gVar, iqbVar, z3gVarD, pz7Var, ta4Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap d(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.j8g r18, defpackage.k6f r19, defpackage.j8g r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.ne5.g(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.c0l.j(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.c0l.k(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.jqi.d(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.jqi.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.c0l.j(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.c0l.k(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.mwa.K(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.mwa.K(r2)
            if (r17 == 0) goto L9b
            boolean r2 = defpackage.ne5.g(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puj.d(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, j8g, k6f, j8g, boolean):android.graphics.Bitmap");
    }

    public static zl4 e(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new zl4(15);
        }
        if (i < 31) {
            return new zl4(15);
        }
        pictureInPictureUiState.isStashed();
        return new zl4(15);
    }

    public static final du9 f(va6 va6Var, boolean z) {
        return va6Var == null ? new du9() : new du9(va6Var.E, z);
    }

    public static int g(int i) {
        int i2;
        if (((-65536) & i) == 0) {
            i <<= 16;
            i2 = 16;
        } else {
            i2 = 0;
        }
        if (((-16777216) & i) == 0) {
            i2 += 8;
            i <<= 8;
        }
        if (((-268435456) & i) == 0) {
            i2 += 4;
            i <<= 4;
        }
        if (((-1073741824) & i) == 0) {
            i2 += 2;
            i <<= 2;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            i2++;
            if ((i & 1073741824) == 0) {
                return 32;
            }
        }
        return i2;
    }

    public static final int h(RemoteViews remoteViews, f6i f6iVar, int i, int i2, Integer num) {
        int iIntValue;
        if (i == -1) {
            sz6.p("viewStubId must not be View.NO_ID");
            return 0;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iIncrementAndGet = f6iVar.g.incrementAndGet();
            if (iIncrementAndGet >= y18.j) {
                sz6.j("There are too many views");
                return 0;
            }
            iIntValue = iIncrementAndGet + y18.i;
        }
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static int i(int i) {
        int i2 = 0;
        if ((i & 7) != 0) {
            if ((i & 1) != 0) {
                return 0;
            }
            return (i & 2) != 0 ? 1 : 2;
        }
        if ((65535 & i) == 0) {
            i >>>= 16;
            i2 = 16;
        }
        if ((i & 255) == 0) {
            i2 += 8;
            i >>>= 8;
        }
        if ((i & 15) == 0) {
            i2 += 4;
            i >>>= 4;
        }
        if ((i & 3) == 0) {
            i2 += 2;
            i >>>= 2;
        }
        if ((i & 1) == 0) {
            i2++;
            if (((i >>> 1) & 1) == 0) {
                return 32;
            }
        }
        return i2;
    }

    public static boolean j(StringBuilder sb) {
        int length = sb.length();
        while (length != 0) {
            int i = length - 1;
            char cCharAt = sb.charAt(i);
            if (cCharAt != '9') {
                sb.setCharAt(i, (char) (cCharAt + 1));
                sb.setLength(length);
                return false;
            }
            length = i;
        }
        sb.setLength(0);
        return true;
    }

    public static double k(double d2, int i) {
        return Double.longBitsToDouble((Double.doubleToLongBits(d2) & 4294967295L) | (((long) i) << 32));
    }

    public static void l(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static final iqb m(iqb iqbVar, sz7 sz7Var, e18 e18Var, int i) {
        WindowManager windowManager;
        WindowMetrics maximumWindowMetrics;
        eu9 eu9Var;
        iqbVar.getClass();
        e18Var.a0(972114425);
        Context context = (Context) e18Var.j(w00.b);
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        e18Var.a0(-1243583549);
        boolean zF = e18Var.f(context);
        Object objN = e18Var.N();
        Object obj = jd4.a;
        if (zF || objN == obj) {
            if (Build.VERSION.SDK_INT < 31 || (windowManager = (WindowManager) context.getSystemService(WindowManager.class)) == null || (maximumWindowMetrics = windowManager.getMaximumWindowMetrics()) == null) {
                objN = null;
            } else {
                WindowInsets windowInsets = maximumWindowMetrics.getWindowInsets();
                windowInsets.getClass();
                RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
                va6 va6Var = roundedCorner != null ? new va6(cz5Var.c0(roundedCorner.getRadius())) : null;
                RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(1);
                va6 va6Var2 = roundedCorner2 != null ? new va6(cz5Var.c0(roundedCorner2.getRadius())) : null;
                RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(2);
                va6 va6Var3 = roundedCorner3 != null ? new va6(cz5Var.c0(roundedCorner3.getRadius())) : null;
                RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(3);
                objN = new z7f(new p35(va6Var, va6Var2, va6Var3, roundedCorner4 != null ? new va6(cz5Var.c0(roundedCorner4.getRadius())) : null), maximumWindowMetrics.getBounds().width(), maximumWindowMetrics.getBounds().height());
            }
            e18Var.k0(objN);
        }
        z7f z7fVar = (z7f) objN;
        e18Var.p(false);
        e18Var.a0(-1243581676);
        if (z7fVar == null) {
            iqb iqbVar2 = (iqb) sz7Var.i(iqbVar, new eu9(), e18Var, Integer.valueOf((i & 14) | ((i << 3) & 896)));
            e18Var.p(false);
            e18Var.p(false);
            return iqbVar2;
        }
        e18Var.p(false);
        View view = (View) e18Var.j(w00.f);
        fu9 fu9Var = (fu9) e18Var.j(ve4.n);
        e18Var.a0(-1243575593);
        Object objN2 = e18Var.N();
        if (objN2 == obj) {
            objN2 = mpk.P(null);
            e18Var.k0(objN2);
        }
        nwb nwbVar = (nwb) objN2;
        e18Var.p(false);
        l9e l9eVar = (l9e) nwbVar.getValue();
        if (l9eVar == null) {
            eu9Var = new eu9();
        } else {
            p35 p35Var = z7fVar.a;
            int i2 = z7fVar.b;
            int i3 = z7fVar.c;
            float f2 = l9eVar.a;
            float f3 = l9eVar.b;
            float f4 = l9eVar.c;
            float f5 = l9eVar.d;
            du9 du9VarF = f(p35Var.a, f2 <= MTTypesetterKt.kLineSkipLimitMultiplier && f3 <= MTTypesetterKt.kLineSkipLimitMultiplier);
            float f6 = i2;
            du9 du9VarF2 = f(p35Var.b, f4 >= f6 && f3 <= MTTypesetterKt.kLineSkipLimitMultiplier);
            du9 du9VarF3 = f(p35Var.c, f4 >= f6 && f5 >= ((float) i3));
            du9 du9VarF4 = f(p35Var.d, f2 <= MTTypesetterKt.kLineSkipLimitMultiplier && f5 >= ((float) i3));
            int iOrdinal = fu9Var.ordinal();
            if (iOrdinal == 0) {
                eu9Var = new eu9(du9VarF, du9VarF2, du9VarF3, du9VarF4);
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return null;
                }
                eu9Var = new eu9(du9VarF2, du9VarF, du9VarF4, du9VarF3);
            }
        }
        e18Var.a0(-1243570520);
        boolean zH = e18Var.h(view);
        Object objN3 = e18Var.N();
        if (zH || objN3 == obj) {
            objN3 = new wf2(view, nwbVar, 1);
            e18Var.k0(objN3);
        }
        e18Var.p(false);
        iqb iqbVar3 = (iqb) sz7Var.i(xn5.p0(iqbVar, (bz7) objN3), eu9Var, e18Var, Integer.valueOf((i << 3) & 896));
        e18Var.p(false);
        return iqbVar3;
    }

    public static int n(double d2) {
        return (int) (Double.doubleToLongBits(d2) >> 32);
    }
}
