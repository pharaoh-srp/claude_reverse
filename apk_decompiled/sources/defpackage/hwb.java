package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hwb extends gre implements pz7 {
    public uvb F;
    public iwb G;
    public long[] H;
    public int I;
    public int J;
    public int K;
    public int L;
    public long M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ iwb P;
    public final /* synthetic */ uvb Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwb(iwb iwbVar, uvb uvbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.P = iwbVar;
        this.Q = uvbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        hwb hwbVar = new hwb(this.P, this.Q, tp4Var);
        hwbVar.O = obj;
        return hwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((hwb) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.N
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.L
            int r5 = r0.K
            long r6 = r0.M
            int r8 = r0.J
            int r9 = r0.I
            long[] r10 = r0.H
            iwb r11 = r0.G
            uvb r12 = r0.F
            java.lang.Object r13 = r0.O
            zmf r13 = (defpackage.zmf) r13
            defpackage.sf5.h0(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.sf5.h0(r21)
            java.lang.Object r1 = r0.O
            zmf r1 = (defpackage.zmf) r1
            iwb r5 = r0.P
            fwb r6 = r5.F
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            uvb r8 = r0.Q
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.F = r2
            fwb r3 = r11.F
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.O = r13
            r0.F = r12
            r0.G = r11
            r0.H = r10
            r0.I = r9
            r0.J = r8
            r0.M = r6
            r0.K = r5
            r0.L = r1
            r0.N = r4
            r13.d(r0, r2)
            m45 r0 = defpackage.m45.E
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
