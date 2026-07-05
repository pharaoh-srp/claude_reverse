package androidx.compose.runtime;

import defpackage.a45;
import defpackage.b45;
import defpackage.c45;
import defpackage.d44;
import defpackage.f45;
import defpackage.fd9;
import defpackage.fkg;
import defpackage.gb9;
import defpackage.gjk;
import defpackage.je4;
import defpackage.kpk;
import defpackage.mee;
import defpackage.mp4;
import defpackage.nai;
import defpackage.pz7;
import defpackage.zp3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements mee, f45 {
    public final c45 E;
    public final pz7 F;
    public final mp4 G;
    public fkg H;

    public c(c45 c45Var, pz7 pz7Var) {
        this.E = c45Var;
        this.F = pz7Var;
        this.G = fd9.c(c45Var.r0(this));
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    @Override // defpackage.mee
    public final void a() {
        fkg fkgVar = this.H;
        if (fkgVar != null) {
            fkgVar.z(new LeftCompositionCancellationException());
        }
        this.H = null;
    }

    @Override // defpackage.mee
    public final void b() {
        fkg fkgVar = this.H;
        if (fkgVar != null) {
            fkgVar.z(new LeftCompositionCancellationException());
        }
        this.H = null;
    }

    @Override // defpackage.mee
    public final void g() {
        fkg fkgVar = this.H;
        if (fkgVar != null) {
            fkgVar.d(gjk.b("Old job was still running!", null));
        }
        this.H = gb9.D(this.G, null, null, this.F, 3);
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return zp3.G;
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.f45
    public final void x(c45 c45Var, Throwable th) throws Throwable {
        je4 je4Var = (je4) c45Var.x0(je4.F);
        if (je4Var != null) {
            kpk.j(th, new d44(je4Var, 2, this));
        }
        f45 f45Var = (f45) this.E.x0(zp3.G);
        if (f45Var == null) {
            throw th;
        }
        f45Var.x(c45Var, th);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
