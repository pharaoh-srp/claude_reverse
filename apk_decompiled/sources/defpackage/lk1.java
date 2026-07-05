package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class lk1 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(f fVar, boolean z, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = fVar;
        this.G = z;
        this.H = z2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new lk1(this.G, this.H, (nwb) this.I, tp4Var);
            default:
                return new lk1((f) this.I, this.G, this.H, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((lk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.E
            iei r1 = defpackage.iei.a
            boolean r2 = r9.H
            boolean r3 = r9.G
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            m45 r6 = defpackage.m45.E
            r7 = 1
            java.lang.Object r8 = r9.I
            switch(r0) {
                case 0: goto L4c;
                default: goto L13;
            }
        L13:
            com.anthropic.claude.conway.f r8 = (com.anthropic.claude.conway.f) r8
            int r0 = r9.F
            if (r0 == 0) goto L24
            if (r0 != r7) goto L1f
            defpackage.sf5.h0(r10)
            goto L35
        L1f:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L4b
        L24:
            defpackage.sf5.h0(r10)
            fkg r10 = r8.M0
            if (r10 == 0) goto L37
            r9.F = r7
            java.lang.Object r10 = defpackage.knk.p(r10, r9)
            if (r10 != r6) goto L35
            r1 = r6
            goto L4b
        L35:
            iei r10 = (defpackage.iei) r10
        L37:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.h1
            r10 = 0
            r9.set(r10)
            bj0 r9 = r8.m
            boolean r9 = r9.b()
            if (r9 == 0) goto L49
            com.anthropic.claude.conway.f.k0(r8, r3, r2, r7)
            goto L4b
        L49:
            r8.i1 = r7
        L4b:
            return r1
        L4c:
            nwb r8 = (defpackage.nwb) r8
            int r0 = r9.F
            if (r0 == 0) goto L5d
            if (r0 != r7) goto L58
            defpackage.sf5.h0(r10)
            goto L77
        L58:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L7c
        L5d:
            defpackage.sf5.h0(r10)
            if (r3 == 0) goto L63
            goto L7c
        L63:
            if (r2 == 0) goto L6b
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            goto L7c
        L6b:
            r9.F = r7
            r2 = 400(0x190, double:1.976E-321)
            java.lang.Object r9 = defpackage.d4c.K(r2, r9)
            if (r9 != r6) goto L77
            r1 = r6
            goto L7c
        L77:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.setValue(r9)
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(boolean z, boolean z2, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = z;
        this.H = z2;
        this.I = nwbVar;
    }
}
