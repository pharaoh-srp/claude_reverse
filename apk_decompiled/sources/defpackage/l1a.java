package defpackage;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class l1a extends fkg {
    public final tp4 J;

    public l1a(c45 c45Var, pz7 pz7Var) {
        super(c45Var, false);
        this.J = zni.p(this, this, pz7Var);
    }

    @Override // defpackage.vf9
    public final void i0() throws Throwable {
        try {
            a86.a(zni.I(this.J), iei.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).E;
            }
            resumeWith(sf5.u(th));
            throw th;
        }
    }
}
