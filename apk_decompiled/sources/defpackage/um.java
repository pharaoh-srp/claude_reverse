package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class um implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ um(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0662  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(defpackage.tp4 r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.d(tp4, java.lang.Object):java.lang.Object");
    }

    private final Object h(tp4 tp4Var, Object obj) {
        v79 v79Var = (v79) obj;
        bae baeVar = (bae) this.F;
        if (v79Var instanceof odd) {
            baeVar.E++;
        } else if ((v79Var instanceof pdd) || (v79Var instanceof ndd)) {
            baeVar.E--;
        }
        boolean z = baeVar.E > 0;
        gph gphVar = (gph) this.G;
        if (gphVar.V != z) {
            gphVar.V = z;
            yfd.W(gphVar).T();
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, defpackage.tp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jlg
            if (r0 == 0) goto L13
            r0 = r6
            jlg r0 = (defpackage.jlg) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            jlg r0 = new jlg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.sf5.h0(r6)
            return r2
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r6)
            if (r5 <= 0) goto L4e
            java.lang.Object r5 = r4.F
            z9e r5 = (defpackage.z9e) r5
            boolean r6 = r5.E
            if (r6 != 0) goto L4e
            r5.E = r3
            java.lang.Object r4 = r4.G
            lp7 r4 = (defpackage.lp7) r4
            r0.G = r3
            t3g r5 = defpackage.t3g.E
            java.lang.Object r4 = r4.g(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4e
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.a(int, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.f81 r7, defpackage.tp4 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.G
            x0a r0 = (defpackage.x0a) r0
            boolean r1 = r8 instanceof defpackage.e34
            if (r1 == 0) goto L17
            r1 = r8
            e34 r1 = (defpackage.e34) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.G = r2
            goto L1c
        L17:
            e34 r1 = new e34
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.E
            int r2 = r1.G
            iei r3 = defpackage.iei.a
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            defpackage.sf5.h0(r8)     // Catch: java.util.concurrent.CancellationException -> L7c
            return r3
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L32:
            defpackage.sf5.h0(r8)
            java.lang.Object r6 = r6.F
            dae r6 = (defpackage.dae) r6
            java.lang.Object r8 = r6.E
            f81 r8 = (defpackage.f81) r8
            r6.E = r7
            if (r8 == 0) goto L83
            int r6 = r8.a
            if (r6 != 0) goto L46
            goto L83
        L46:
            int r2 = r7.a
            int r2 = r2 - r6
            java.lang.String r6 = r7.b
            java.lang.String r5 = r8.b
            boolean r6 = defpackage.x44.r(r6, r5)
            r5 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = r7.c
            java.lang.String r7 = r8.c
            boolean r6 = defpackage.x44.r(r6, r7)
            if (r6 == 0) goto L60
            r6 = r4
            goto L61
        L60:
            r6 = r5
        L61:
            if (r2 <= 0) goto L83
            if (r6 != 0) goto L83
            y50 r6 = r0.e
            java.lang.Object r6 = r6.b
            isc r6 = (defpackage.isc) r6
            int r6 = r6.h()
            if (r6 > r2) goto L83
            r1.G = r4     // Catch: java.util.concurrent.CancellationException -> L7c
            java.lang.Object r6 = r0.f(r5, r5, r1)     // Catch: java.util.concurrent.CancellationException -> L7c
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L83
            return r7
        L7c:
            c45 r6 = r1.getContext()
            defpackage.knk.u(r6)
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.b(f81, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(short[] r6, defpackage.tp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckb
            if (r0 == 0) goto L13
            r0 = r7
            ckb r0 = (defpackage.ckb) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ckb r0 = new ckb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            short[] r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L42
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L30:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r5.F
            lp7 r7 = (defpackage.lp7) r7
            r0.E = r6
            r0.H = r3
            java.lang.Object r7 = r7.g(r6, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            int r7 = r6.length
            r0 = 0
            r2 = 0
        L46:
            if (r2 >= r7) goto L50
            short r3 = r6[r2]
            double r3 = (double) r3
            double r3 = r3 * r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            goto L46
        L50:
            java.lang.Object r5 = r5.G
            dkb r5 = (defpackage.dkb) r5
            int r6 = r6.length
            double r6 = (double) r6
            double r0 = r0 / r6
            double r6 = java.lang.Math.sqrt(r0)
            float r6 = (float) r6
            r5.b = r6
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.c(short[], tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0225, code lost:
    
        if (r0.g(r2, r3) == r5) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Type inference failed for: r12v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, yk] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r3v33, types: [kdg] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r24, defpackage.tp4 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.g(java.lang.Object, tp4):java.lang.Object");
    }
}
