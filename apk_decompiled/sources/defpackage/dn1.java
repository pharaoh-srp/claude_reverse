package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dn1 {
    public final tn1 a;

    public dn1(tn1 tn1Var) {
        this.a = tn1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0324, code lost:
    
        if (d(r3) == r4) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.anthropic.claude.bell.api.BellApiData r27, defpackage.vp4 r28) {
        /*
            Method dump skipped, instruction units count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.a(com.anthropic.claude.bell.api.BellApiData, vp4):java.lang.Object");
    }

    public final void b() {
        tn1 tn1Var = this.a;
        if (tn1Var.q().d) {
            return;
        }
        synchronized (tn1Var.H) {
            no1 no1VarQ = tn1Var.q();
            no1VarQ.getClass();
            tn1Var.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, false, false, 1019));
        }
        an1 an1Var = new an1(tn1Var, null);
        fkg fkgVar = tn1Var.X;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        tn1Var.X = gb9.D(tn1Var.e, null, null, an1Var, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Integer r20, defpackage.vp4 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof defpackage.bn1
            if (r2 == 0) goto L17
            r2 = r1
            bn1 r2 = (defpackage.bn1) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.I = r3
            goto L1c
        L17:
            bn1 r2 = new bn1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.G
            m45 r3 = defpackage.m45.E
            int r4 = r2.I
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L42
            if (r4 == r6) goto L39
            if (r4 != r5) goto L32
            tn1 r0 = r2.F
            java.lang.Integer r2 = r2.E
            defpackage.sf5.h0(r1)
            goto L9f
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L39:
            tn1 r0 = r2.F
            java.lang.Integer r4 = r2.E
            defpackage.sf5.h0(r1)
            r1 = r4
            goto L5e
        L42:
            defpackage.sf5.h0(r1)
            tn1 r0 = r0.a
            no1 r1 = r0.q()
            boolean r1 = r1.d
            if (r1 != 0) goto Lbd
            r1 = r20
            r2.E = r1
            r2.F = r0
            r2.I = r6
            java.lang.Object r4 = r0.d(r2)
            if (r4 != r3) goto L5e
            goto L9d
        L5e:
            r0.getClass()
            java.lang.Object r4 = r0.H
            monitor-enter(r4)
            no1 r7 = r0.q()     // Catch: java.lang.Throwable -> Lba
            r7.getClass()     // Catch: java.lang.Throwable -> Lba
            r17 = 0
            r18 = 1016(0x3f8, float:1.424E-42)
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            no1 r7 = defpackage.no1.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lba
            lsc r8 = r0.G     // Catch: java.lang.Throwable -> Lba
            r8.setValue(r7)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r4)
            dmc r4 = r0.v
            r4.a(r6)
            ki1 r4 = r0.r
            r2.E = r1
            r2.F = r0
            r2.I = r5
            m6b r4 = r4.m
            if (r4 == 0) goto L99
            java.lang.Object r2 = r4.d(r2)
            goto L9b
        L99:
            iei r2 = defpackage.iei.a
        L9b:
            if (r2 != r3) goto L9e
        L9d:
            return r3
        L9e:
            r2 = r1
        L9f:
            x51 r1 = r0.t
            r1.a()
            g5j r1 = r0.B
            if (r1 == 0) goto Lbd
            monitor-enter(r1)
            zy7 r0 = r1.f     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lb7
            r1.t = r0     // Catch: java.lang.Throwable -> Lb7
            r1.w = r2     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r1)
            goto Lbd
        Lb7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb7
            throw r0
        Lba:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lbd:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.c(java.lang.Integer, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof defpackage.cn1
            if (r2 == 0) goto L17
            r2 = r1
            cn1 r2 = (defpackage.cn1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.H = r3
            goto L1c
        L17:
            cn1 r2 = new cn1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.F
            m45 r3 = defpackage.m45.E
            int r4 = r2.H
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2e
            tn1 r0 = r2.E
            defpackage.sf5.h0(r1)
            goto L49
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r5
        L34:
            defpackage.sf5.h0(r1)
            tn1 r0 = r0.a
            com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome r1 = com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome.SPEAK_INTERRUPT
            r0.R(r1)
            r2.E = r0
            r2.H = r6
            java.lang.Object r1 = r0.u(r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            r0.getClass()
            java.lang.Object r1 = r0.H
            monitor-enter(r1)
            no1 r6 = r0.q()     // Catch: java.lang.Throwable -> L7d
            r6.getClass()     // Catch: java.lang.Throwable -> L7d
            r16 = 0
            r17 = 790(0x316, float:1.107E-42)
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            no1 r2 = defpackage.no1.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7d
            lsc r3 = r0.G     // Catch: java.lang.Throwable -> L7d
            r3.setValue(r2)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r1)
            go1 r1 = r0.x
            r1.c()
            g5j r0 = r0.B
            if (r0 == 0) goto L7c
            r0.b()
            iei r0 = defpackage.iei.a
            return r0
        L7c:
            return r5
        L7d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.d(vp4):java.lang.Object");
    }
}
