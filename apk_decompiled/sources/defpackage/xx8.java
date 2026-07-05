package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xx8 extends xzg implements pz7 {
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public float J;
    public float K;
    public int L;
    public final /* synthetic */ List M;
    public final /* synthetic */ j9f N;
    public final /* synthetic */ cz5 O;
    public final /* synthetic */ zy7 P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ nwb R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx8(List list, j9f j9fVar, cz5 cz5Var, zy7 zy7Var, String str, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.M = list;
        this.N = j9fVar;
        this.O = cz5Var;
        this.P = zy7Var;
        this.Q = str;
        this.R = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new xx8(this.M, this.N, this.O, this.P, this.Q, this.R, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((xx8) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0181 A[RETURN] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
