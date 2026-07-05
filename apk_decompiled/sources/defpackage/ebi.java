package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ebi extends dx5 {
    public final String F;

    public ebi(String str) {
        this.F = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void t0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebi.t0(int):void");
    }

    @Override // defpackage.dx5, defpackage.yr9
    /* JADX INFO: renamed from: j0 */
    public final yr9 m0(es9 es9Var) {
        if (es9Var != null) {
            return this;
        }
        t0(3);
        throw null;
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final /* bridge */ /* synthetic */ fhi l0(boolean z) {
        l0(z);
        throw null;
    }

    @Override // defpackage.dx5, defpackage.fhi
    public final fhi m0(es9 es9Var) {
        if (es9Var != null) {
            return this;
        }
        t0(3);
        throw null;
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final /* bridge */ /* synthetic */ fhi n0(r9i r9iVar) {
        n0(r9iVar);
        throw null;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        throw new IllegalStateException(this.F);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        if (r9iVar != null) {
            throw new IllegalStateException(this.F);
        }
        t0(0);
        throw null;
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        throw new IllegalStateException(this.F);
    }

    @Override // defpackage.dx5
    /* JADX INFO: renamed from: r0 */
    public final j7g j0(es9 es9Var) {
        if (es9Var != null) {
            return this;
        }
        t0(3);
        throw null;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        throw new IllegalStateException(this.F);
    }

    @Override // defpackage.j7g
    public final String toString() {
        return this.F;
    }
}
