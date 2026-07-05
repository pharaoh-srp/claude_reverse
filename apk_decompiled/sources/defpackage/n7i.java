package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n7i extends xzg implements pz7 {
    public hbc[] E;
    public o7i F;
    public y4i G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ hbc[] L;
    public final /* synthetic */ o7i M;
    public final /* synthetic */ y4i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7i(hbc[] hbcVarArr, o7i o7iVar, y4i y4iVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = hbcVarArr;
        this.M = o7iVar;
        this.N = y4iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new n7i(this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n7i) create((guc) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (defpackage.o7i.c(r7, r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.K
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.J
            int r4 = r11.I
            int r5 = r11.H
            y4i r6 = r11.G
            o7i r7 = r11.F
            hbc[] r8 = r11.E
            defpackage.sf5.h0(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r1
        L21:
            defpackage.sf5.h0(r12)
            hbc[] r12 = r11.L
            int r0 = r12.length
            r4 = 0
            o7i r5 = r11.M
            y4i r6 = r11.N
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            m45 r10 = defpackage.m45.E
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.E = r8
            r11.F = r7
            r11.G = r6
            r11.H = r9
            r11.I = r4
            r11.J = r0
            r11.K = r2
            java.lang.Object r12 = defpackage.o7i.d(r7, r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.mr9.b()
            return r1
        L5d:
            r11.E = r8
            r11.F = r7
            r11.G = r6
            r11.H = r9
            r11.I = r4
            r11.J = r0
            r11.K = r3
            java.lang.Object r12 = defpackage.o7i.c(r7, r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            iei r11 = defpackage.iei.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
