package defpackage;

import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 extends vf9 implements tp4, l45 {
    public final c45 I;

    public d1(c45 c45Var, boolean z) {
        super(z);
        X((lf9) c45Var.x0(dd8.J));
        this.I = c45Var.r0(this);
    }

    @Override // defpackage.vf9
    public final String B() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.vf9
    public final void W(CompletionHandlerException completionHandlerException) {
        dgj.G(this.I, completionHandlerException);
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.I;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.I;
    }

    @Override // defpackage.vf9
    public final void h0(Object obj) {
        if (!(obj instanceof e94)) {
            v0(obj);
        } else {
            e94 e94Var = (e94) obj;
            u0(e94Var.a, e94.b.get(e94Var) == 1);
        }
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        Throwable thA = jre.a(obj);
        if (thA != null) {
            obj = new e94(thA, false);
        }
        Object objD0 = d0(obj);
        if (objD0 == wf9.b) {
            return;
        }
        v(objD0);
    }

    public void u0(Throwable th, boolean z) {
    }

    public void v0(Object obj) {
    }

    public final void w0(o45 o45Var, d1 d1Var, pz7 pz7Var) {
        Object objInvoke;
        int iOrdinal = o45Var.ordinal();
        iei ieiVar = iei.a;
        if (iOrdinal == 0) {
            try {
                a86.a(zni.I(zni.p(d1Var, this, pz7Var)), ieiVar);
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).E;
                }
                resumeWith(sf5.u(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                pz7Var.getClass();
                zni.I(zni.p(d1Var, this, pz7Var)).resumeWith(ieiVar);
                return;
            }
            if (iOrdinal != 3) {
                mr9.b();
                return;
            }
            try {
                c45 c45Var = this.I;
                Object objC = qnh.c(c45Var, null);
                try {
                    if (pz7Var instanceof vd1) {
                        nai.n(2, pz7Var);
                        objInvoke = pz7Var.invoke(d1Var, this);
                    } else {
                        objInvoke = zni.f0(pz7Var, d1Var, this);
                    }
                    qnh.a(c45Var, objC);
                    if (objInvoke != m45.E) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    qnh.a(c45Var, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
