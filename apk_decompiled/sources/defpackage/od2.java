package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class od2 {
    public ed2 c;
    public Integer d;
    public List a = lm6.E;
    public uub b = new uub();
    public final jxb e = new jxb();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.od2 r18, java.lang.Object r19, float r20, defpackage.ed2 r21, defpackage.xd2 r22, defpackage.vp4 r23) {
        /*
            r0 = r18
            r1 = r23
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.ld2
            if (r2 == 0) goto L1a
            r2 = r1
            ld2 r2 = (defpackage.ld2) r2
            int r3 = r2.L
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.L = r3
            goto L1f
        L1a:
            ld2 r2 = new ld2
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.J
            int r3 = r2.L
            iei r4 = defpackage.iei.a
            r5 = 2
            r6 = 1
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r3 == 0) goto L4c
            if (r3 == r6) goto L3a
            if (r3 != r5) goto L34
            defpackage.sf5.h0(r1)
            return r4
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L3a:
            int r0 = r2.I
            float r3 = r2.H
            id2 r6 = r2.G
            xd2 r9 = r2.F
            ed2 r10 = r2.E
            defpackage.sf5.h0(r1)
            r13 = r3
            r12 = r6
            r15 = r9
            r14 = r10
            goto L89
        L4c:
            defpackage.sf5.h0(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            r1 = r19
            java.lang.Object r0 = r0.get(r1)
            id2 r0 = (defpackage.id2) r0
            if (r0 != 0) goto L5c
            goto La7
        L5c:
            r1 = r21
            r2.E = r1
            r3 = r22
            r2.F = r3
            r2.G = r0
            r9 = r20
            r2.H = r9
            r10 = 0
            r2.I = r10
            r2.L = r6
            c45 r6 = r2.getContext()
            tqh r11 = defpackage.tqh.R
            a45 r6 = r6.x0(r11)
            if (r6 == 0) goto L7e
            wdi r6 = defpackage.g86.b
            goto L80
        L7e:
            ft5 r6 = defpackage.g86.a
        L80:
            if (r6 != r8) goto L83
            goto La6
        L83:
            r12 = r0
            r14 = r1
            r15 = r3
            r1 = r6
            r13 = r9
            r0 = r10
        L89:
            c45 r1 = (defpackage.c45) r1
            md2 r11 = new md2
            r16 = 0
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2.E = r7
            r2.F = r7
            r2.G = r7
            r2.H = r13
            r2.I = r0
            r2.L = r5
            java.lang.Object r0 = defpackage.gb9.c0(r1, r11, r2)
            if (r0 != r8) goto La7
        La6:
            return r8
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.a(od2, java.lang.Object, float, ed2, xd2, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (defpackage.gb9.c0((defpackage.c45) r0, r2, r1) == r15) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r17, defpackage.sd2 r18, defpackage.qd2 r19, defpackage.nn r20, defpackage.td2 r21, defpackage.uub r22, defpackage.l0 r23, defpackage.nn r24, defpackage.vp4 r25) {
        /*
            r16 = this;
            r0 = r25
            boolean r1 = r0 instanceof defpackage.jd2
            if (r1 == 0) goto L17
            r1 = r0
            jd2 r1 = (defpackage.jd2) r1
            int r2 = r1.O
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.O = r2
            r3 = r16
            goto L1e
        L17:
            jd2 r1 = new jd2
            r3 = r16
            r1.<init>(r3, r0)
        L1e:
            java.lang.Object r0 = r1.M
            int r2 = r1.O
            r13 = 2
            r4 = 1
            r14 = 0
            m45 r15 = defpackage.m45.E
            if (r2 == 0) goto L55
            if (r2 == r4) goto L38
            if (r2 != r13) goto L32
            defpackage.sf5.h0(r0)
            goto Lb8
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r14
        L38:
            nn r2 = r1.L
            l0 r4 = r1.K
            uub r5 = r1.J
            td2 r6 = r1.I
            nn r7 = r1.H
            qd2 r8 = r1.G
            sd2 r9 = r1.F
            java.lang.Object r10 = r1.E
            defpackage.sf5.h0(r0)
            r11 = r7
            r7 = r5
            r5 = r8
            r8 = r11
            r11 = r10
            r10 = r4
            r4 = r9
            r9 = r6
            r6 = r2
            goto L97
        L55:
            defpackage.sf5.h0(r0)
            r0 = r17
            r1.E = r0
            r2 = r18
            r1.F = r2
            r5 = r19
            r1.G = r5
            r6 = r20
            r1.H = r6
            r7 = r21
            r1.I = r7
            r8 = r22
            r1.J = r8
            r9 = r23
            r1.K = r9
            r10 = r24
            r1.L = r10
            r1.O = r4
            c45 r4 = r1.getContext()
            tqh r11 = defpackage.tqh.R
            a45 r4 = r4.x0(r11)
            if (r4 == 0) goto L89
            wdi r4 = defpackage.g86.b
            goto L8b
        L89:
            ft5 r4 = defpackage.g86.a
        L8b:
            if (r4 != r15) goto L8e
            goto Lb7
        L8e:
            r11 = r8
            r8 = r6
            r6 = r10
            r10 = r9
            r9 = r7
            r7 = r11
            r11 = r0
            r0 = r4
            r4 = r2
        L97:
            c45 r0 = (defpackage.c45) r0
            kd2 r2 = new kd2
            r12 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.E = r14
            r1.F = r14
            r1.G = r14
            r1.H = r14
            r1.I = r14
            r1.J = r14
            r1.K = r14
            r1.L = r14
            r1.O = r13
            java.lang.Object r0 = defpackage.gb9.c0(r0, r2, r1)
            if (r0 != r15) goto Lb8
        Lb7:
            return r15
        Lb8:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.b(java.util.UUID, sd2, qd2, nn, td2, uub, l0, nn, vp4):java.lang.Object");
    }
}
