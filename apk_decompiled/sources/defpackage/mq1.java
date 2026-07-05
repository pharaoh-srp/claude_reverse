package defpackage;

import java.security.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class mq1 extends x41 {
    public final /* synthetic */ nwb e;
    public final /* synthetic */ jwc f;

    public mq1(nwb nwbVar, jwc jwcVar) {
        this.e = nwbVar;
        this.f = jwcVar;
    }

    @Override // defpackage.x41
    public final void p(int i, CharSequence charSequence) {
        charSequence.getClass();
        ((bz7) this.e.getValue()).invoke((i == 10 || i == 13) ? v5e.a : new w5e(i, charSequence));
    }

    @Override // defpackage.x41
    public final void q(lq1 lq1Var) {
        Signature signature;
        Object hreVar;
        lq1Var.getClass();
        c61 c61Var = lq1Var.a;
        nwb nwbVar = this.e;
        if (c61Var == null || (signature = (Signature) c61Var.F) == null) {
            ((bz7) nwbVar.getValue()).invoke(new w5e(Integer.MIN_VALUE, "CryptoObject missing"));
            return;
        }
        try {
            signature.update(this.f.b);
            hreVar = signature.sign();
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA == null) {
            byte[] bArr = (byte[]) hreVar;
            bz7 bz7Var = (bz7) nwbVar.getValue();
            bArr.getClass();
            bz7Var.invoke(new x5e(bArr));
            return;
        }
        bz7 bz7Var2 = (bz7) nwbVar.getValue();
        String message = thA.getMessage();
        if (message == null) {
            message = "sign() failed";
        }
        bz7Var2.invoke(new w5e(Integer.MIN_VALUE, message));
    }
}
