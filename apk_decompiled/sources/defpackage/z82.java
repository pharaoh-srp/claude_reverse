package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z82 {
    public final t82 a;

    public /* synthetic */ z82(t82 t82Var) {
        this.a = t82Var;
    }

    public static final /* synthetic */ z82 a(t82 t82Var) {
        return new z82(t82Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.t82 r8, defpackage.j1c r9, defpackage.pz7 r10, defpackage.vp4 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.y82
            if (r0 == 0) goto L13
            r0 = r11
            y82 r0 = (defpackage.y82) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            y82 r0 = new y82
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.G
            int r1 = r0.H
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L42
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L36
            java.lang.Object r8 = r0.F
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L33
            goto La6
        L33:
            r9 = move-exception
            goto Lae
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L3c:
            pz7 r8 = r0.E
            defpackage.sf5.h0(r11)
            goto L8e
        L42:
            java.lang.Object r8 = r0.F
            t82 r8 = (defpackage.t82) r8
            pz7 r10 = r0.E
            defpackage.sf5.h0(r11)
            goto L5c
        L4c:
            defpackage.sf5.h0(r11)
            r0.E = r10
            r0.F = r8
            r0.H = r4
            kie r11 = defpackage.svj.d(r9, r0)
            if (r11 != r6) goto L5c
            goto La4
        L5c:
            kie r11 = (defpackage.kie) r11
            v82 r8 = r8.a(r11)
            r0.E = r10
            r0.F = r5
            r0.H = r3
            ua2 r9 = new ua2
            tp4 r11 = defpackage.zni.I(r0)
            r9.<init>(r4, r11)
            r9.t()
            cv r11 = new cv
            r11.<init>(r3, r8)
            r9.w(r11)
            z22 r11 = new z22
            r11.<init>(r9, r4)
            f4e r8 = (defpackage.f4e) r8
            r8.d(r11)
            java.lang.Object r11 = r9.r()
            if (r11 != r6) goto L8d
            goto La4
        L8d:
            r8 = r10
        L8e:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            pqe r10 = (defpackage.pqe) r10     // Catch: java.lang.Throwable -> Laa
            m1c r10 = defpackage.svj.c(r10)     // Catch: java.lang.Throwable -> Laa
            r0.E = r5     // Catch: java.lang.Throwable -> Laa
            r0.F = r9     // Catch: java.lang.Throwable -> Laa
            r0.H = r2     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Laa
            if (r11 != r6) goto La5
        La4:
            return r6
        La5:
            r8 = r9
        La6:
            defpackage.wd6.Z(r8, r5)
            return r11
        Laa:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lae:
            throw r9     // Catch: java.lang.Throwable -> Laf
        Laf:
            r10 = move-exception
            defpackage.wd6.Z(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.b(t82, j1c, pz7, vp4):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z82) {
            return x44.r(this.a, ((z82) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
