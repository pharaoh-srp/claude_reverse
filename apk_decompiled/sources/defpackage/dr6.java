package defpackage;

import android.content.Context;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;

/* JADX INFO: loaded from: classes2.dex */
public final class dr6 extends xzg implements pz7 {
    public of0 E;
    public int F;
    public final /* synthetic */ jwf G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ b K;
    public final /* synthetic */ a L;
    public final /* synthetic */ zy7 M;
    public final /* synthetic */ nwb N;
    public final /* synthetic */ nwb O;
    public final /* synthetic */ nwb P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr6(jwf jwfVar, String str, boolean z, Context context, b bVar, a aVar, zy7 zy7Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = jwfVar;
        this.H = str;
        this.I = z;
        this.J = context;
        this.K = bVar;
        this.L = aVar;
        this.M = zy7Var;
        this.N = nwbVar;
        this.O = nwbVar2;
        this.P = nwbVar3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new dr6(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((dr6) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (r2.j(r20) == r10) goto L31;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
