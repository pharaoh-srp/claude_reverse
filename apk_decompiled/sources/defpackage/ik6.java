package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik6 {
    public final j8i a;
    public final l45 b;
    public fkg c;
    public int d;
    public boolean e;

    public ik6(j8i j8iVar, mp4 mp4Var) {
        mp4Var.getClass();
        this.a = j8iVar;
        this.b = mp4Var;
    }

    public final void a(dk6 dk6Var, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var) {
        fkg fkgVar = this.c;
        l45 l45Var = this.b;
        if (dk6Var != dk6.H) {
            if (fkgVar == null || !fkgVar.c()) {
                this.c = gb9.D(l45Var, null, null, new c53(this, bz7Var, zy7Var, zy7Var2, null), 3);
                return;
            } else {
                bz7Var.invoke(ek6.G);
                return;
            }
        }
        ek6 ek6Var = ek6.F;
        if (fkgVar != null && fkgVar.c()) {
            bz7Var.invoke(ek6Var);
            return;
        }
        j8i j8iVar = this.a;
        String strD = j8iVar.d();
        if (strD == null) {
            this.c = gb9.D(l45Var, null, null, new w14(this, bz7Var, zy7Var, zy7Var2, null, 21), 3);
        } else {
            if (strD.equals("already_attempted")) {
                bz7Var.invoke(ek6Var);
                return;
            }
            j8iVar.q(strD);
            j8iVar.g("biometric_skipped");
            bz7Var.invoke(ek6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gk6
            if (r0 == 0) goto L13
            r0 = r5
            gk6 r0 = (defpackage.gk6) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            gk6 r0 = new gk6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            j8i r4 = r4.a
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.sf5.h0(r5)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            java.lang.String r5 = r4.d()
            if (r5 != 0) goto L53
            r0.G = r2
            java.lang.Object r5 = r4.k(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L42
            return r0
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L4d:
            java.lang.String r5 = "biometric_failed"
            r4.g(r5)
            goto L63
        L53:
            java.lang.String r0 = "already_attempted"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L63
            r4.q(r5)
            java.lang.String r5 = "biometric_skipped"
            r4.g(r5)
        L63:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik6.b(vp4):java.lang.Object");
    }

    public final void c() {
        fkg fkgVar = this.c;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.c = null;
        this.d = 0;
        this.e = false;
    }

    public final Object d(vp4 vp4Var) {
        boolean z;
        j8i j8iVar = this.a;
        if (j8iVar.c.f() != null) {
            z = true;
        } else {
            if (!((Boolean) j8iVar.s.getValue()).booleanValue()) {
                return j8iVar.a("reactive", vp4Var);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x020d, code lost:
    
        if (r14 == r8) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        if (r14 == r8) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
    
        if (r14 == r8) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bz7 r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik6.e(bz7, vp4):java.lang.Object");
    }
}
