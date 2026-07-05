package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qaf extends xzg implements pz7 {
    public long E;
    public int F;
    public /* synthetic */ long G;
    public final /* synthetic */ raf H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaf(raf rafVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = rafVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        qaf qafVar = new qaf(this.H, tp4Var);
        qafVar.G = ((qsi) obj).a;
        return qafVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j = ((qsi) obj).a;
        qaf qafVar = new qaf(this.H, (tp4) obj2);
        qafVar.G = j;
        return qafVar.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.F
            r1 = 3
            r2 = 2
            r3 = 1
            raf r4 = r14.H
            m45 r5 = defpackage.m45.E
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.E
            long r2 = r14.G
            defpackage.sf5.h0(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r14)
            r14 = 0
            return r14
        L20:
            long r2 = r14.E
            long r6 = r14.G
            defpackage.sf5.h0(r15)
            goto L56
        L28:
            long r6 = r14.G
            defpackage.sf5.h0(r15)
            goto L40
        L2e:
            defpackage.sf5.h0(r15)
            long r6 = r14.G
            b0c r15 = r4.f
            r14.G = r6
            r14.F = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            qsi r15 = (defpackage.qsi) r15
            long r8 = r15.a
            long r8 = defpackage.qsi.f(r6, r8)
            r14.G = r6
            r14.E = r8
            r14.F = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            qsi r15 = (defpackage.qsi) r15
            long r11 = r15.a
            b0c r8 = r4.f
            long r9 = defpackage.qsi.f(r2, r11)
            r14.G = r6
            r14.E = r11
            r14.F = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            qsi r15 = (defpackage.qsi) r15
            long r14 = r15.a
            long r14 = defpackage.qsi.f(r0, r14)
            long r14 = defpackage.qsi.f(r2, r14)
            qsi r0 = new qsi
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
