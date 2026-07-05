package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lkj extends gre implements pz7 {
    public Object F;
    public Serializable G;
    public z9e H;
    public Serializable I;
    public z9e J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ pkj M;
    public final /* synthetic */ bz7 N;
    public final /* synthetic */ nkj O;
    public final /* synthetic */ pkj P;
    public final /* synthetic */ r10 Q;
    public final /* synthetic */ o9d R;
    public final /* synthetic */ boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkj(pkj pkjVar, bz7 bz7Var, nkj nkjVar, pkj pkjVar2, r10 r10Var, o9d o9dVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.M = pkjVar;
        this.N = bz7Var;
        this.O = nkjVar;
        this.P = pkjVar2;
        this.Q = r10Var;
        this.R = o9dVar;
        this.S = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        lkj lkjVar = new lkj(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, tp4Var);
        lkjVar.L = obj;
        return lkjVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((lkj) create((d0h) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[PHI: r1 r2 r8 r11
      0x0114: PHI (r1v6 dae) = (r1v5 dae), (r1v22 dae) binds: [B:33:0x0111, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r2v13 java.lang.Object) = (r2v12 java.lang.Object), (r2v24 java.lang.Object) binds: [B:33:0x0111, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r8v4 boolean) = (r8v3 boolean), (r8v7 boolean) binds: [B:33:0x0111, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r11v3 d0h) = (r11v2 d0h), (r11v7 d0h) binds: [B:33:0x0111, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARN: Type inference failed for: r17v1, types: [tp4] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5, types: [c45, o45] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
