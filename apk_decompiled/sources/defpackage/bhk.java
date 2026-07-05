package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bhk {
    public static final ta4 a = new ta4(-1922686486, false, new bb4(27));
    public static final ta4 b = new ta4(2023054351, false, new bb4(28));
    public static final Object c = new Object();

    public static final void a(String str, boolean z, zy7 zy7Var, n02 n02Var, ld4 ld4Var, int i, int i2) {
        int i3;
        zy7 zy7Var2;
        n02 n02VarD;
        int i4;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-991318721);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                n02VarD = n02Var;
                if (e18Var.f(n02VarD)) {
                    i4 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                }
                i3 |= i4;
            } else {
                n02VarD = n02Var;
            }
            i4 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
            i3 |= i4;
        } else {
            n02VarD = n02Var;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                if ((i2 & 8) != 0) {
                    qnc qncVar = q02.a;
                    xe4 xe4Var = on4.a;
                    n02VarD = q02.d(0L, ((d54) e18Var.j(xe4Var)).a, ((d54) e18Var.j(xe4Var)).a, e18Var, 5);
                    i3 &= -7169;
                }
                n02 n02Var2 = n02VarD;
                e18Var.q();
                csg.j(zy7Var2, null, !z, null, n02Var2, null, null, fd9.q0(-1101463710, new qk1(str, z), e18Var), e18Var, ((i3 >> 6) & 14) | 805306368 | ((i3 << 3) & 57344), 490);
                e18Var = e18Var;
                n02VarD = n02Var2;
            } else {
                e18Var.T();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                n02 n02Var22 = n02VarD;
                e18Var.q();
                csg.j(zy7Var2, null, !z, null, n02Var22, null, null, fd9.q0(-1101463710, new qk1(str, z), e18Var), e18Var, ((i3 >> 6) & 14) | 805306368 | ((i3 << 3) & 57344), 490);
                e18Var = e18Var;
                n02VarD = n02Var22;
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s22(str, z, zy7Var, n02VarD, i, i2, 3);
        }
    }

    public static final void b(final tkd tkdVar, final List list, final boolean z, final Date date, final zy7 zy7Var, final zy7 zy7Var2, final bz7 bz7Var, final bz7 bz7Var2, final zy7 zy7Var3, final bz7 bz7Var3, final boolean z2, final String str, final String str2, final boolean z3, final iqb iqbVar, final x0a x0aVar, final mnc mncVar, float f, dmd dmdVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        final float f2;
        final dmd dmdVar2;
        dmd dmdVar3;
        int i2;
        float f3;
        int i3;
        float f4;
        list.getClass();
        date.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var3.getClass();
        bz7Var3.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-502704813);
        int i4 = i | (e18Var2.f(tkdVar) ? 4 : 2) | (e18Var2.f(list) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(date) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean zH = e18Var2.h(zy7Var);
        int i5 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i6 = i4 | (zH ? 16384 : 8192) | (e18Var2.h(zy7Var2) ? 131072 : 65536) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.h(bz7Var2) ? 8388608 : 4194304) | (e18Var2.h(zy7Var3) ? 67108864 : 33554432) | (e18Var2.h(bz7Var3) ? 536870912 : 268435456);
        int i7 = (e18Var2.g(z2) ? 4 : 2) | (e18Var2.f(str) ? 32 : 16) | (e18Var2.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.f(iqbVar)) {
            i5 = 16384;
        }
        int i8 = i7 | i5 | (e18Var2.f(x0aVar) ? 131072 : 65536) | (e18Var2.f(mncVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 12582912;
        if (e18Var2.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            e18Var2.V();
            int i9 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i9 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(dmd.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                int i10 = i8 & (-234881025);
                dmdVar3 = (dmd) objN;
                i2 = i10;
                f3 = 16.0f;
            } else {
                e18Var2.T();
                int i11 = i8 & (-234881025);
                f3 = f;
                dmdVar3 = dmdVar;
                i2 = i11;
            }
            e18Var2.q();
            final float f5 = f3;
            boolean zH2 = ((3670016 & i6) == 1048576) | ((i6 & 14) == 4) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((458752 & i6) == 131072) | ((57344 & i6) == 16384) | ((i2 & 112) == 32) | ((1879048192 & i6) == 536870912) | ((i6 & 896) == 256) | ((i6 & 112) == 32) | e18Var2.h(date) | ((29360128 & i6) == 8388608) | ((234881024 & i6) == 67108864);
            Object objN2 = e18Var2.N();
            if (zH2 || objN2 == lz1Var) {
                i3 = i2;
                bz7 bz7Var4 = new bz7() { // from class: vkd
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        j0a j0aVar = (j0a) obj;
                        j0aVar.getClass();
                        tkd tkdVar2 = tkdVar;
                        float f6 = f5;
                        int i12 = 1;
                        if (tkdVar2 != null) {
                            ta4 ta4Var = new ta4(1478351491, true, new tq9(tkdVar2, f6, z2));
                            lc9 lc9Var = lc9.E;
                            j0aVar.U(lc9Var, lc9Var, ta4Var);
                            if (z3) {
                                j0aVar.U(hc9.F, lc9.I, new ta4(307539038, true, new in3(str2, zy7Var2, f6)));
                            }
                            j0aVar.U(hc9.G, lc9.J, new ta4(179412026, true, new xkd(f6, tkdVar2, zy7Var, str, bz7Var3)));
                        }
                        if (z) {
                            List list2 = list;
                            if (list2.isEmpty()) {
                                j0aVar.U(hc9.E, lc9.F, new ta4(-1381936811, true, new q72(3, f6)));
                            } else {
                                j0aVar.U(hc9.H, lc9.G, new ta4(854138334, true, new q72(4, f6)));
                                j0aVar.W(list2.size(), new zkd(new f7d(10), 0, list2), new zkd(new f7d(11), i12, list2), new ta4(802480018, true, new cw(list2, date, bz7Var, bz7Var2, zy7Var3)));
                            }
                        }
                        return iei.a;
                    }
                };
                f4 = f5;
                e18Var = e18Var2;
                e18Var.k0(bz7Var4);
                objN2 = bz7Var4;
            } else {
                f4 = f5;
                e18Var = e18Var2;
                i3 = i2;
            }
            knk.h(iqbVar, x0aVar, mncVar, false, null, null, null, false, null, (bz7) objN2, e18Var, (i3 >> 12) & 1022, 504);
            f2 = f4;
            dmdVar2 = dmdVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            f2 = f;
            dmdVar2 = dmdVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(list, z, date, zy7Var, zy7Var2, bz7Var, bz7Var2, zy7Var3, bz7Var3, z2, str, str2, z3, iqbVar, x0aVar, mncVar, f2, dmdVar2, i) { // from class: wkd
                public final /* synthetic */ List F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ Date H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ bz7 K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ boolean O;
                public final /* synthetic */ String P;
                public final /* synthetic */ String Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ iqb S;
                public final /* synthetic */ x0a T;
                public final /* synthetic */ mnc U;
                public final /* synthetic */ float V;
                public final /* synthetic */ dmd W;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    bhk.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final Object c(f4e f4eVar, te2 te2Var) {
        ua2 ua2Var = new ua2(1, zni.I(te2Var));
        ua2Var.t();
        ua2Var.w(new y22(f4eVar, 1));
        f4eVar.d(new z22(ua2Var, 2));
        return ua2Var.r();
    }

    public static int d(String str) {
        for (int i : sq6.H(8)) {
            if (kgh.g(i).equals(str)) {
                return i;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return 0;
    }

    public static ss6 e(qh9 qh9Var) {
        ct6 ct6Var;
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("plan");
            int i = 0;
            if (bh9VarS != null && (strM2 = bh9VarS.m()) != null) {
                ct6[] ct6VarArrValues = ct6.values();
                int length = ct6VarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    ct6Var = ct6VarArrValues[i2];
                    if (!x44.r(ct6Var.E.toString(), strM2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            ct6Var = null;
            bh9 bh9VarS2 = qh9Var.s("session_precondition");
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length2 = iArrH.length;
                while (i < length2) {
                    int i3 = iArrH[i];
                    if (ms6.i(i3).equals(strM)) {
                        i = i3;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ss6(ct6Var, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static final ImageDecoder.Source f(jy8 jy8Var, qjc qjcVar) {
        Path pathW0;
        if (jy8Var.getFileSystem() == FileSystem.E && (pathW0 = jy8Var.w0()) != null) {
            return ImageDecoder.createSource(pathW0.toFile());
        }
        huk hukVarM = jy8Var.m();
        if (hukVarM instanceof xw0) {
            return ImageDecoder.createSource(qjcVar.a.getAssets(), ((xw0) hukVarM).b);
        }
        if ((hukVarM instanceof bo4) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((bo4) hukVarM).c;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new mr5(3, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (hukVarM instanceof xpe) {
            xpe xpeVar = (xpe) hukVarM;
            if (xpeVar.b.equals(qjcVar.a.getPackageName())) {
                return ImageDecoder.createSource(qjcVar.a.getResources(), xpeVar.c);
            }
        }
        if (hukVarM instanceof s12) {
            return ImageDecoder.createSource(((s12) hukVarM).b);
        }
        return null;
    }
}
