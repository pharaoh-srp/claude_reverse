package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class j24 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ i G;
    public final /* synthetic */ String H;
    public final /* synthetic */ n58 I;
    public final /* synthetic */ b68 J;
    public final /* synthetic */ boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j24(i iVar, String str, n58 n58Var, b68 b68Var, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = iVar;
        this.H = str;
        this.I = n58Var;
        this.J = b68Var;
        this.K = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new j24(this.K, this.G, this.H, this.I, this.J, tp4Var);
            default:
                return new j24(this.G, this.H, this.I, this.J, this.K, tp4Var);
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
        return ((j24) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r15 == r7) goto L42;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j24.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j24(boolean z, i iVar, String str, n58 n58Var, b68 b68Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = z;
        this.G = iVar;
        this.H = str;
        this.I = n58Var;
        this.J = b68Var;
    }
}
