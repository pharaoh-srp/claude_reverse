package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zi2 extends xzg implements pz7 {
    public AtomicReference E;
    public gh2 F;
    public dqh G;
    public lf9 H;
    public xi2 I;
    public im2 J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public /* synthetic */ Object P;
    public final /* synthetic */ eqh Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ lp7 S;
    public final /* synthetic */ gq7 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi2(eqh eqhVar, long j, lp7 lp7Var, gq7 gq7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.Q = eqhVar;
        this.R = j;
        this.S = lp7Var;
        this.T = gq7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        zi2 zi2Var = new zi2(this.Q, this.R, this.S, this.T, tp4Var);
        zi2Var.P = obj;
        return zi2Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((zi2) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:85:0x02a3, B:83:0x028c], limit reached: 186 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[LOOP:0: B:16:0x00c1->B:26:0x0106, LOOP_START, PHI: r3 r9 r10 r11
      0x00c1: PHI (r3v6 long) = (r3v5 long), (r3v27 long) binds: [B:15:0x00bf, B:26:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r9v3 java.util.concurrent.CancellationException) = (r9v2 java.util.concurrent.CancellationException), (r9v37 java.util.concurrent.CancellationException) binds: [B:15:0x00bf, B:26:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v4 m45) = (r10v3 m45), (r10v41 m45) binds: [B:15:0x00bf, B:26:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r11v4 int) = (r11v3 int), (r11v49 int) binds: [B:15:0x00bf, B:26:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x04c1 -> B:8:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
