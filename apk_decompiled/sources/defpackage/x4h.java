package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x4h {
    public static final ho3 a = new ho3(3, null, 5);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.d0h r5, boolean r6, defpackage.u7d r7, defpackage.tp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.n4h
            if (r0 == 0) goto L13
            r0 = r8
            n4h r0 = (defpackage.n4h) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            n4h r0 = new n4h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.H
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.G
            u7d r6 = r0.F
            d0h r7 = r0.E
            defpackage.sf5.h0(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L36:
            defpackage.sf5.h0(r8)
        L39:
            r0.E = r5
            r0.F = r7
            r0.G = r6
            r0.I = r2
            java.lang.Object r8 = r5.a(r7, r0)
            m45 r1 = defpackage.m45.E
            if (r8 != r1) goto L4a
            return r1
        L4a:
            t7d r8 = (defpackage.t7d) r8
            r1 = 0
            boolean r3 = g(r8, r6, r1)
            if (r3 == 0) goto L39
            java.util.List r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.a(d0h, boolean, u7d, tp4):java.lang.Object");
    }

    public static /* synthetic */ Object b(d0h d0hVar, tp4 tp4Var, int i) {
        return a(d0hVar, (i & 1) != 0, (i & 2) != 0 ? u7d.F : u7d.E, tp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.d0h r5, defpackage.u7d r6, defpackage.vd1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.o4h
            if (r0 == 0) goto L13
            r0 = r7
            o4h r0 = (defpackage.o4h) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            o4h r0 = new o4h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            u7d r5 = r0.F
            d0h r6 = r0.E
            defpackage.sf5.h0(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L33:
            defpackage.sf5.h0(r7)
        L36:
            r0.E = r5
            r0.F = r6
            r0.H = r2
            java.lang.Object r7 = r5.a(r6, r0)
            m45 r1 = defpackage.m45.E
            if (r7 != r1) goto L45
            return r1
        L45:
            t7d r7 = (defpackage.t7d) r7
            r1 = 0
            boolean r3 = g(r7, r1, r2)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.c(d0h, u7d, vd1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.d0h r7, defpackage.vp4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.q4h
            if (r0 == 0) goto L13
            r0 = r8
            q4h r0 = (defpackage.q4h) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            q4h r0 = new q4h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            d0h r7 = r0.E
            defpackage.sf5.h0(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.sf5.h0(r8)
        L31:
            r0.E = r7
            r0.G = r2
            u7d r8 = defpackage.u7d.F
            java.lang.Object r8 = r7.a(r8, r0)
            m45 r1 = defpackage.m45.E
            if (r8 != r1) goto L40
            return r1
        L40:
            t7d r8 = (defpackage.t7d) r8
            java.util.List r1 = r8.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L4d:
            if (r5 >= r3) goto L5b
            java.lang.Object r6 = r1.get(r5)
            z7d r6 = (defpackage.z7d) r6
            r6.a()
            int r5 = r5 + 1
            goto L4d
        L5b:
            java.util.List r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L64:
            if (r4 >= r1) goto L74
            java.lang.Object r3 = r8.get(r4)
            z7d r3 = (defpackage.z7d) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L71
            goto L31
        L71:
            int r4 = r4 + 1
            goto L64
        L74:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.d(d0h, vp4):java.lang.Object");
    }

    public static final Object e(e8d e8dVar, rz7 rz7Var, bz7 bz7Var, tp4 tp4Var) {
        Object objN = fd9.N(new mt4(e8dVar, rz7Var, bz7Var, new mdd(e8dVar), (tp4) null, 29), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    public static Object f(e8d e8dVar, kw0 kw0Var, bz7 bz7Var, rz7 rz7Var, bz7 bz7Var2, tp4 tp4Var, int i) {
        kw0 kw0Var2 = (i & 1) != 0 ? null : kw0Var;
        bz7 bz7Var3 = (i & 2) != 0 ? null : bz7Var;
        if ((i & 4) != 0) {
            rz7Var = a;
        }
        Object objN = fd9.N(new b9(e8dVar, kw0Var2, bz7Var3, rz7Var, (i & 8) != 0 ? null : bz7Var2, null, 25), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    public static final boolean g(t7d t7dVar, boolean z, boolean z2) {
        if (z2) {
            List list = t7dVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((z7d) list.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((t7dVar.d & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = t7dVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            z7d z7dVar = (z7d) list2.get(i2);
            if (!(z ? hvj.g(z7dVar) : hvj.h(z7dVar))) {
                return false;
            }
        }
        return true;
    }

    public static fkg i(l45 l45Var, lf9 lf9Var, pz7 pz7Var) {
        return gb9.D(l45Var, null, o45.H, new v2h(lf9Var, pz7Var, null, 1), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b1  */
    /* JADX WARN: Type inference failed for: r15v20, types: [tp4] */
    /* JADX WARN: Type inference failed for: r15v23, types: [tp4] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r4v27, types: [z7d] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.d0h r22, defpackage.l45 r23, defpackage.mdd r24, defpackage.bz7 r25, defpackage.bz7 r26, defpackage.rz7 r27, defpackage.bz7 r28, defpackage.vd1 r29) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.j(d0h, l45, mdd, bz7, bz7, rz7, bz7, vd1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.d0h r7, defpackage.u7d r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.v4h
            if (r0 == 0) goto L13
            r0 = r9
            v4h r0 = (defpackage.v4h) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            v4h r0 = new v4h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            dae r7 = r0.E
            defpackage.sf5.h0(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            goto L53
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L2e:
            dae r9 = defpackage.vb7.h(r9)
            mka r1 = defpackage.mka.a
            r9.E = r1
            ovi r1 = r7.c()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            long r4 = r1.b()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            f r1 = new f     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r6 = 8
            r1.<init>(r8, r9, r2, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r0.E = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r0.G = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            java.lang.Object r7 = r7.d(r4, r1, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L52
            return r8
        L52:
            r7 = r9
        L53:
            java.lang.Object r7 = r7.E
            return r7
        L56:
            oka r7 = defpackage.oka.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.k(d0h, u7d, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.d0h r17, defpackage.u7d r18, defpackage.vd1 r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4h.l(d0h, u7d, vd1):java.lang.Object");
    }
}
