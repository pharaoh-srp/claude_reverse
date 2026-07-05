package defpackage;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: loaded from: classes3.dex */
public final class bt4 implements cec, m95, bp1, h92 {
    public final /* synthetic */ ua2 E;

    public /* synthetic */ bt4(ua2 ua2Var) {
        this.E = ua2Var;
    }

    @Override // defpackage.m95
    public void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        ua2 ua2Var = this.E;
        if (ua2Var.s() instanceof q6c) {
            ua2Var.resumeWith(new hre(getCredentialException));
        }
    }

    @Override // defpackage.bp1
    public void d(hp1 hp1Var) {
        hp1Var.getClass();
        u88.a(this.E, Boolean.valueOf(hp1Var.a == 0));
    }

    @Override // defpackage.bp1
    public void g() {
        u88.a(this.E, Boolean.FALSE);
    }

    @Override // defpackage.h92
    public void k(u82 u82Var, oqe oqeVar) {
        this.E.resumeWith(oqeVar);
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        this.E.resumeWith(null);
    }

    @Override // defpackage.m95
    public void onResult(Object obj) {
        u38 u38Var = (u38) obj;
        u38Var.getClass();
        ua2 ua2Var = this.E;
        if (ua2Var.s() instanceof q6c) {
            ua2Var.resumeWith(u38Var);
        }
    }

    @Override // defpackage.h92
    public void q(u82 u82Var, Throwable th) {
        this.E.resumeWith(new hre(th));
    }
}
