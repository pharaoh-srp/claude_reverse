package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj extends xzg implements pz7 {
    public hj E;
    public int F;
    public int G;
    public final /* synthetic */ hj H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(hj hjVar, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = hjVar;
        this.I = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new dj(this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((dj) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r6) goto L21;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            hj r0 = r7.H
            amg r1 = r0.g
            int r2 = r7.G
            r3 = 2
            iei r4 = defpackage.iei.a
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 != r3) goto L1c
            int r0 = r7.F
            hj r7 = r7.E
            defpackage.sf5.h0(r8)
            r2 = r0
            r0 = r7
            goto L5c
        L1c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L23:
            defpackage.sf5.h0(r8)
            goto L35
        L27:
            defpackage.sf5.h0(r8)
            g78 r8 = r0.c
            r7.G = r5
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r6) goto L35
            goto L5b
        L35:
            java.lang.Object r8 = r1.getValue()
            yi r8 = (defpackage.yi) r8
            int r8 = r8.a
            int r2 = r7.I
            if (r8 == r2) goto L42
            goto L4e
        L42:
            java.lang.Object r8 = r1.getValue()
            yi r8 = (defpackage.yi) r8
            jj r8 = r8.b
            jj r1 = defpackage.jj.E
            if (r8 == r1) goto L4f
        L4e:
            return r4
        L4f:
            r7.E = r0
            r7.F = r2
            r7.G = r3
            java.lang.Enum r8 = defpackage.hj.a(r0, r5, r7)
            if (r8 != r6) goto L5c
        L5b:
            return r6
        L5c:
            jj r8 = (defpackage.jj) r8
            r0.g(r2, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
