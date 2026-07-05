package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class gv5 {
    public static final wjc k = new p84(new z31(4));
    public d87 a;
    public yp5 b;
    public final Object c;
    public final Context d;
    public final lyk e;
    public final bv5 f;
    public Thread g;
    public s31 h;
    public p31 i;
    public Boolean j;

    public gv5(Context context) {
        lyk lykVar = new lyk(22);
        bv5 bv5Var = bv5.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = lykVar;
        if (bv5Var != null) {
            this.f = bv5Var;
        } else {
            bv5Var.getClass();
            av5 av5Var = new av5(bv5Var);
            av5Var.a(bv5Var);
            this.f = new bv5(av5Var);
        }
        this.i = p31.b;
        if (this.f.A && context == null) {
            ysj.u("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(jw7 jw7Var, nz8 nz8Var) {
        for (int i = 0; i < nz8Var.size(); i++) {
            for (int i2 = 0; i2 < jw7Var.c.size(); i2++) {
                if (((rs9) jw7Var.c.get(i2)).b.equals(nz8Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void b(pta ptaVar, bv5 bv5Var, e87[] e87VarArr) {
        int i = ptaVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            w3i w3iVar = ptaVar.c[i2];
            Map map = (Map) bv5Var.D.get(i2);
            if (map != null && map.containsKey(w3iVar)) {
                Map map2 = (Map) bv5Var.D.get(i2);
                if (map2 != null && map2.get(w3iVar) != null) {
                    mr9.o();
                    return;
                }
                e87VarArr[i2] = null;
            }
        }
    }

    public static void c(pta ptaVar, bv5 bv5Var, e87[] e87VarArr) {
        for (int i = 0; i < ptaVar.a; i++) {
            int i2 = ptaVar.b[i];
            if (bv5Var.E.get(i) || bv5Var.v.contains(Integer.valueOf(i2))) {
                e87VarArr[i] = null;
            }
        }
    }

    public static void d(pta ptaVar, bv5 bv5Var) {
        int i = ptaVar.a;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            w3i w3iVar = ptaVar.c[i2];
            for (int i3 = 0; i3 < w3iVar.a; i3++) {
                if (bv5Var.u.get(w3iVar.a(i3)) != null) {
                    mr9.o();
                    return;
                }
            }
        }
        w3i w3iVar2 = ptaVar.f;
        for (int i4 = 0; i4 < w3iVar2.a; i4++) {
            if (bv5Var.u.get(w3iVar2.a(i4)) != null) {
                mr9.o();
                return;
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (map.get(Integer.valueOf(ptaVar.b[i5])) != null) {
                mr9.o();
                return;
            }
        }
    }

    public static Pair e(e87[] e87VarArr, int i) {
        for (int i2 = 0; i2 < e87VarArr.length; i2++) {
            e87 e87Var = e87VarArr[i2];
            if (e87Var != null && e87Var.a.c == i) {
                return Pair.create(e87Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(jw7 jw7Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(jw7Var.d)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(jw7Var.d);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        String str2 = tpi.a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.e87 j(defpackage.w3i r13, int[][] r14, defpackage.bv5 r15) {
        /*
            c4i r0 = r15.q
            r0.getClass()
            r0 = 0
            r1 = 0
            r3 = r0
            r5 = r3
            r2 = r1
            r4 = r2
        Lb:
            int r6 = r13.a
            if (r2 >= r6) goto L52
            v3i r6 = r13.a(r2)
            r7 = r14[r2]
            r8 = r1
        L16:
            int r9 = r6.a
            if (r8 >= r9) goto L4f
            r9 = r7[r8]
            boolean r10 = r15.B
            boolean r9 = defpackage.pe1.n(r9, r10)
            if (r9 == 0) goto L4c
            jw7[] r9 = r6.d
            r9 = r9[r8]
            zu5 r10 = new zu5
            r11 = r7[r8]
            r10.<init>(r9, r11)
            if (r5 == 0) goto L49
            boolean r9 = r10.F
            boolean r11 = r5.F
            q84 r12 = defpackage.s84.a
            s84 r9 = r12.c(r9, r11)
            boolean r11 = r10.E
            boolean r12 = r5.E
            s84 r9 = r9.c(r11, r12)
            int r9 = r9.e()
            if (r9 <= 0) goto L4c
        L49:
            r3 = r6
            r4 = r8
            r5 = r10
        L4c:
            int r8 = r8 + 1
            goto L16
        L4f:
            int r2 = r2 + 1
            goto Lb
        L52:
            if (r3 != 0) goto L55
            return r0
        L55:
            e87 r13 = new e87
            int[] r14 = new int[]{r4}
            r13.<init>(r3, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv5.j(w3i, int[][], bv5):e87");
    }

    public static Pair k(int i, pta ptaVar, int[][][] iArr, dv5 dv5Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessU;
        pta ptaVar2 = ptaVar;
        ArrayList arrayList = new ArrayList();
        int i3 = ptaVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ptaVar2.b[i4]) {
                w3i w3iVar = ptaVar2.c[i4];
                for (int i5 = 0; i5 < w3iVar.a; i5++) {
                    v3i v3iVarA = w3iVar.a(i5);
                    vde vdeVarE = dv5Var.e(i4, v3iVarA, iArr[i4][i5]);
                    int i6 = v3iVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        ev5 ev5Var = (ev5) vdeVarE.get(i7);
                        int iA = ev5Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessU = nz8.u(ev5Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ev5Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    ev5 ev5Var2 = (ev5) vdeVarE.get(i8);
                                    int i9 = i3;
                                    if (ev5Var2.a() == 2 && ev5Var.b(ev5Var2)) {
                                        arrayList2.add(ev5Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessU = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessU);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            ptaVar2 = ptaVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((ev5) list.get(i10)).G;
        }
        ev5 ev5Var3 = (ev5) list.get(0);
        return Pair.create(new e87(ev5Var3.F, iArr2), Integer.valueOf(ev5Var3.E));
    }

    public final void g() {
        boolean z;
        d87 d87Var;
        s31 s31Var;
        synchronized (this.c) {
            try {
                z = this.f.A && Build.VERSION.SDK_INT >= 32 && (s31Var = this.h) != null && s31Var.F;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (d87Var = this.a) == null) {
            return;
        }
        d87Var.L.f(10);
    }

    public final void i() {
        s31 s31Var;
        lgg lggVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    fd9.L("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (s31Var = this.h) != null) {
            Handler handler = (Handler) s31Var.H;
            Spatializer spatializer = (Spatializer) s31Var.G;
            if (spatializer != null && (lggVar = (lgg) s31Var.I) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(lggVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }
}
