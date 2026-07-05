package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dtj {
    public static final ta4 a = new ta4(314191228, false, new m14(10));
    public static final ta4 b = new ta4(-549440219, false, new m14(11));
    public static final ta4 c = new ta4(1352573539, false, new m14(12));
    public static final ta4 d = new ta4(1607686326, false, new m14(13));
    public static final int[] e = {R.attr.theme, com.anthropic.claude.R.attr.theme};
    public static final int[] f = {com.anthropic.claude.R.attr.materialThemeOverlay};

    /* JADX WARN: Removed duplicated region for block: B:128:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[PHI: r14
      0x00a1: PHI (r14v22 int) = (r14v0 int), (r14v6 int), (r14v7 int) binds: [B:57:0x009f, B:67:0x00b9, B:66:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r23, defpackage.iqb r24, boolean r25, defpackage.pz7 r26, defpackage.h12 r27, defpackage.z02 r28, long r29, final defpackage.zy7 r31, defpackage.ld4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtj.a(java.lang.String, iqb, boolean, pz7, h12, z02, long, zy7, ld4, int, int):void");
    }

    public static final void b(String str, a12 a12Var, iqb iqbVar, pz7 pz7Var, h12 h12Var, z02 z02Var, long j, zub zubVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        long j2;
        zub zubVar2;
        zy7 zy7Var2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(276925748);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(a12Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(h12Var) : e18Var.h(h12Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? e18Var.f(z02Var) : e18Var.h(z02Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j2 = j;
            i2 |= e18Var.e(j2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            j2 = j;
        }
        if ((12582912 & i) == 0) {
            zubVar2 = zubVar;
            i2 |= e18Var.f(zubVar2) ? 8388608 : 4194304;
        } else {
            zubVar2 = zubVar;
        }
        if ((i & 100663296) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 67108864 : 33554432;
        } else {
            zy7Var2 = zy7Var;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            int i3 = i2 >> 3;
            ysj.a(zy7Var2, iqbVar2, a12Var, h12Var, z02Var, j2, null, zubVar2, fd9.q0(870226208, new ye(pz7Var, str, z02Var, 14), e18Var), e18Var, 100663296 | ((i2 >> 24) & 14) | (i3 & 112) | ((i2 << 3) & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i2 & 29360128), 64);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new u02(str, a12Var, iqbVar, pz7Var, h12Var, z02Var, j, zubVar, zy7Var, i);
        }
    }

    public static final void c(final long j, final long j2, final Long l, final boolean z, final iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(158796041);
        int i2 = i | (e18Var.e(j) ? 4 : 2) | (e18Var.e(j2) ? 32 : 16) | (e18Var.f(l) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = j2 > 0 ? (int) ((j / j2) * 100.0f) : 0;
            float fD0 = j2 > 0 ? wd6.d0(j / j2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) : 0.0f;
            Float fValueOf = (l == null || j2 <= 0) ? null : Float.valueOf(wd6.d0(l.longValue() / j2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            fqb fqbVar = fqb.E;
            int i4 = i3;
            xn5.H(yfd.p(xn5.V(b.e(b.c(fqbVar, 1.0f), 8.0f), xve.b(4.0f)), gm3.a(e18Var).r, zni.b), null, false, fd9.q0(-184123179, new tq9(fD0, z, fValueOf), e18Var), e18Var, 3072, 6);
            tjh.b(d4c.k0(com.anthropic.claude.R.string.project_knowledge_capacity_used, new Object[]{Integer.valueOf(i4)}, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            if (!z || fValueOf == null || i4 < ((int) (fValueOf.floatValue() * 100.0f))) {
                e18Var.a0(1557742627);
                e18Var.p(false);
            } else {
                e18Var.a0(1557479964);
                tjh.b(d4c.j0(com.anthropic.claude.R.string.project_knowledge_search_info, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(j, j2, l, z, iqbVar, i) { // from class: uq9
                public final /* synthetic */ long E;
                public final /* synthetic */ long F;
                public final /* synthetic */ Long G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ iqb I;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(24577);
                    dtj.c(this.E, this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static int d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, le0.d(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final int e(long j, long j2) {
        boolean zJ = j(j);
        if (zJ != j(j2)) {
            return zJ ? -1 : 1;
        }
        return (Math.min(h(j), h(j2)) >= MTTypesetterKt.kLineSkipLimitMultiplier && i(j) != i(j2)) ? i(j) ? -1 : 1 : (int) Math.signum(h(j) - h(j2));
    }

    public static final float h(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean i(long j) {
        return (j & 2) != 0;
    }

    public static final boolean j(long j) {
        return (j & 1) != 0;
    }

    public static boolean k(knk knkVar, float f2, float f3) {
        if (knkVar instanceof flc) {
            l9e l9eVar = ((flc) knkVar).k;
            if (l9eVar.a <= f2 && f2 < l9eVar.c && l9eVar.b <= f3 && f3 < l9eVar.d) {
                return true;
            }
        } else {
            if (!(knkVar instanceof glc)) {
                if (knkVar instanceof elc) {
                    return l(f2, f3, ((elc) knkVar).k);
                }
                wg6.i();
                return false;
            }
            sve sveVar = ((glc) knkVar).k;
            float f4 = sveVar.a;
            long j = sveVar.f;
            long j2 = sveVar.h;
            long j3 = sveVar.g;
            float f5 = sveVar.d;
            float f6 = sveVar.b;
            float f7 = sveVar.c;
            long j4 = sveVar.e;
            if (f2 >= f4 && f2 < f7 && f3 >= f6 && f3 < f5) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= sveVar.b()) {
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= sveVar.b()) {
                        int i5 = (int) (j4 & 4294967295L);
                        int i6 = (int) (j2 & 4294967295L);
                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= sveVar.a()) {
                            int i7 = (int) (j & 4294967295L);
                            int i8 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= sveVar.a()) {
                                float fIntBitsToFloat = Float.intBitsToFloat(i) + f4;
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i5) + f6;
                                float fIntBitsToFloat3 = f7 - Float.intBitsToFloat(i2);
                                float fIntBitsToFloat4 = Float.intBitsToFloat(i7) + f6;
                                float fIntBitsToFloat5 = f7 - Float.intBitsToFloat(i4);
                                float fIntBitsToFloat6 = f5 - Float.intBitsToFloat(i8);
                                float fIntBitsToFloat7 = f5 - Float.intBitsToFloat(i6);
                                float fIntBitsToFloat8 = Float.intBitsToFloat(i3) + f4;
                                if (f2 < fIntBitsToFloat && f3 < fIntBitsToFloat2) {
                                    return m(f2, f3, fIntBitsToFloat, fIntBitsToFloat2, sveVar.e);
                                }
                                if (f2 < fIntBitsToFloat8 && f3 > fIntBitsToFloat7) {
                                    return m(f2, f3, fIntBitsToFloat8, fIntBitsToFloat7, sveVar.h);
                                }
                                if (f2 > fIntBitsToFloat3 && f3 < fIntBitsToFloat4) {
                                    return m(f2, f3, fIntBitsToFloat3, fIntBitsToFloat4, sveVar.f);
                                }
                                if (f2 <= fIntBitsToFloat5 || f3 <= fIntBitsToFloat6) {
                                    return true;
                                }
                                return m(f2, f3, fIntBitsToFloat5, fIntBitsToFloat6, sveVar.g);
                            }
                        }
                    }
                }
                c40 c40VarA = f40.a();
                c40.c(c40VarA, sveVar);
                return l(f2, f3, c40VarA);
            }
        }
        return false;
    }

    public static final boolean l(float f2, float f3, c40 c40Var) {
        l9e l9eVar = new l9e(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        c40 c40VarA = f40.a();
        c40.b(c40VarA, l9eVar);
        c40 c40VarA2 = f40.a();
        c40VarA2.h(c40Var, c40VarA, 1);
        boolean zIsEmpty = c40VarA2.a.isEmpty();
        c40VarA2.i();
        c40VarA.i();
        return !zIsEmpty;
    }

    public static final boolean m(float f2, float f3, float f4, float f5, long j) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f7 * f7) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static Context o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof np4) && ((np4) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        np4 np4Var = new np4(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            np4Var.getTheme().applyStyle(resourceId2, true);
        }
        return np4Var;
    }

    public abstract String f(byte[] bArr, int i, int i2);

    public abstract int g(String str, byte[] bArr, int i, int i2);

    public abstract int n(byte[] bArr, int i, int i2);
}
