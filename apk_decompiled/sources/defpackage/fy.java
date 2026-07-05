package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class fy {
    public static final b8 a = new b8(9);
    public static final zn5 b = new zn5(new zp3(12));

    public static final vq5 a(bz7 bz7Var) {
        ed6 ed6Var = new ed6();
        bz7Var.invoke(ed6Var);
        float[] fArr = ed6Var.b;
        ArrayList arrayList = ed6Var.a;
        int size = arrayList.size();
        fArr.getClass();
        yfd.t(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        return new vq5(arrayList, fArrCopyOfRange);
    }

    public static final Object b(ry ryVar, float f, qy qyVar, vq5 vq5Var, Object obj, mb0 mb0Var, xzg xzgVar) {
        Object objK;
        float f2 = vq5Var.f(obj);
        aae aaeVar = new aae();
        aaeVar.E = Float.isNaN(ryVar.j.h()) ? MTTypesetterKt.kLineSkipLimitMultiplier : ryVar.j.h();
        if (!Float.isNaN(f2)) {
            float f3 = aaeVar.E;
            if (f3 != f2 && (objK = mpk.k(f3, f2, f, mb0Var, new kn(qyVar, 4, aaeVar), xzgVar)) == m45.E) {
                return objK;
            }
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.vq5 r6, float r7, float r8, defpackage.bz7 r9, defpackage.zy7 r10) {
        /*
            boolean r0 = java.lang.Float.isNaN(r7)
            r1 = 0
            if (r0 != 0) goto L91
            float r0 = java.lang.Math.abs(r8)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r0 <= 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 == 0) goto L1d
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r0 != 0) goto L28
            java.lang.Object r6 = r6.a(r7)
            r6.getClass()
            return r6
        L28:
            float r8 = java.lang.Math.abs(r8)
            java.lang.Object r10 = r10.a()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r10 = java.lang.Math.abs(r10)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L46
            java.lang.Object r6 = r6.b(r7, r2)
            r6.getClass()
            return r6
        L46:
            java.lang.Object r8 = r6.b(r7, r3)
            r8.getClass()
            float r10 = r6.f(r8)
            java.lang.Object r0 = r6.b(r7, r4)
            r0.getClass()
            float r6 = r6.f(r0)
            float r5 = r10 - r6
            float r5 = java.lang.Math.abs(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r9 = r9.invoke(r5)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            if (r2 == 0) goto L77
            goto L78
        L77:
            r10 = r6
        L78:
            float r10 = r10 - r7
            float r6 = java.lang.Math.abs(r10)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L82
            r3 = r4
        L82:
            if (r3 != r4) goto L87
            if (r2 == 0) goto L8b
            goto L8c
        L87:
            if (r3 != 0) goto L8d
            if (r2 == 0) goto L8c
        L8b:
            return r8
        L8c:
            return r0
        L8d:
            defpackage.mr9.b()
            return r1
        L91:
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            defpackage.sz6.p(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.c(vq5, float, float, bz7, zy7):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.zy7 r4, defpackage.pz7 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cy
            if (r0 == 0) goto L13
            r0 = r6
            cy r0 = (defpackage.cy) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            cy r0 = new cy
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            o0 r6 = new o0     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r1 = 9
            r6.<init>(r4, r5, r2, r1)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r0.F = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = defpackage.fd9.N(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L41
            return r5
        L41:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.d(zy7, pz7, vp4):java.lang.Object");
    }

    public static iqb e(iqb iqbVar, ry ryVar, boolean z, ukc ukcVar, boolean z2, eo7 eo7Var, int i) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 64) != 0) {
            eo7Var = null;
        }
        return iqbVar.B(new wx(ryVar, ukcVar, z3, Boolean.valueOf(z), null, eo7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.ry r10, java.lang.Object r11, float r12, defpackage.mb0 r13, defpackage.zn5 r14, defpackage.vp4 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.yx
            if (r0 == 0) goto L13
            r0 = r15
            yx r0 = (defpackage.yx) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            yx r0 = new yx
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            float r12 = r0.E
            aae r10 = r0.F
            defpackage.sf5.h0(r15)
            goto L57
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            r10 = 0
            return r10
        L30:
            defpackage.sf5.h0(r15)
            aae r7 = new aae
            r7.<init>()
            r7.E = r12
            ay r3 = new ay
            r9 = 0
            r4 = r10
            r5 = r12
            r6 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.F = r7
            r0.E = r5
            r0.H = r2
            zwb r10 = defpackage.zwb.E
            java.lang.Object r10 = r4.a(r11, r10, r3, r0)
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L55
            return r11
        L55:
            r12 = r5
            r10 = r7
        L57:
            float r10 = r10.E
            float r12 = r12 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.f(ry, java.lang.Object, float, mb0, zn5, vp4):java.lang.Object");
    }

    public static Object g(ry ryVar, Object obj, float f, hy hyVar) {
        mb0 mb0Var;
        zn5 zn5Var;
        if (ryVar.d()) {
            mb0Var = ryVar.d;
            if (mb0Var == null) {
                x44.o0("snapAnimationSpec");
                throw null;
            }
        } else {
            mb0Var = vx.a;
        }
        mb0 mb0Var2 = mb0Var;
        if (ryVar.d()) {
            zn5Var = ryVar.e;
            if (zn5Var == null) {
                x44.o0("decayAnimationSpec");
                throw null;
            }
        } else {
            zn5Var = vx.c;
        }
        return f(ryVar, obj, f, mb0Var2, zn5Var, hyVar);
    }
}
