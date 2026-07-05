package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class p4g implements yzb {
    public final /* synthetic */ v4g E;
    public final /* synthetic */ eo7 F;

    public p4g(v4g v4gVar, fv1 fv1Var) {
        this.E = v4gVar;
        this.F = fv1Var;
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        q28 q28Var = this.E.d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
        ry ryVar = (ry) q28Var.F;
        float fE = ryVar.e(fIntBitsToFloat);
        float f = fE - ryVar.f();
        ryVar.n.a(fE, MTTypesetterKt.kLineSkipLimitMultiplier);
        return a(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(long r5, long r7, defpackage.tp4 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.n4g
            if (r0 == 0) goto L13
            r0 = r9
            n4g r0 = (defpackage.n4g) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            n4g r0 = new n4g
            vp4 r9 = (defpackage.vp4) r9
            r0.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            long r5 = r0.E
            defpackage.sf5.h0(r9)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r9)
            float r7 = defpackage.qsi.e(r7)
            r0.E = r5
            r0.H = r2
            v4g r8 = r4.E
            q28 r8 = r8.d
            eo7 r4 = r4.F
            java.lang.Object r9 = r8.h(r4, r7, r0)
            m45 r4 = defpackage.m45.E
            if (r9 != r4) goto L4a
            return r4
        L4a:
            java.lang.Number r9 = (java.lang.Number) r9
            float r4 = r9.floatValue()
            float r5 = defpackage.qsi.d(r5)
            long r4 = defpackage.lvj.e(r5, r4)
            qsi r6 = new qsi
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4g.G(long, long, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(long r7, defpackage.tp4 r9) {
        /*
            r6 = this;
            v4g r0 = r6.E
            q28 r0 = r0.d
            boolean r1 = r9 instanceof defpackage.o4g
            if (r1 == 0) goto L17
            r1 = r9
            o4g r1 = (defpackage.o4g) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.H = r2
            goto L1e
        L17:
            o4g r1 = new o4g
            vp4 r9 = (defpackage.vp4) r9
            r1.<init>(r6, r9)
        L1e:
            java.lang.Object r9 = r1.F
            int r2 = r1.H
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            long r7 = r1.E
            defpackage.sf5.h0(r9)
            goto L69
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L34:
            defpackage.sf5.h0(r9)
            float r9 = defpackage.qsi.e(r7)
            java.lang.Object r2 = r0.F
            ry r2 = (defpackage.ry) r2
            float r2 = r2.f()
            java.lang.Object r4 = r0.F
            ry r4 = (defpackage.ry) r4
            vq5 r4 = r4.c()
            float r4 = r4.e()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L67
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L67
            r1.E = r7
            r1.H = r3
            eo7 r6 = r6.F
            java.lang.Object r6 = r0.h(r6, r9, r1)
            m45 r9 = defpackage.m45.E
            if (r6 != r9) goto L69
            return r9
        L67:
            r7 = 0
        L69:
            qsi r6 = new qsi
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4g.O0(long, tp4):java.lang.Object");
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= MTTypesetterKt.kLineSkipLimitMultiplier || i != 1) {
            return 0L;
        }
        ry ryVar = (ry) this.E.d.F;
        float fE = ryVar.e(fIntBitsToFloat);
        float f = fE - ryVar.f();
        ryVar.n.a(fE, MTTypesetterKt.kLineSkipLimitMultiplier);
        return a(f);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier) << 32);
    }
}
