package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class idi {
    public static final nyj a = new nyj("Auth.GOOGLE_SIGN_IN_API", new z89(7), new lz1(13));
    public static final efe b;
    public static final efe c;
    public static boolean d = false;
    public static Method e = null;
    public static boolean f = false;
    public static Field g;

    static {
        Boolean bool = Boolean.FALSE;
        int i = 1;
        b = new efe(i, bool);
        c = new efe(i, bool);
    }

    public static final void a(zy7 zy7Var, zy7 zy7Var2, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1133591161);
        int i2 = 4;
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            WeakHashMap weakHashMap = gdj.x;
            iqb iqbVarK = gb9.K(knk.M(iqbVarC, new fei(s4i.d(e18Var).e, s4i.d(e18Var).c)), 12.0f, 8.0f);
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            ez1.e(zy7Var2, b.o(fqbVar, 40.0f), false, null, null, fd9.q0(933846153, new tp(z, i2), e18Var), e18Var, ((i3 >> 3) & 14) | 1572912, 60);
            dtj.a(d4c.j0(R.string.generic_button_done, e18Var), null, false, null, e12.a, null, 0L, zy7Var, e18Var, ((i3 << 21) & 29360128) | 24576, 110);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iy1(i, 0, zy7Var, zy7Var2, iqbVar2, z);
        }
    }

    public static final void b(String str, zy7 zy7Var, iqb iqbVar, ze0 ze0Var, qi3 qi3Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        ze0 ze0Var2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        ze0 ze0Var3;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(795768668);
        int i2 = 4;
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 9600;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var2.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ze0.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                ze0 ze0Var4 = (ze0) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                iqbVar2 = fqb.E;
                ze0Var3 = ze0Var4;
            } else {
                e18Var2.T();
                iqbVar2 = iqbVar;
                ze0Var3 = ze0Var;
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 7);
                e18Var2.k0(objN3);
            }
            opk.a(e18Var2, (bz7) objN3);
            String strO = kgh.o(ze0Var3.a(), str);
            Object objN4 = e18Var2.N();
            nm6 nm6Var = nm6.E;
            if (objN4 == lz1Var) {
                objN4 = new m8j(new s6j(strO, nm6Var));
                e18Var2.k0(objN4);
            }
            m8j m8jVar = (m8j) objN4;
            s6j s6jVar = new s6j(strO, nm6Var);
            m8jVar.getClass();
            m8jVar.b.setValue(s6jVar);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = new lfa();
                e18Var2.k0(objN5);
            }
            WeakHashMap weakHashMap = gdj.x;
            e18Var = e18Var2;
            v40.b(iqbVar2, null, null, fd9.q0(-253287400, new iv(zy7Var, m8jVar, ((Boolean) s4i.d(e18Var2).c.d.getValue()).booleanValue(), i2), e18Var2), null, null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1888146918, new ye(m8jVar, (lfa) objN5, zy7Var, 13), e18Var2), e18Var, 3078, 2038);
            qi3Var2 = qi3Var3;
            ze0Var2 = ze0Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            ze0Var2 = ze0Var;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(str, zy7Var, iqbVar2, (Object) ze0Var2, (Object) qi3Var2, i, 7);
        }
    }

    public static final void c(List list, boolean z, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1807503695);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        int i4 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 112) == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new cz2(z, i3);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 0);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new sy4(10, nwbVar);
                e18Var.k0(objN2);
            }
            ez1.e((zy7) objN2, b.o(fqbVar, 24.0f), false, null, null, rkk.a, e18Var, 1572912, 60);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF2 = e18Var.f(nwbVar);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new sy4(11, nwbVar);
                e18Var.k0(objN3);
            }
            ta4 ta4VarQ0 = fd9.q0(1649273000, new t56(list, nwbVar, i4), e18Var);
            e18Var = e18Var;
            j8.b(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ0, e18Var, 0, 2044);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gn3(list, z, i);
        }
    }

    public static final void d(String str, Object obj, List list, rz7 rz7Var, rz7 rz7Var2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, long j, long j2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        long j3;
        long j4;
        long j5;
        int i3;
        iqb iqbVar3;
        long j6;
        str.getClass();
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1270806763);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(obj) : e18Var2.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(rz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i4 |= e18Var2.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        if (e18Var2.Q(i4 & 1, (306783379 & i4) != 306783378)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                j5 = kxf.a;
                i3 = i4 & (-1879048193);
                long j7 = kxf.b;
                iqbVar3 = fqb.E;
                j6 = j7;
            } else {
                e18Var2.T();
                i3 = i4 & (-1879048193);
                iqbVar3 = iqbVar;
                j5 = j;
                j6 = j2;
            }
            int i5 = i3;
            e18Var2.q();
            iqb iqbVar4 = iqbVar3;
            long j8 = j5;
            wpk.a(zy7Var, null, fd9.q0(-583679358, new txf(j8, j6, iqbVar4, str, list, rz7Var, rz7Var2, obj, bz7Var, zy7Var, i5), e18Var2), e18Var2, ((i5 >> 18) & 14) | 384, 2);
            e18Var = e18Var2;
            j3 = j8;
            j4 = j6;
            iqbVar2 = iqbVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            j3 = j;
            j4 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new txf(str, obj, list, rz7Var, rz7Var2, bz7Var, zy7Var, iqbVar2, j3, j4, i);
        }
    }

    public static final void e(final bpc bpcVar, final String str, final Object obj, final List list, final rz7 rz7Var, final rz7 rz7Var2, final bz7 bz7Var, final iqb iqbVar, boolean z, nxf nxfVar, final oxf oxfVar, final mnc mncVar, float f2, wo1 wo1Var, mnc mncVar2, long j, int i, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        String str2;
        rz7 rz7Var3;
        e18 e18Var;
        final boolean z2;
        final nxf nxfVar2;
        final float f3;
        final wo1 wo1Var2;
        final mnc mncVar3;
        final long j2;
        final int i5;
        e18 e18Var2;
        mnc qncVar;
        long jD;
        wo1 wo1Var3;
        float f4;
        nxf nxfVar3;
        int i6;
        int i7;
        bpcVar.getClass();
        str.getClass();
        list.getClass();
        bz7Var.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(621913761);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? e18Var3.f(bpcVar) : e18Var3.h(bpcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= e18Var3.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? e18Var3.f(obj) : e18Var3.h(obj) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var3.f(list) : e18Var3.h(list) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            rz7Var3 = rz7Var;
            i4 |= e18Var3.h(rz7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            rz7Var3 = rz7Var;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var3.h(rz7Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e18Var3.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= e18Var3.f(iqbVar) ? 8388608 : 4194304;
        }
        final int i8 = i4 | 905969664;
        int i9 = i3 | 54;
        if ((i3 & 384) == 0) {
            i9 = i3 | 182;
        }
        if ((i3 & 3072) == 0) {
            i9 |= e18Var3.f(oxfVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i3 & 24576) == 0) {
            i9 |= e18Var3.f(mncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i3 & 196608) == 0) {
            i9 |= 65536;
        }
        int i10 = i9 | 1572864;
        if ((i3 & 12582912) == 0) {
            i10 = i9 | 5767168;
        }
        if ((100663296 & i3) == 0) {
            i10 |= 33554432;
        }
        int i11 = i10 | 805306368;
        boolean z3 = true;
        if (e18Var3.Q(i8 & 1, ((i8 & 306783379) == 306783378 && (i11 & 306783379) == 306783378) ? false : true)) {
            e18Var3.V();
            if ((i2 & 1) == 0 || e18Var3.A()) {
                nxf nxfVarG = c0l.g(0L, 0L, 0L, 0L, 0L, e18Var3, 63);
                e18Var2 = e18Var3;
                wo1 wo1Var4 = lja.Q;
                float fZ = csg.z(MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2);
                float fZ2 = csg.z(MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2);
                qncVar = new qnc(fZ, fZ2, fZ, fZ2);
                jD = mpk.d(csg.z(24.0f, e18Var2), csg.z(24.0f, e18Var2));
                wo1Var3 = wo1Var4;
                f4 = 56.0f;
                nxfVar3 = nxfVarG;
                i6 = i11 & (-264700801);
                i7 = 2;
            } else {
                e18Var3.T();
                z3 = z;
                nxfVar3 = nxfVar;
                f4 = f2;
                wo1Var3 = wo1Var;
                qncVar = mncVar2;
                i7 = i;
                e18Var2 = e18Var3;
                i6 = i11 & (-264700801);
                jD = j;
            }
            e18Var2.q();
            int i12 = i8 >> 12;
            String str3 = (String) rz7Var2.invoke(obj, e18Var2, Integer.valueOf(((i8 >> 6) & 14) | (i12 & 112)));
            final rz7 rz7Var4 = rz7Var3;
            final String str4 = str2;
            int i13 = i6 << 18;
            nxf nxfVar4 = nxfVar3;
            e18Var = e18Var2;
            mnc mncVar4 = qncVar;
            boolean z4 = z3;
            kud.b(bpcVar, str, fd9.q0(-1293743024, new rz7() { // from class: rxf
                @Override // defpackage.rz7
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    zy7 zy7Var = (zy7) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    zy7Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).h(zy7Var) ? 4 : 2;
                    }
                    e18 e18Var4 = (e18) ld4Var2;
                    if (e18Var4.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        idi.d(str4, obj, list, rz7Var4, rz7Var2, bz7Var, zy7Var, null, 0L, 0L, e18Var4, (((i8 >> 6) & 8) << 3) | ((iIntValue << 18) & 3670016));
                    } else {
                        e18Var4.T();
                    }
                    return iei.a;
                }
            }, e18Var2), iqbVar, str3, z4, nxfVar4, oxfVar, mncVar, f4, wo1Var3, mncVar4, MTTypesetterKt.kLineSkipLimitMultiplier, jD, null, i7, null, 0, e18Var, (i12 & 57344) | (i8 & 14) | 392 | (i8 & 112) | (i12 & 7168) | ((i8 >> 9) & 3670016) | (i13 & 29360128) | (i13 & 1879048192), ((i6 >> 12) & 8190) | ((i6 >> 6) & 29360128));
            mncVar3 = mncVar4;
            i5 = i7;
            j2 = jD;
            f3 = f4;
            wo1Var2 = wo1Var3;
            z2 = z4;
            nxfVar2 = nxfVar4;
        } else {
            e18Var = e18Var3;
            e18Var.T();
            z2 = z;
            nxfVar2 = nxfVar;
            f3 = f2;
            wo1Var2 = wo1Var;
            mncVar3 = mncVar2;
            j2 = j;
            i5 = i;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: sxf
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    int iP02 = x44.p0(i3);
                    idi.e(bpcVar, str, obj, list, rz7Var, rz7Var2, bz7Var, iqbVar, z2, nxfVar2, oxfVar, mncVar, f3, wo1Var2, mncVar3, j2, i5, (ld4) obj2, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void f(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, String str, String str2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-157788714);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(str2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            xo1 xo1Var = lja.N;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ev2.e(null, null, 0L, 0L, new qnc(16.0f, 16.0f, 16.0f, 16.0f), null, true, false, fd9.q0(-366369592, new rjh(str2, str, zy7Var2, zy7Var3, zy7Var, 1), e18Var), e18Var, 114843648, 47);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(zy7Var, zy7Var2, zy7Var3, str, str2, iqbVar, i);
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = mvi.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        lvi lviVarA = lvi.a(view);
        WeakReference weakReference2 = lviVarA.c;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            lviVarA.c = new WeakReference(keyEvent);
            if (lviVarA.b == null) {
                lviVarA.b = new SparseArray();
            }
            SparseArray sparseArray = lviVarA.b;
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                sparseArray.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                mr9.o();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(defpackage.to9 r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idi.h(to9, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static iqb i(iqb iqbVar, final long j, final boolean z, final boolean z2) {
        iqbVar.getClass();
        return zni.s(iqbVar, new bz7() { // from class: duc
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                xd6 xd6Var;
                long j2;
                char c2;
                xd6 xd6Var2 = (xd6) obj;
                xd6Var2.getClass();
                float fQ0 = xd6Var2.q0(MTTypesetterKt.kLineSkipLimitMultiplier);
                float fQ02 = xd6Var2.q0(6.0f);
                c40 c40VarA = f40.a();
                Path path = c40VarA.a;
                boolean z3 = z;
                boolean z4 = z2;
                if (z3 || !z4) {
                    xd6Var = xd6Var2;
                    if (!z3 || z4) {
                        c40VarA.g(MTTypesetterKt.kLineSkipLimitMultiplier, z3 ? fQ02 : 0.0f);
                        c40VarA.f(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) - (z4 ? fQ02 : 0.0f));
                        if (z4) {
                            c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - fQ02, Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)));
                        }
                        if (!z4) {
                            c40VarA.g(Float.intBitsToFloat((int) (xd6Var.g() >> 32)), Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)));
                        }
                        c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> 32)), z3 ? fQ02 : 0.0f);
                        if (z3) {
                            c40VarA.f(fQ02, MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    } else {
                        c40VarA.g(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)));
                        c40VarA.f(MTTypesetterKt.kLineSkipLimitMultiplier, fQ02);
                        if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            float f2 = fQ02 * 2.0f;
                            if (c40VarA.b == null) {
                                c40VarA.b = new RectF();
                            }
                            RectF rectF = c40VarA.b;
                            rectF.getClass();
                            rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f2, f2);
                            RectF rectF2 = c40VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, 180.0f, 90.0f, false);
                        }
                        c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - fQ02, MTTypesetterKt.kLineSkipLimitMultiplier);
                        if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            float f3 = fQ02 * 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - f3;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                            if (c40VarA.b == null) {
                                c40VarA.b = new RectF();
                            }
                            RectF rectF3 = c40VarA.b;
                            rectF3.getClass();
                            rectF3.set(fIntBitsToFloat, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat2, f3);
                            RectF rectF4 = c40VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, 270.0f, 90.0f, false);
                        }
                        c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> 32)), Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)));
                    }
                } else {
                    c40VarA.g(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                    c40VarA.f(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (xd6Var2.g() & 4294967295L)) - fQ02);
                    if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                        j2 = 4294967295L;
                        c2 = ' ';
                        float f4 = fQ02 * 2.0f;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (xd6Var2.g() & 4294967295L)) - f4;
                        xd6Var = xd6Var2;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (xd6Var2.g() & 4294967295L));
                        if (c40VarA.b == null) {
                            c40VarA.b = new RectF();
                        }
                        RectF rectF5 = c40VarA.b;
                        rectF5.getClass();
                        rectF5.set(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat3, f4, fIntBitsToFloat4);
                        RectF rectF6 = c40VarA.b;
                        rectF6.getClass();
                        path.arcTo(rectF6, 180.0f, -90.0f, false);
                    } else {
                        xd6Var = xd6Var2;
                        j2 = 4294967295L;
                        c2 = ' ';
                    }
                    c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> c2)) - fQ02, Float.intBitsToFloat((int) (xd6Var.g() & j2)));
                    if (fQ02 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                        float f5 = fQ02 * 2.0f;
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (xd6Var.g() >> c2)) - f5;
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (xd6Var.g() & j2)) - f5;
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (xd6Var.g() >> c2));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (xd6Var.g() & j2));
                        if (c40VarA.b == null) {
                            c40VarA.b = new RectF();
                        }
                        RectF rectF7 = c40VarA.b;
                        rectF7.getClass();
                        rectF7.set(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8);
                        RectF rectF8 = c40VarA.b;
                        rectF8.getClass();
                        path.arcTo(rectF8, 90.0f, -90.0f, false);
                    }
                    c40VarA.f(Float.intBitsToFloat((int) (xd6Var.g() >> c2)), MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                xd6.c1(xd6Var, c40VarA, j, MTTypesetterKt.kLineSkipLimitMultiplier, new ksg(fQ0, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), 52);
                return iei.a;
            }
        });
    }
}
