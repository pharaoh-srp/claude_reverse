package defpackage;

import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class w84 implements h92 {
    public final /* synthetic */ int E;
    public final y84 F;

    public /* synthetic */ w84(y84 y84Var, int i) {
        this.E = i;
        this.F = y84Var;
    }

    @Override // defpackage.h92
    public final void k(u82 u82Var, oqe oqeVar) {
        int i = this.E;
        y84 y84Var = this.F;
        switch (i) {
            case 0:
                if (!oqeVar.a.U) {
                    y84Var.completeExceptionally(new HttpException(oqeVar));
                } else {
                    y84Var.complete(oqeVar.b);
                }
                break;
            default:
                y84Var.complete(oqeVar);
                break;
        }
    }

    @Override // defpackage.h92
    public final void q(u82 u82Var, Throwable th) {
        int i = this.E;
        y84 y84Var = this.F;
        switch (i) {
            case 0:
                y84Var.completeExceptionally(th);
                break;
            default:
                y84Var.completeExceptionally(th);
                break;
        }
    }
}
