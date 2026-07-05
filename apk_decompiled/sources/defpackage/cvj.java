package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteProgram;
import android.os.Build;
import android.util.Log;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.project.Project;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cvj {
    public static final ta4 a = new ta4(1826694375, false, new ua4(3));
    public static final ta4 b = new ta4(1514257847, false, new ua4(4));
    public static final ta4 c = new ta4(1285273109, false, new p6(29));
    public static final StackTraceElement[] d = new StackTraceElement[0];

    public static final void a(iqb iqbVar, lx9 lx9Var, ab8 ab8Var, mnc mncVar, eo7 eo7Var, boolean z, b20 b20Var, jo0 jo0Var, go0 go0Var, bz7 bz7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        int i4;
        lx9 lx9Var2;
        e18 e18Var;
        int i5;
        boolean z2;
        boolean z3;
        lx9 lx9Var3;
        kn9 kn9Var;
        boolean z4;
        iqb iqbVarC;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(708740370);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(lx9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? e18Var2.f(ab8Var) : e18Var2.h(ab8Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.f(mncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.g(false) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var2.g(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var2.f(eo7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var2.f(b20Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var2.f(jo0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.f(go0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if (e18Var2.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var2);
            int i9 = 6;
            boolean z5 = (((i8 & 14) ^ 6) > 4 && e18Var2.f(lx9Var)) || (i8 & 6) == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z5 || objN == lz1Var) {
                zp3 zp3Var = zp3.X;
                i5 = i3;
                objN = new h24(0, 1, wlg.class, mpk.x(new ft9(mpk.x(new d29(i9, nwbVarZ), zp3Var), 1, lx9Var), zp3Var), ExperienceToggle.DEFAULT_PARAM_KEY, "getValue()Ljava/lang/Object;");
                e18Var2.k0(objN);
            } else {
                i5 = i3;
            }
            kn9 kn9Var2 = (kn9) objN;
            int i10 = i7 | ((i5 >> 9) & 112);
            boolean z6 = ((((i10 & 112) ^ 48) > 32 && e18Var2.g(false)) || (i10 & 48) == 32) | ((((i10 & 14) ^ 6) > 4 && e18Var2.f(lx9Var)) || (i10 & 6) == 4);
            Object objN2 = e18Var2.N();
            if (z6 || objN2 == lz1Var) {
                objN2 = new h1a(lx9Var);
                e18Var2.k0(objN2);
            }
            h1a h1aVar = (h1a) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN3);
            }
            l45 l45Var = (l45) objN3;
            ga8 ga8Var = (ga8) e18Var2.j(ve4.g);
            unb unbVar = !((Boolean) e18Var2.j(ve4.x)).booleanValue() ? rng.a : null;
            int i11 = (i5 & 524272) | ((i4 << 18) & 3670016) | ((i5 >> 6) & 29360128);
            boolean zF = ((((458752 & i11) ^ 196608) > 131072 && e18Var2.g(true)) || (i11 & 196608) == 131072) | ((((i11 & 112) ^ 48) > 32 && e18Var2.f(lx9Var)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && e18Var2.f(ab8Var)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && e18Var2.f(mncVar)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && e18Var2.g(false)) || (i11 & 24576) == 16384) | ((((i11 & 3670016) ^ 1572864) > 1048576 && e18Var2.f(go0Var)) || (i11 & 1572864) == 1048576) | ((((i11 & 29360128) ^ 12582912) > 8388608 && e18Var2.f(jo0Var)) || (i11 & 12582912) == 8388608) | e18Var2.f(ga8Var);
            Object objN4 = e18Var2.N();
            if (zF || objN4 == lz1Var) {
                z2 = false;
                z3 = true;
                objN4 = new cx9(lx9Var, mncVar, kn9Var2, ab8Var, jo0Var, go0Var, l45Var, ga8Var, unbVar);
                lx9Var3 = lx9Var;
                kn9Var = kn9Var2;
                e18Var2.k0(objN4);
            } else {
                lx9Var3 = lx9Var;
                kn9Var = kn9Var2;
                z2 = false;
                z3 = true;
            }
            mz9 mz9Var = (mz9) objN4;
            ukc ukcVar = ukc.E;
            if (z) {
                e18Var2.a0(27281635);
                boolean z7 = (((i7 ^ 6) <= 4 || !e18Var2.f(lx9Var3)) && (i6 & 6) != 4) ? z2 : z3;
                Object objN5 = e18Var2.N();
                if (z7 || objN5 == lz1Var) {
                    objN5 = new tw9(lx9Var3);
                    e18Var2.k0(objN5);
                }
                z4 = false;
                iqbVarC = iuj.C((tw9) objN5, lx9Var3.n, false, ukcVar);
                e18Var2.p(z2);
            } else {
                z4 = false;
                e18Var2.a0(27577840);
                e18Var2.p(z2);
                iqbVarC = fqb.E;
            }
            kn9 kn9Var3 = kn9Var;
            lx9 lx9Var4 = lx9Var3;
            iqb iqbVarI = kxk.I(kxk.B(iqbVar.B(lx9Var3.k).B(lx9Var3.l), kn9Var, h1aVar, ukcVar, z, z4).B(iqbVarC).B(lx9Var3.m.k), lx9Var4, ukcVar, b20Var, z, z4, eo7Var, lx9Var3.f, null);
            lx9Var2 = lx9Var4;
            e18Var = e18Var2;
            ez1.g(kn9Var3, iqbVarI, lx9Var2.o, mz9Var, e18Var, 0);
        } else {
            lx9Var2 = lx9Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uw9(iqbVar, lx9Var2, ab8Var, mncVar, eo7Var, z, b20Var, jo0Var, go0Var, bz7Var, i, i2);
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2, cz5 cz5Var) {
        float f3 = yi6.a;
        double density = cz5Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d2 = ((double) yi6.a) * density;
        if (((float) (Math.exp((yi6.b / yi6.c) * Math.log(dAbs / d2)) * d2)) > e(edgeEffect) * f2) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        j(edgeEffect, mwa.L(f));
        return f;
    }

    public static void c(ty7 ty7Var, Object[] objArr) {
        SQLiteProgram sQLiteProgram = ty7Var.E;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                ty7Var.q(i);
            } else if (obj instanceof byte[]) {
                sQLiteProgram.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                ty7Var.k0(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                ty7Var.k0(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                ty7Var.o(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ty7Var.o(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ty7Var.o(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ty7Var.o(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ty7Var.o(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static EdgeEffect d(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? oe0.b(context) : new z78(context);
    }

    public static float e(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? oe0.d(edgeEffect) : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.v77 r5, defpackage.pz7 r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.w6d
            if (r0 == 0) goto L13
            r0 = r7
            w6d r0 = (defpackage.w6d) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            w6d r0 = new w6d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.F
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2e
            if (r1 == r2) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return
        L2a:
            defpackage.sf5.h0(r7)
            goto L6c
        L2e:
            kotlin.KotlinNothingValueException r5 = defpackage.sq6.y(r7)
            throw r5
        L33:
            defpackage.sf5.h0(r7)
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r1 = r5.t
            boolean r7 = defpackage.x44.r(r7, r1)
            r1 = 0
            if (r7 == 0) goto L49
            r0.F = r3
            g(r5, r1, r6, r0)
            return
        L49:
            android.os.Looper r7 = r5.t
            android.os.Handler r7 = defpackage.dgj.A(r7)
            r7.getClass()
            int r3 = defpackage.af8.a
            ye8 r3 = new ye8
            r4 = 0
            r3.<init>(r7, r1, r4)
            kza r7 = new kza
            r4 = 16
            r7.<init>(r5, r6, r1, r4)
            r0.F = r2
            java.lang.Object r5 = defpackage.gb9.c0(r3, r7, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L6c
            return
        L6c:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvj.f(v77, pz7, vp4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.v77 r5, defpackage.t6d r6, defpackage.pz7 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.x6d
            if (r0 == 0) goto L13
            r0 = r8
            x6d r0 = (defpackage.x6d) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            x6d r0 = new x6d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.H
            r2 = 0
            java.lang.String r3 = "listener"
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return
        L2a:
            dae r5 = r0.F
            v77 r6 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L34
            r8 = r5
            r5 = r6
            goto L72
        L34:
            r7 = move-exception
            r8 = r5
            r5 = r6
            goto L81
        L38:
            dae r8 = defpackage.vb7.h(r8)
            r0.E = r5     // Catch: java.lang.Throwable -> L78
            r0.F = r8     // Catch: java.lang.Throwable -> L78
            r0.H = r4     // Catch: java.lang.Throwable -> L78
            ua2 r1 = new ua2     // Catch: java.lang.Throwable -> L78
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L78
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L78
            r1.t()     // Catch: java.lang.Throwable -> L78
            a7d r0 = new a7d     // Catch: java.lang.Throwable -> L78
            r0.<init>(r6, r7, r1)     // Catch: java.lang.Throwable -> L78
            r8.E = r0     // Catch: java.lang.Throwable -> L78
            vn1 r6 = new vn1     // Catch: java.lang.Throwable -> L78
            r7 = 3
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L78
            r1.w(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r8.E     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L7d
            a7d r6 = (defpackage.a7d) r6     // Catch: java.lang.Throwable -> L78
            kba r7 = r5.m     // Catch: java.lang.Throwable -> L7a
            r7.a(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r1.r()     // Catch: java.lang.Throwable -> L78
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L72
            return
        L72:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            throw r6     // Catch: java.lang.Throwable -> L78
        L78:
            r7 = move-exception
            goto L81
        L7a:
            r6 = move-exception
            r7 = r6
            goto L81
        L7d:
            defpackage.x44.o0(r3)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L81:
            java.lang.Object r6 = r8.E
            if (r6 != 0) goto L89
            defpackage.x44.o0(r3)
            throw r2
        L89:
            a7d r6 = (defpackage.a7d) r6
            r5.x(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvj.g(v77, t6d, pz7, vp4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.v77 r9, int r10, int[] r11, defpackage.ska r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.y6d
            if (r0 == 0) goto L13
            r0 = r13
            y6d r0 = (defpackage.y6d) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            y6d r0 = new y6d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.E
            int r1 = r0.F
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2a
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return
        L2a:
            defpackage.sf5.h0(r13)
            goto La1
        L2f:
            kotlin.KotlinNothingValueException r9 = defpackage.sq6.y(r13)
            throw r9
        L34:
            defpackage.sf5.h0(r13)
            t6d r5 = new t6d
            android.util.SparseBooleanArray r13 = new android.util.SparseBooleanArray
            r13.<init>()
            r1 = 0
            r1 = r1 ^ r3
            defpackage.fd9.M(r1)
            r13.append(r10, r3)
            int r10 = r11.length
            int[] r10 = java.util.Arrays.copyOf(r11, r10)
            int r11 = r10.length
            r1 = 0
            r4 = r1
        L4e:
            if (r4 >= r11) goto L5d
            r6 = r10[r4]
            r7 = 0
            r7 = r7 ^ r3
            defpackage.fd9.M(r7)
            r13.append(r6, r3)
            int r4 = r4 + 1
            goto L4e
        L5d:
            r10 = 0
            r10 = r10 ^ r3
            defpackage.fd9.M(r10)
            en7 r10 = new en7
            r10.<init>(r13)
            r5.<init>(r10)
            android.os.Looper r10 = android.os.Looper.myLooper()
            android.os.Looper r11 = r9.t
            boolean r10 = defpackage.x44.r(r10, r11)
            if (r10 == 0) goto L7c
            r0.F = r3
            g(r9, r5, r12, r0)
            return
        L7c:
            android.os.Looper r10 = r9.t
            android.os.Handler r10 = defpackage.dgj.A(r10)
            r10.getClass()
            int r11 = defpackage.af8.a
            ye8 r11 = new ye8
            r7 = 0
            r11.<init>(r10, r7, r1)
            ba9 r3 = new ba9
            r8 = 9
            r4 = r9
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.F = r2
            java.lang.Object r9 = defpackage.gb9.c0(r11, r3, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto La1
            return
        La1:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvj.h(v77, int, int[], ska, vp4):void");
    }

    public static final void i(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }

    public static void j(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float k(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return oe0.h(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static void l(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof z78)) {
            edgeEffect.onRelease();
            return;
        }
        z78 z78Var = (z78) edgeEffect;
        float f2 = z78Var.b + f;
        z78Var.b = f2;
        if (Math.abs(f2) > z78Var.a) {
            z78Var.onRelease();
        }
    }

    public static final g62 m(Project project, bg9 bg9Var) {
        project.getClass();
        return new g62(project.m404getUuid5pmjbU(), project.getUpdated_at(), bg9Var.d(project, Project.Companion.serializer()));
    }

    public static final ArrayList n(List list, bg9 bg9Var) {
        Project project;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g62 g62Var = (g62) it.next();
            try {
                g62Var.getClass();
                project = (Project) bg9Var.b(g62Var.c, Project.Companion.serializer());
            } catch (Exception e) {
                List list2 = xah.a;
                xah.f(e, ij0.i("Failed to deserialize project ", g62Var.a), ozf.F, null, 24);
                project = null;
            }
            if (project != null) {
                arrayList.add(project);
            }
        }
        return arrayList;
    }
}
