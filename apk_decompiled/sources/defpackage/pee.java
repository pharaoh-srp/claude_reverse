package defpackage;

import androidx.compose.runtime.e;

/* JADX INFO: loaded from: classes2.dex */
public final class pee extends e1 implements f45 {
    public final /* synthetic */ je4 F;
    public final /* synthetic */ e G;

    /* JADX WARN: Illegal instructions before constructor call */
    public pee(je4 je4Var, e eVar) {
        zp3 zp3Var = zp3.G;
        this.F = je4Var;
        this.G = eVar;
        super(zp3Var);
    }

    @Override // defpackage.f45
    public final void x(c45 c45Var, Throwable th) throws Throwable {
        je4 je4Var = this.F;
        e eVar = this.G;
        kpk.j(th, new d44(je4Var, 2, eVar));
        c45 c45Var2 = eVar.F;
        zp3 zp3Var = zp3.G;
        f45 f45Var = (f45) c45Var2.x0(zp3Var);
        if (f45Var != null) {
            f45Var.x(c45Var, th);
            return;
        }
        f45 f45Var2 = (f45) eVar.E.x0(zp3Var);
        if (f45Var2 == null) {
            throw th;
        }
        f45Var2.x(c45Var, th);
    }
}
