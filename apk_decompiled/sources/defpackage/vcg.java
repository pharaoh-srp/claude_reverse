package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vcg extends gre implements pz7 {
    public long[] F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ wcg K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcg(wcg wcgVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = wcgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        vcg vcgVar = new vcg(this.K, tp4Var);
        vcgVar.J = obj;
        return vcgVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((vcg) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            wcg r1 = r0.K
            long r2 = r1.E
            long r4 = r1.G
            long r6 = r1.F
            int r8 = r0.I
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            m45 r11 = defpackage.m45.E
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.G
            java.lang.Object r6 = r0.J
            zmf r6 = (defpackage.zmf) r6
            defpackage.sf5.h0(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r9
        L32:
            int r1 = r0.G
            java.lang.Object r8 = r0.J
            zmf r8 = (defpackage.zmf) r8
            defpackage.sf5.h0(r23)
            goto L93
        L3c:
            int r1 = r0.H
            int r8 = r0.G
            long[] r15 = r0.F
            java.lang.Object r13 = r0.J
            zmf r13 = (defpackage.zmf) r13
            defpackage.sf5.h0(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            defpackage.sf5.h0(r23)
            java.lang.Object r8 = r0.J
            r13 = r8
            zmf r13 = (defpackage.zmf) r13
            long[] r15 = r1.H
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.J = r13
            r0.F = r15
            r0.G = r8
            r0.H = r1
            r0.I = r10
            r13.d(r0, r4)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.J = r8
            r0.F = r9
            r0.G = r1
            r0.I = r14
            r8.d(r0, r2)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.J = r6
            r0.F = r9
            r0.G = r15
            r7 = 3
            r0.I = r7
            r6.d(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vcg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
