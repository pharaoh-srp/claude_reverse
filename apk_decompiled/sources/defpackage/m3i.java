package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m3i implements qog {
    public final k99 E;
    public final t4c F;
    public sij G = new w4c();
    public final AtomicBoolean H = new AtomicBoolean(false);
    public final String I = "tracing";
    public final u0h J = new u0h(new x7f(5, this));
    public final ug7 K = ug7.e;

    public m3i(k99 k99Var, t4c t4cVar) {
        this.E = k99Var;
        this.F = t4cVar;
    }

    @Override // defpackage.if7
    public final void b() {
        this.H.set(false);
    }

    @Override // defpackage.qog
    public final ug7 c() {
        return this.K;
    }

    @Override // defpackage.if7
    public final String getName() {
        return this.I;
    }

    @Override // defpackage.qog
    public final kje h() {
        return (kje) this.J.getValue();
    }

    @Override // defpackage.if7
    public final void j(Context context) {
        context.getClass();
        k99 k99Var = this.E;
        h99 h99VarT = k99Var.t();
        this.G = new j35(k99Var, new zp3(16), new t4c(this.F, h99VarT), new cbf(h99VarT, 8), h99VarT);
        this.H.set(true);
    }
}
