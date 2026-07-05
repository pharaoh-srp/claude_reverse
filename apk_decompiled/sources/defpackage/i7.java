package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i7 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ i7(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r6, defpackage.tp4 r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.F
            x0a r0 = (defpackage.x0a) r0
            boolean r1 = r7 instanceof defpackage.g1j
            if (r1 == 0) goto L17
            r1 = r7
            g1j r1 = (defpackage.g1j) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.H = r2
            goto L1c
        L17:
            g1j r1 = new g1j
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.F
            int r7 = r1.H
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L32
            if (r7 != r3) goto L2c
            int r6 = r1.E
            defpackage.sf5.h0(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L49
            goto L78
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L32:
            defpackage.sf5.h0(r5)
            if (r6 <= 0) goto L78
            int r5 = r6 + (-1)
            r1.E = r6     // Catch: java.lang.IndexOutOfBoundsException -> L49
            r1.H = r3     // Catch: java.lang.IndexOutOfBoundsException -> L49
            y5f r7 = defpackage.x0a.y     // Catch: java.lang.IndexOutOfBoundsException -> L49
            r7 = 0
            java.lang.Object r5 = r0.f(r5, r7, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L49
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L78
            return r6
        L49:
            java.util.List r5 = defpackage.xah.a
            int r6 = r6 - r3
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            cpc r6 = new cpc
            java.lang.String r7 = "target"
            r6.<init>(r7, r5)
            p0a r5 = r0.h()
            int r5 = r5.n
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            cpc r5 = new cpc
            java.lang.String r0 = "total"
            r5.<init>(r0, r7)
            cpc[] r5 = new defpackage.cpc[]{r6, r5}
            java.util.Map r5 = defpackage.sta.h0(r5)
            r6 = 2
            java.lang.String r7 = "VoiceChatScreenMessageList auto-scroll IOOB"
            defpackage.xah.e(r6, r7, r2, r5)
        L78:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7.a(int, tp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Type inference failed for: r4v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.anthropic.claude.types.strings.ThinkingMode] */
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
    public final java.lang.Object g(java.lang.Object r13, defpackage.tp4 r14) {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7.g(java.lang.Object, tp4):java.lang.Object");
    }
}
