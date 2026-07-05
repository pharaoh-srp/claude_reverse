package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends m4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gfa gfaVar) {
        super(gfaVar);
        if (gfaVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void l(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0.l(int):void");
    }

    @Override // defpackage.u9i
    public final or9 f() {
        or9 or9VarE = o06.e(a());
        if (or9VarE != null) {
            return or9VarE;
        }
        l(1);
        throw null;
    }

    @Override // defpackage.m4
    public final yr9 g() {
        qqb qqbVarA = a();
        if (qqbVarA == null) {
            or9.a(107);
            throw null;
        }
        sxb sxbVar = or9.e;
        if (or9.b(qqbVarA, okg.a) || or9.b(qqbVarA, okg.b)) {
            return null;
        }
        return f().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[RETURN] */
    @Override // defpackage.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(defpackage.xh3 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qqb
            r1 = 0
            if (r0 == 0) goto L71
            qqb r4 = r4.a()
            r4.getClass()
            sxb r0 = r4.getName()
            sxb r2 = r5.getName()
            boolean r0 = defpackage.x44.r(r0, r2)
            r2 = 1
            if (r0 != 0) goto L1d
        L1b:
            r4 = r1
            goto L6e
        L1d:
            bo5 r4 = r4.h()
            bo5 r5 = r5.h()
        L25:
            if (r4 == 0) goto L4f
            if (r5 == 0) goto L4f
            boolean r0 = r4 instanceof defpackage.tqb
            if (r0 == 0) goto L30
            boolean r4 = r5 instanceof defpackage.tqb
            goto L6e
        L30:
            boolean r0 = r5 instanceof defpackage.tqb
            if (r0 == 0) goto L35
            goto L1b
        L35:
            boolean r0 = r4 instanceof defpackage.wmc
            if (r0 == 0) goto L51
            boolean r0 = r5 instanceof defpackage.wmc
            if (r0 == 0) goto L1b
            wmc r4 = (defpackage.wmc) r4
            xmc r4 = (defpackage.xmc) r4
            ww7 r4 = r4.I
            wmc r5 = (defpackage.wmc) r5
            xmc r5 = (defpackage.xmc) r5
            ww7 r5 = r5.I
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 == 0) goto L1b
        L4f:
            r4 = r2
            goto L6e
        L51:
            boolean r0 = r5 instanceof defpackage.wmc
            if (r0 == 0) goto L56
            goto L1b
        L56:
            sxb r0 = r4.getName()
            sxb r3 = r5.getName()
            boolean r0 = defpackage.x44.r(r0, r3)
            if (r0 != 0) goto L65
            goto L1b
        L65:
            bo5 r4 = r4.h()
            bo5 r5 = r5.h()
            goto L25
        L6e:
            if (r4 == 0) goto L71
            return r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j0.j(xh3):boolean");
    }

    @Override // defpackage.u9i
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract qqb a();
}
