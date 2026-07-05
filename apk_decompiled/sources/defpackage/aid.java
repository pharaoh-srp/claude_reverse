package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class aid extends d1 implements gh2, l45, mkf {
    public final zy1 J;

    public aid(c45 c45Var, zy1 zy1Var) {
        super(c45Var, true);
        this.J = zy1Var;
    }

    @Override // defpackage.d6e
    public final boolean a() {
        return this.J.a();
    }

    @Override // defpackage.mkf
    public final Object b(tp4 tp4Var, Object obj) {
        return this.J.b(tp4Var, obj);
    }

    @Override // defpackage.vf9, defpackage.lf9, defpackage.d6e
    public final void d(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(B(), null, this);
        }
        z(cancellationException);
    }

    @Override // defpackage.d6e
    public final dpf g() {
        return this.J.g();
    }

    @Override // defpackage.d6e
    public final sy1 iterator() {
        zy1 zy1Var = this.J;
        zy1Var.getClass();
        return new sy1(zy1Var);
    }

    @Override // defpackage.d6e
    public final dpf k() {
        return this.J.k();
    }

    @Override // defpackage.d6e
    public final Object l() {
        return this.J.l();
    }

    @Override // defpackage.mkf
    public final boolean m(Throwable th) {
        return this.J.i(th, false);
    }

    @Override // defpackage.d6e
    public final Object p(xzg xzgVar) {
        zy1 zy1Var = this.J;
        zy1Var.getClass();
        return zy1.J(zy1Var, xzgVar);
    }

    @Override // defpackage.mkf
    public final Object r(Object obj) {
        return this.J.r(obj);
    }

    @Override // defpackage.d6e
    public final Object s(xzg xzgVar) {
        zy1 zy1Var = this.J;
        zy1Var.getClass();
        return zy1.K(zy1Var, xzgVar);
    }

    @Override // defpackage.d1
    public final void u0(Throwable th, boolean z) {
        if (this.J.i(th, false) || z) {
            return;
        }
        dgj.G(this.I, th);
    }

    @Override // defpackage.d1
    public final void v0(Object obj) {
        this.J.m(null);
    }

    @Override // defpackage.vf9
    public final void z(CancellationException cancellationException) {
        this.J.i(cancellationException, true);
        y(cancellationException);
    }
}
