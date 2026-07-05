package com.segment.analytics.kotlin.core;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.mff r17, defpackage.vp4 r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.dzf
            if (r2 == 0) goto L17
            r2 = r1
            dzf r2 = (defpackage.dzf) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.I = r3
            goto L1c
        L17:
            dzf r2 = new dzf
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.H
            int r3 = r2.I
            iei r4 = defpackage.iei.a
            java.lang.Class<a1h> r5 = defpackage.a1h.class
            r6 = 3
            r7 = 2
            r8 = 1
            m45 r9 = defpackage.m45.E
            if (r3 == 0) goto L59
            if (r3 == r8) goto L49
            if (r3 == r7) goto L3c
            if (r3 != r6) goto L35
            defpackage.sf5.h0(r1)
            return r4
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L3c:
            java.lang.String r0 = r2.G
            java.lang.String r3 = r2.F
            gx r5 = r2.E
            defpackage.sf5.h0(r1)
            r13 = r0
            r11 = r5
        L47:
            r12 = r3
            goto La6
        L49:
            java.lang.String r0 = r2.G
            java.lang.String r3 = r2.F
            gx r10 = r2.E
            defpackage.sf5.h0(r1)
            r16 = r1
            r1 = r0
            r0 = r10
            r10 = r16
            goto L7d
        L59:
            defpackage.sf5.h0(r1)
            eg4 r1 = r0.E
            java.lang.String r3 = r1.a
            java.lang.String r1 = r1.f
            el5 r10 = r0.F
            java.lang.Object r10 = r10.E
            lpg r10 = (defpackage.lpg) r10
            kce r11 = defpackage.jce.a
            pl9 r11 = r11.b(r5)
            r2.E = r0
            r2.F = r3
            r2.G = r1
            r2.I = r8
            java.lang.Object r10 = r10.a(r11, r2)
            if (r10 != r9) goto L7d
            goto Lc1
        L7d:
            a1h r10 = (defpackage.a1h) r10
            if (r10 != 0) goto L82
            goto Lc2
        L82:
            el5 r10 = r0.F
            java.lang.Object r10 = r10.E
            lpg r10 = (defpackage.lpg) r10
            z0h r11 = new z0h
            r12 = 0
            r11.<init>(r12, r8)
            kce r8 = defpackage.jce.a
            pl9 r5 = r8.b(r5)
            r2.E = r0
            r2.F = r3
            r2.G = r1
            r2.I = r7
            java.lang.Object r5 = r10.b(r11, r5, r2)
            if (r5 != r9) goto La3
            goto Lc1
        La3:
            r11 = r0
            r13 = r1
            goto L47
        La6:
            el5 r0 = r11.F
            java.lang.Object r0 = r0.G
            e45 r0 = (defpackage.e45) r0
            wmf r10 = new wmf
            r15 = 1
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r2.E = r14
            r2.F = r14
            r2.G = r14
            r2.I = r6
            java.lang.Object r0 = defpackage.gb9.c0(r0, r10, r2)
            if (r0 != r9) goto Lc2
        Lc1:
            return r9
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.b.a(mff, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.gx r10, com.segment.analytics.kotlin.core.Settings r11, defpackage.vp4 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ezf
            if (r0 == 0) goto L13
            r0 = r12
            ezf r0 = (defpackage.ezf) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ezf r0 = new ezf
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.G
            int r1 = r0.H
            r2 = 0
            iei r3 = defpackage.iei.a
            java.lang.Class<a1h> r4 = defpackage.a1h.class
            r5 = 2
            r6 = 1
            m45 r7 = defpackage.m45.E
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L35
            if (r1 != r5) goto L2f
            defpackage.sf5.h0(r12)
            return r3
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r2
        L35:
            com.segment.analytics.kotlin.core.Settings r11 = r0.F
            gx r10 = r0.E
            defpackage.sf5.h0(r12)
            goto L59
        L3d:
            defpackage.sf5.h0(r12)
            el5 r12 = r10.F
            java.lang.Object r12 = r12.E
            lpg r12 = (defpackage.lpg) r12
            kce r1 = defpackage.jce.a
            pl9 r1 = r1.b(r4)
            r0.E = r10
            r0.F = r11
            r0.H = r6
            java.lang.Object r12 = r12.a(r1, r0)
            if (r12 != r7) goto L59
            goto L90
        L59:
            a1h r12 = (defpackage.a1h) r12
            if (r12 != 0) goto L5e
            goto L91
        L5e:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            lqh r6 = r10.b()
            v80 r8 = new v80
            r9 = 5
            r8.<init>(r12, r1, r11, r9)
            r6.b(r8)
            el5 r10 = r10.F
            java.lang.Object r10 = r10.E
            lpg r10 = (defpackage.lpg) r10
            y0h r11 = new y0h
            r12 = 0
            r11.<init>(r12)
            r11.b = r1
            kce r12 = defpackage.jce.a
            pl9 r12 = r12.b(r4)
            r0.E = r2
            r0.F = r2
            r0.H = r5
            java.lang.Object r10 = r10.b(r11, r12, r0)
            if (r10 != r7) goto L91
        L90:
            return r7
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.b.b(gx, com.segment.analytics.kotlin.core.Settings, vp4):java.lang.Object");
    }
}
