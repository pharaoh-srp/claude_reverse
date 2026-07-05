package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class rda extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ sda G;
    public final /* synthetic */ Uri H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rda(sda sdaVar, Uri uri, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = sdaVar;
        this.H = uri;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Uri uri = this.H;
        sda sdaVar = this.G;
        switch (i) {
            case 0:
                return new rda(sdaVar, uri, tp4Var, 0);
            case 1:
                return new rda(sdaVar, uri, tp4Var, 1);
            default:
                return new rda(sdaVar, uri, tp4Var, 2);
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
        return ((rda) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rda.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
