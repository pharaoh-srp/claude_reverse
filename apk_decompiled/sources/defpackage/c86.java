package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c86 extends b5h {
    public int G;

    public c86(int i) {
        super(0L, false);
        this.G = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract tp4 c();

    public Throwable d(Object obj) {
        e94 e94Var = obj instanceof e94 ? (e94) obj : null;
        if (e94Var != null) {
            return e94Var.a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th) {
        dgj.G(c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            tp4 tp4VarC = c();
            tp4VarC.getClass();
            z76 z76Var = (z76) tp4VarC;
            vp4 vp4Var = z76Var.I;
            Object obj = z76Var.K;
            c45 context = vp4Var.getContext();
            Object objC = qnh.c(context, obj);
            lf9 lf9Var = null;
            ydi ydiVarD0 = objC != qnh.a ? zni.d0(vp4Var, context, objC) : null;
            try {
                c45 context2 = vp4Var.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null) {
                    int i = this.G;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        lf9Var = (lf9) context2.x0(dd8.J);
                    }
                }
                if (lf9Var != null && !lf9Var.c()) {
                    CancellationException cancellationExceptionH = lf9Var.H();
                    b(cancellationExceptionH);
                    vp4Var.resumeWith(sf5.u(cancellationExceptionH));
                } else if (thD != null) {
                    vp4Var.resumeWith(new hre(thD));
                } else {
                    vp4Var.resumeWith(e(objG));
                }
                if (ydiVarD0 == null || ydiVarD0.z0()) {
                    qnh.a(context, objC);
                }
            } catch (Throwable th) {
                if (ydiVarD0 == null || ydiVarD0.z0()) {
                    qnh.a(context, objC);
                }
                throw th;
            }
        } catch (DispatchException e) {
            dgj.G(c().getContext(), e.E);
        } catch (Throwable th2) {
            f(th2);
        }
    }
}
