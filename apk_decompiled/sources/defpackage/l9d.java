package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l9d implements y4i, y1e {
    public final dd8 a;
    public final vh4 b;
    public final boolean c;
    public final qo0 d;
    public volatile boolean e;

    public l9d(dd8 dd8Var, vh4 vh4Var, boolean z) {
        dd8Var.getClass();
        this.a = dd8Var;
        this.b = vh4Var;
        this.c = z;
        this.d = new qo0();
    }

    @Override // defpackage.y4i
    public final Boolean a(tp4 tp4Var) {
        if (this.e) {
            u00.N(21, "Connection is recycled");
            throw null;
        }
        bh4 bh4Var = (bh4) tp4Var.getContext().x0(this.a);
        if (bh4Var != null && bh4Var.F == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.E.s0());
        }
        u00.N(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.bz7 r8, defpackage.vp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.k9d
            if (r0 == 0) goto L13
            r0 = r9
            k9d r0 = (defpackage.k9d) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            k9d r0 = new k9d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.H
            m45 r1 = defpackage.m45.E
            int r2 = r0.J
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            vh4 r7 = r0.G
            bz7 r8 = r0.F
            java.lang.String r0 = r0.E
            defpackage.sf5.h0(r9)
            r9 = r7
            r7 = r0
            goto L64
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L36:
            defpackage.sf5.h0(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8d
            c45 r9 = r0.getContext()
            dd8 r5 = r6.a
            a45 r9 = r9.x0(r5)
            bh4 r9 = (defpackage.bh4) r9
            if (r9 == 0) goto L87
            l9d r9 = r9.F
            if (r9 != r6) goto L87
            vh4 r9 = r6.b
            r0.E = r7
            r0.F = r8
            r0.G = r9
            r0.J = r3
            hxb r2 = r9.F
            java.lang.Object r0 = r2.c(r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            f9d r0 = new f9d     // Catch: java.lang.Throwable -> L7a
            vh4 r1 = r6.b     // Catch: java.lang.Throwable -> L7a
            tze r7 = r1.L0(r7)     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7c
            defpackage.csg.o(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r9.d(r4)
            return r6
        L7a:
            r6 = move-exception
            goto L83
        L7c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7e
        L7e:
            r7 = move-exception
            defpackage.csg.o(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r7     // Catch: java.lang.Throwable -> L7a
        L83:
            r9.d(r4)
            throw r6
        L87:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            defpackage.u00.N(r2, r6)
            throw r4
        L8d:
            java.lang.String r6 = "Connection is recycled"
            defpackage.u00.N(r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9d.b(java.lang.String, bz7, vp4):java.lang.Object");
    }

    @Override // defpackage.y1e
    public final lze c() {
        return this.b;
    }

    @Override // defpackage.y4i
    public final Object d(x4i x4iVar, pz7 pz7Var, tp4 tp4Var) {
        if (this.e) {
            u00.N(21, "Connection is recycled");
            throw null;
        }
        bh4 bh4Var = (bh4) tp4Var.getContext().x0(this.a);
        if (bh4Var != null && bh4Var.F == this) {
            return g(x4iVar, pz7Var, tp4Var);
        }
        u00.N(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.x4i r7, defpackage.vp4 r8) {
        /*
            r6 = this;
            qo0 r0 = r6.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.h9d
            if (r2 == 0) goto L17
            r2 = r8
            h9d r2 = (defpackage.h9d) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.I = r3
            goto L1c
        L17:
            h9d r2 = new h9d
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.G
            int r3 = r2.I
            r4 = 1
            vh4 r6 = r6.b
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            vh4 r7 = r2.F
            x4i r2 = r2.E
            defpackage.sf5.h0(r8)
            r8 = r7
            r7 = r2
            goto L4d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r5
        L38:
            defpackage.sf5.h0(r8)
            r2.E = r7
            r2.F = r6
            r2.I = r4
            hxb r8 = r6.F
            java.lang.Object r8 = r8.c(r2)
            m45 r2 = defpackage.m45.E
            if (r8 != r2) goto L4c
            return r2
        L4c:
            r8 = r6
        L4d:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L68
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L7c
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L76
            if (r7 == r4) goto L70
            r1 = 2
            if (r7 != r1) goto L6a
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.u00.r(r6, r7)     // Catch: java.lang.Throwable -> L68
            goto L90
        L68:
            r6 = move-exception
            goto L9e
        L6a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L68
            r6.<init>()     // Catch: java.lang.Throwable -> L68
            throw r6     // Catch: java.lang.Throwable -> L68
        L70:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.u00.r(r6, r7)     // Catch: java.lang.Throwable -> L68
            goto L90
        L76:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.u00.r(r6, r7)     // Catch: java.lang.Throwable -> L68
            goto L90
        L7c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r7.append(r2)     // Catch: java.lang.Throwable -> L68
            r1 = 39
            r7.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L68
            defpackage.u00.r(r6, r7)     // Catch: java.lang.Throwable -> L68
        L90:
            g9d r6 = new g9d     // Catch: java.lang.Throwable -> L68
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L68
            r0.addLast(r6)     // Catch: java.lang.Throwable -> L68
            iei r6 = defpackage.iei.a     // Catch: java.lang.Throwable -> L68
            r8.d(r5)
            return r6
        L9e:
            r8.d(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9d.e(x4i, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            qo0 r0 = r7.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof defpackage.i9d
            if (r3 == 0) goto L19
            r3 = r9
            i9d r3 = (defpackage.i9d) r3
            int r4 = r3.I
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.I = r4
            goto L1e
        L19:
            i9d r3 = new i9d
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.G
            int r4 = r3.I
            r5 = 1
            vh4 r7 = r7.b
            r6 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L32
            boolean r8 = r3.E
            vh4 r3 = r3.F
            defpackage.sf5.h0(r9)
            goto L4d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r6
        L38:
            defpackage.sf5.h0(r9)
            r3.F = r7
            r3.E = r8
            r3.I = r5
            hxb r9 = r7.F
            java.lang.Object r9 = r9.c(r3)
            m45 r3 = defpackage.m45.E
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r3 = r7
        L4d:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 != 0) goto La9
            java.lang.Object r9 = defpackage.b54.z0(r0)     // Catch: java.lang.Throwable -> L6c
            g9d r9 = (defpackage.g9d) r9     // Catch: java.lang.Throwable -> L6c
            r4 = 39
            if (r8 == 0) goto L83
            r9.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L6e
            java.lang.String r8 = "END TRANSACTION"
            defpackage.u00.r(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L6c:
            r7 = move-exception
            goto Lb1
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.u00.r(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L83:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L8f
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            defpackage.u00.r(r7, r8)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.u00.r(r7, r8)     // Catch: java.lang.Throwable -> L6c
        La3:
            iei r7 = defpackage.iei.a     // Catch: java.lang.Throwable -> L6c
            r3.d(r6)
            return r7
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "Not in a transaction"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        Lb1:
            r3.d(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9d.f(boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.x4i r11, defpackage.pz7 r12, defpackage.tp4 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.j9d
            if (r0 == 0) goto L13
            r0 = r13
            j9d r0 = (defpackage.j9d) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            j9d r0 = new j9d
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.H
            int r1 = r0.J
            r2 = 0
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            m45 r8 = defpackage.m45.E
            if (r1 == 0) goto L5c
            if (r1 == r7) goto L53
            if (r1 == r6) goto L4b
            if (r1 == r5) goto L45
            r10 = 4
            if (r1 == r10) goto L45
            if (r1 == r4) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r2
        L37:
            java.lang.Throwable r10 = r0.F
            java.lang.Object r11 = r0.E
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            defpackage.sf5.h0(r13)     // Catch: android.database.SQLException -> L42
            goto Laa
        L42:
            r12 = move-exception
            goto La5
        L45:
            java.lang.Object r10 = r0.E
            defpackage.sf5.h0(r13)
            return r10
        L4b:
            int r11 = r0.G
            defpackage.sf5.h0(r13)     // Catch: java.lang.Throwable -> L51
            goto L81
        L51:
            r11 = move-exception
            goto L90
        L53:
            java.lang.Object r11 = r0.E
            r12 = r11
            pz7 r12 = (defpackage.pz7) r12
            defpackage.sf5.h0(r13)
            goto L6e
        L5c:
            defpackage.sf5.h0(r13)
            if (r11 != 0) goto L63
            x4i r11 = defpackage.x4i.E
        L63:
            r0.E = r12
            r0.J = r7
            java.lang.Object r11 = r10.e(r11, r0)
            if (r11 != r8) goto L6e
            goto L9e
        L6e:
            guc r11 = new guc     // Catch: java.lang.Throwable -> L51
            r11.<init>(r7, r10)     // Catch: java.lang.Throwable -> L51
            r0.E = r2     // Catch: java.lang.Throwable -> L51
            r0.G = r7     // Catch: java.lang.Throwable -> L51
            r0.J = r6     // Catch: java.lang.Throwable -> L51
            java.lang.Object r13 = r12.invoke(r11, r0)     // Catch: java.lang.Throwable -> L51
            if (r13 != r8) goto L80
            goto L9e
        L80:
            r11 = r7
        L81:
            if (r11 == 0) goto L84
            r3 = r7
        L84:
            r0.E = r13
            r0.J = r5
            java.lang.Object r10 = r10.f(r3, r0)
            if (r10 != r8) goto L8f
            goto L9e
        L8f:
            return r13
        L90:
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r12 = move-exception
            r0.E = r11     // Catch: android.database.SQLException -> La1
            r0.F = r12     // Catch: android.database.SQLException -> La1
            r0.J = r4     // Catch: android.database.SQLException -> La1
            java.lang.Object r10 = r10.f(r3, r0)     // Catch: android.database.SQLException -> La1
            if (r10 != r8) goto L9f
        L9e:
            return r8
        L9f:
            r10 = r12
            goto Laa
        La1:
            r10 = move-exception
            r9 = r12
            r12 = r10
            r10 = r9
        La5:
            if (r11 == 0) goto Lab
            defpackage.mwa.p(r11, r12)
        Laa:
            throw r10
        Lab:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9d.g(x4i, pz7, tp4):java.lang.Object");
    }
}
