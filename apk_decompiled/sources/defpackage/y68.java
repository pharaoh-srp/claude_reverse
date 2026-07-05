package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y68 {
    public static final y68 a = new y68();
    public static final jxb b = new jxb();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r5, defpackage.fw9 r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.u68
            if (r0 == 0) goto L13
            r0 = r8
            u68 r0 = (defpackage.u68) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            u68 r0 = new u68
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.I
            int r8 = r0.K
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L36
            if (r8 != r1) goto L30
            jxb r5 = r0.H
            java.lang.String r7 = r0.G
            fw9 r6 = r0.F
            android.content.Context r8 = r0.E
            defpackage.sf5.h0(r4)
            r4 = r5
            r5 = r8
            goto L4e
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L36:
            defpackage.sf5.h0(r4)
            r0.E = r5
            r0.F = r6
            r0.G = r7
            jxb r4 = defpackage.y68.b
            r0.H = r4
            r0.K = r1
            java.lang.Object r8 = r4.c(r0)
            m45 r0 = defpackage.m45.E
            if (r8 != r0) goto L4e
            return r0
        L4e:
            java.util.LinkedHashMap r8 = defpackage.y68.c     // Catch: java.lang.Throwable -> L6a
            r8.remove(r7)     // Catch: java.lang.Throwable -> L6a
            int r6 = r6.a     // Catch: java.lang.Throwable -> L6a
            switch(r6) {
                case 0: goto L5d;
                default: goto L58;
            }     // Catch: java.lang.Throwable -> L6a
        L58:
            java.io.File r5 = defpackage.xvj.k(r5, r7)     // Catch: java.lang.Throwable -> L6a
            goto L61
        L5d:
            java.io.File r5 = defpackage.tvk.c(r5, r7)     // Catch: java.lang.Throwable -> L6a
        L61:
            r5.delete()     // Catch: java.lang.Throwable -> L6a
            r4.d(r2)
            iei r4 = defpackage.iei.a
            return r4
        L6a:
            r5 = move-exception
            r4.d(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y68.a(android.content.Context, fw9, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r6, defpackage.fw9 r7, java.lang.String r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.v68
            if (r0 == 0) goto L13
            r0 = r9
            v68 r0 = (defpackage.v68) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            v68 r0 = new v68
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r5 = r0.I
            int r9 = r0.K
            r1 = 2
            r2 = 1
            r3 = 0
            m45 r4 = defpackage.m45.E
            if (r9 == 0) goto L55
            if (r9 == r2) goto L40
            if (r9 != r1) goto L3a
            java.io.Serializable r6 = r0.G
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.F
            hxb r7 = (defpackage.hxb) r7
            java.lang.Object r8 = r0.E
            java.lang.String r8 = (java.lang.String) r8
            defpackage.sf5.h0(r5)     // Catch: java.lang.Throwable -> L37
            goto L87
        L37:
            r5 = move-exception
            goto L9c
        L3a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L40:
            jxb r6 = r0.H
            java.io.Serializable r7 = r0.G
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.F
            fw9 r7 = (defpackage.fw9) r7
            java.lang.Object r9 = r0.E
            android.content.Context r9 = (android.content.Context) r9
            defpackage.sf5.h0(r5)
            r5 = r6
            r6 = r9
            goto L6b
        L55:
            defpackage.sf5.h0(r5)
            r0.E = r6
            r0.F = r7
            r0.G = r8
            jxb r5 = defpackage.y68.b
            r0.H = r5
            r0.K = r2
            java.lang.Object r9 = r5.c(r0)
            if (r9 != r4) goto L6b
            goto L83
        L6b:
            java.util.LinkedHashMap r9 = defpackage.y68.c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r9.get(r8)     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L92
            r0.E = r8     // Catch: java.lang.Throwable -> L8e
            r0.F = r5     // Catch: java.lang.Throwable -> L8e
            r0.G = r9     // Catch: java.lang.Throwable -> L8e
            r0.H = r3     // Catch: java.lang.Throwable -> L8e
            r0.K = r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r7.a(r6, r8)     // Catch: java.lang.Throwable -> L8e
            if (r6 != r4) goto L84
        L83:
            return r4
        L84:
            r7 = r5
            r5 = r6
            r6 = r9
        L87:
            r2 = r5
            vg5 r2 = (defpackage.vg5) r2     // Catch: java.lang.Throwable -> L37
            r6.put(r8, r2)     // Catch: java.lang.Throwable -> L37
            goto L93
        L8e:
            r6 = move-exception
            r7 = r5
            r5 = r6
            goto L9c
        L92:
            r7 = r5
        L93:
            r2.getClass()     // Catch: java.lang.Throwable -> L37
            vg5 r2 = (defpackage.vg5) r2     // Catch: java.lang.Throwable -> L37
            r7.d(r3)
            return r2
        L9c:
            r7.d(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y68.b(android.content.Context, fw9, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r6, defpackage.fw9 r7, java.lang.String r8, defpackage.vp4 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.w68
            if (r0 == 0) goto L13
            r0 = r9
            w68 r0 = (defpackage.w68) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            w68 r0 = new w68
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.sf5.h0(r9)
            return r9
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L31:
            defpackage.sf5.h0(r9)
            goto L41
        L35:
            defpackage.sf5.h0(r9)
            r0.G = r3
            java.lang.Object r9 = r5.b(r6, r7, r8, r0)
            if (r9 != r4) goto L41
            goto L4f
        L41:
            vg5 r9 = (defpackage.vg5) r9
            kp7 r5 = r9.getData()
            r0.G = r2
            java.lang.Object r5 = defpackage.j8.G(r5, r0)
            if (r5 != r4) goto L50
        L4f:
            return r4
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y68.c(android.content.Context, fw9, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, defpackage.fw9 r8, java.lang.String r9, defpackage.u73 r10, defpackage.vp4 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.x68
            if (r0 == 0) goto L13
            r0 = r11
            x68 r0 = (defpackage.x68) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            x68 r0 = new x68
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r11)
            return r11
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L31:
            u73 r10 = r0.E
            defpackage.sf5.h0(r11)
            goto L45
        L37:
            defpackage.sf5.h0(r11)
            r0.E = r10
            r0.H = r4
            java.lang.Object r11 = r6.b(r7, r8, r9, r0)
            if (r11 != r5) goto L45
            goto L51
        L45:
            vg5 r11 = (defpackage.vg5) r11
            r0.E = r2
            r0.H = r3
            java.lang.Object r6 = r11.a(r10, r0)
            if (r6 != r5) goto L52
        L51:
            return r5
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y68.d(android.content.Context, fw9, java.lang.String, u73, vp4):java.lang.Object");
    }
}
