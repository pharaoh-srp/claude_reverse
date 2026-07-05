package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pag extends gre implements pz7 {
    public Object F;
    public Iterator G;
    public int H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Iterator N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pag(int i, int i2, Iterator it, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = i;
        this.M = i2;
        this.N = it;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        pag pagVar = new pag(this.L, this.M, this.N, tp4Var);
        pagVar.K = obj;
        return pagVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((pag) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143 A[SYNTHETIC] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
