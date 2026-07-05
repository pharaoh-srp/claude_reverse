package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ou5 {
    public static final v9d a = new v9d(true, 30);

    public static final void a(meh mehVar, aeh aehVar, ld4 ld4Var, int i) {
        Context context;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1904307118);
        int i2 = (e18Var.f(mehVar) ? 4 : 2) | i | (e18Var.h(aehVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                e18Var.a0(-1009482584);
                context = (Context) e18Var.j(w00.b);
                e18Var.p(false);
            } else {
                e18Var.a0(-1009433480);
                e18Var.p(false);
                context = null;
            }
            boolean zH = e18Var.h(aehVar) | ((i2 & 14) == 4) | e18Var.h(context);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new ny4((Object) aehVar, context, (Object) mehVar, 7);
                e18Var.k0(objN);
            }
            ip4.b(null, null, (bz7) objN, e18Var, 0, 3);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(mehVar, aehVar, i, 6);
        }
    }

    public static final void b(final int i, final long j, ld4 ld4Var, final int i2) {
        final int i3;
        int i4;
        r7e r7eVarS;
        pz7 pz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (e18Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.e(j) ? 32 : 16;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean zF = ((i4 & 14) == 4) | e18Var.f(context);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                e18Var.k0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            if (iIntValue == -1) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i5 = 1;
                    pz7Var = new pz7() { // from class: nu5
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            iei ieiVar = iei.a;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    ou5.b(i8, j2, ld4Var2, x44.p0(i7 | 1));
                                    break;
                                default:
                                    ou5.b(i8, j2, ld4Var2, x44.p0(i7 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            bpc bpcVarD = u00.D(iIntValue, 0, e18Var);
            boolean z = (i4 & 112) == 32;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = j == 16 ? null : new hr1(j, 5);
                e18Var.k0(objN2);
            }
            dw1.a(a.a(b.o(fqb.E, dp4.e), bpcVarD, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, (hr1) objN2, 22), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i6 = 0;
            pz7Var = new pz7() { // from class: nu5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    iei ieiVar = iei.a;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            ou5.b(i8, j2, ld4Var2, x44.p0(i7 | 1));
                            break;
                        default:
                            ou5.b(i8, j2, ld4Var2, x44.p0(i7 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void c(meh mehVar, beh behVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(mehVar) : e18Var.h(mehVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(behVar) : e18Var.h(behVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        boolean z = false;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && e18Var.f(behVar));
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new wpa(new bp4(new w95(behVar, 9, zy7Var)));
                e18Var.k0(objN);
            }
            wpa wpaVar = (wpa) objN;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var.h(mehVar))) {
                z = true;
            }
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new xi4(10, mehVar);
                e18Var.k0(objN2);
            }
            u40.a(wpaVar, (zy7) objN2, a, fd9.q0(1315155414, new um5(behVar, 5, mehVar), e18Var), e18Var, 3456, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(mehVar, i, behVar, zy7Var, 25);
        }
    }

    public static final void d(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1392105195);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            bwk.a(iqbVar, keh.a, ta4Var, e18Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar, ta4Var, i, i3);
        }
    }
}
