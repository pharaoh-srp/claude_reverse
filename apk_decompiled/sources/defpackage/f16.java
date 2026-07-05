package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f16 {
    public static final Set b = sf5.f0(pr9.CLASS);
    public static final Set c = mp0.Z0(new pr9[]{pr9.FILE_FACADE, pr9.MULTIFILE_CLASS_PART});
    public static final jk9 d;
    public static final jk9 e;
    public r06 a;

    static {
        new jk9(new int[]{1, 1, 2}, false);
        d = new jk9(new int[]{1, 1, 11}, false);
        e = new jk9(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n16 a(defpackage.wmc r13, defpackage.bce r14) {
        /*
            r12 = this;
            java.lang.String r1 = "Could not read data from "
            r14.getClass()
            z81 r0 = r14.b
            java.lang.Object r2 = r0.e
            r7 = r2
            jk9 r7 = (defpackage.jk9) r7
            java.io.Serializable r2 = r0.f
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto L16
            java.io.Serializable r2 = r0.g
            java.lang.String[] r2 = (java.lang.String[]) r2
        L16:
            r3 = 0
            if (r2 == 0) goto L26
            java.lang.Object r4 = r0.d
            pr9 r4 = (defpackage.pr9) r4
            java.util.Set r5 = defpackage.f16.c
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L26
            goto L27
        L26:
            r2 = r3
        L27:
            if (r2 != 0) goto L2a
            goto L5d
        L2a:
            java.io.Serializable r0 = r0.h
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L31
            goto L5d
        L31:
            cpc r0 = defpackage.fl9.h(r2, r0)     // Catch: java.lang.Throwable -> L36 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L38
            goto L5b
        L36:
            r0 = move-exception
            goto L47
        L38:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r14.a()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L47:
            r06 r1 = r12.c()
            vz8 r1 = r1.c
            r1.getClass()
            jk9 r1 = r12.e()
            boolean r1 = r7.b(r1)
            if (r1 != 0) goto L9a
            r0 = r3
        L5b:
            if (r0 != 0) goto L5e
        L5d:
            return r3
        L5e:
            java.lang.Object r1 = r0.E
            r6 = r1
            kk9 r6 = (defpackage.kk9) r6
            java.lang.Object r0 = r0.F
            r5 = r0
            ysd r5 = (defpackage.ysd) r5
            lk9 r8 = new lk9
            r12.d(r14)
            r12.f(r14)
            int r0 = r12.b(r14)
            r8.<init>(r14, r5, r6, r0)
            n16 r3 = new n16
            r06 r9 = r12.c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "scope for "
            r12.<init>(r14)
            r12.append(r8)
            java.lang.String r14 = " in "
            r12.append(r14)
            r12.append(r13)
            java.lang.String r10 = r12.toString()
            yf5 r11 = defpackage.yf5.i0
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L9a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f16.a(wmc, bce):n16");
    }

    public final int b(bce bceVar) {
        c().c.getClass();
        int i = bceVar.b.c;
        if ((i & 64) == 0 || (i & 32) != 0) {
            return ((i & 16) == 0 || (i & 32) != 0) ? 1 : 3;
        }
        return 2;
    }

    public final r06 c() {
        r06 r06Var = this.a;
        if (r06Var != null) {
            return r06Var;
        }
        x44.o0("components");
        throw null;
    }

    public final i09 d(bce bceVar) {
        c().c.getClass();
        z81 z81Var = bceVar.b;
        jk9 jk9Var = (jk9) z81Var.e;
        if (((jk9) z81Var.e).b(e())) {
            return null;
        }
        jk9 jk9Var2 = jk9.g;
        jk9 jk9VarE = e();
        jk9 jk9VarE2 = e();
        boolean z = jk9Var.f;
        jk9VarE2.getClass();
        jk9 jk9Var3 = z ? jk9Var2 : jk9.h;
        int i = jk9Var3.b;
        int i2 = jk9VarE2.b;
        return new i09(jk9Var, jk9Var2, jk9VarE, (i <= i2 && (i < i2 || jk9Var3.c <= jk9VarE2.c)) ? jk9VarE2 : jk9Var3, bceVar.a(), yae.a(bceVar.a));
    }

    public final jk9 e() {
        c().c.getClass();
        return jk9.g;
    }

    public final boolean f(bce bceVar) {
        c().c.getClass();
        c().c.getClass();
        z81 z81Var = bceVar.b;
        return (z81Var.c & 2) != 0 && ((jk9) z81Var.e).equals(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ug3 g(defpackage.bce r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Could not read data from "
            z81 r1 = r8.b
            java.lang.Object r2 = r1.e
            jk9 r2 = (defpackage.jk9) r2
            java.io.Serializable r3 = r1.f
            java.lang.String[] r3 = (java.lang.String[]) r3
            if (r3 != 0) goto L12
            java.io.Serializable r3 = r1.g
            java.lang.String[] r3 = (java.lang.String[]) r3
        L12:
            r4 = 0
            if (r3 == 0) goto L22
            java.lang.Object r5 = r1.d
            pr9 r5 = (defpackage.pr9) r5
            java.util.Set r6 = defpackage.f16.b
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L22
            goto L23
        L22:
            r3 = r4
        L23:
            if (r3 != 0) goto L26
            goto L59
        L26:
            java.io.Serializable r1 = r1.h
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            goto L59
        L2d:
            cpc r0 = defpackage.fl9.f(r3, r1)     // Catch: java.lang.Throwable -> L32 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L34
            goto L57
        L32:
            r0 = move-exception
            goto L43
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r8.a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.concat(r5)     // Catch: java.lang.Throwable -> L32
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L32
        L43:
            r06 r1 = r7.c()
            vz8 r1 = r1.c
            r1.getClass()
            jk9 r1 = r7.e()
            boolean r1 = r2.b(r1)
            if (r1 != 0) goto L77
            r0 = r4
        L57:
            if (r0 != 0) goto L5a
        L59:
            return r4
        L5a:
            java.lang.Object r1 = r0.E
            kk9 r1 = (defpackage.kk9) r1
            java.lang.Object r0 = r0.F
            esd r0 = (defpackage.esd) r0
            vr9 r3 = new vr9
            r7.d(r8)
            r7.f(r8)
            int r7 = r7.b(r8)
            r3.<init>(r8, r7)
            ug3 r7 = new ug3
            r7.<init>(r1, r0, r2, r3)
            return r7
        L77:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f16.g(bce):ug3");
    }
}
