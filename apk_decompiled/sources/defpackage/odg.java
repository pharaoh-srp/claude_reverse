package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class odg {
    public long a;
    public boolean b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;

    public odg(Context context, y5k y5kVar, Long l) {
        this.b = true;
        dgj.v(context);
        Context applicationContext = context.getApplicationContext();
        dgj.v(applicationContext);
        this.c = applicationContext;
        this.i = l;
        if (y5kVar != null) {
            this.h = y5kVar;
            this.d = y5kVar.J;
            this.e = y5kVar.I;
            this.f = y5kVar.H;
            this.b = y5kVar.G;
            this.a = y5kVar.F;
            this.j = y5kVar.L;
            Bundle bundle = y5kVar.K;
            if (bundle != null) {
                this.g = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    public void a() {
        synchronized (this.h) {
            wwb wwbVar = (wwb) this.g;
            Object[] objArr = wwbVar.E;
            int i = wwbVar.G;
            for (int i2 = 0; i2 < i; i2++) {
                ndg ndgVar = (ndg) objArr[i2];
                ndgVar.e.a();
                ndgVar.f.a();
                ndgVar.l.a();
                ndgVar.m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Object r2 = r0.h
            monitor-enter(r2)
            java.lang.Object r0 = r0.g     // Catch: java.lang.Throwable -> L90
            wwb r0 = (defpackage.wwb) r0     // Catch: java.lang.Throwable -> L90
            int r3 = r0.G     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r6 = 0
        Lf:
            java.lang.Object[] r7 = r0.E
            if (r5 >= r3) goto L96
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L90
            ndg r7 = (defpackage.ndg) r7     // Catch: java.lang.Throwable -> L90
            ewb r8 = r7.f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L90
            mvb r8 = (defpackage.mvb) r8     // Catch: java.lang.Throwable -> L90
            if (r8 != 0) goto L23
        L21:
            r15 = r5
            goto L7a
        L23:
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L90
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> L90
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> L90
            int r11 = r8.length     // Catch: java.lang.Throwable -> L90
            int r11 = r11 + (-2)
            if (r11 < 0) goto L21
            r12 = 0
        L2f:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L90
            r15 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L90
            r16 = 7
            long r4 = r4 << r16
            long r4 = r4 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L74
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L90
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r16 = r5
            r5 = 0
        L4f:
            if (r5 >= r4) goto L70
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L69
            int r17 = r12 << 3
            int r17 = r17 + r5
            r18 = r5
            r5 = r9[r17]     // Catch: java.lang.Throwable -> L90
            r17 = r10[r17]     // Catch: java.lang.Throwable -> L90
            r7.c(r1, r5)     // Catch: java.lang.Throwable -> L90
            goto L6b
        L69:
            r18 = r5
        L6b:
            long r13 = r13 >> r16
            int r5 = r18 + 1
            goto L4f
        L70:
            r5 = r16
            if (r4 != r5) goto L7a
        L74:
            if (r12 == r11) goto L7a
            int r12 = r12 + 1
            r5 = r15
            goto L2f
        L7a:
            ewb r4 = r7.f     // Catch: java.lang.Throwable -> L90
            boolean r4 = r4.j()     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L85
            int r6 = r6 + 1
            goto L92
        L85:
            if (r6 <= 0) goto L92
            java.lang.Object[] r4 = r0.E     // Catch: java.lang.Throwable -> L90
            int r5 = r15 - r6
            r7 = r4[r15]     // Catch: java.lang.Throwable -> L90
            r4[r5] = r7     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La0
        L92:
            int r5 = r15 + 1
            goto Lf
        L96:
            int r1 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r1, r3, r4)     // Catch: java.lang.Throwable -> L90
            r0.G = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La0:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odg.b(java.lang.Object):void");
    }

    public boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.h) {
            z = this.b;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.d;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        pd4.b("Unexpected notification");
                        sz6.r();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.h) {
                wwb wwbVar = (wwb) this.g;
                Object[] objArr = wwbVar.E;
                int i = wwbVar.G;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ndg) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r27, defpackage.bz7 r28, defpackage.zy7 r29) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odg.d(java.lang.Object, bz7, zy7):void");
    }

    public void e() {
        a21 a21Var = (a21) this.e;
        ycg.e(ycg.a);
        synchronized (ycg.c) {
            ycg.h = w44.b1(ycg.h, a21Var);
        }
        this.i = new cd(15, a21Var);
    }

    public odg(bz7 bz7Var) {
        this.c = bz7Var;
        this.d = new AtomicReference(null);
        this.e = new a21(23, this);
        this.f = new tz9(28, this);
        this.g = new wwb(0, new ndg[16]);
        this.h = new Object();
        this.a = -1L;
    }
}
