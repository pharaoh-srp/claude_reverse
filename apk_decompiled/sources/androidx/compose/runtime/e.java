package androidx.compose.runtime;

import defpackage.c45;
import defpackage.cb2;
import defpackage.dd8;
import defpackage.im6;
import defpackage.je4;
import defpackage.knk;
import defpackage.l45;
import defpackage.lf9;
import defpackage.mee;
import defpackage.mf9;
import defpackage.pee;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l45, mee {
    public static final cb2 I = new cb2(0);
    public final c45 E;
    public final c45 F;
    public final e G = this;
    public volatile c45 H;

    public e(c45 c45Var, c45 c45Var2) {
        this.E = c45Var;
        this.F = c45Var2;
    }

    @Override // defpackage.mee
    public final void a() {
        c();
    }

    @Override // defpackage.mee
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.G) {
            try {
                c45 c45Var = this.H;
                if (c45Var == null) {
                    this.H = I;
                } else {
                    knk.o(c45Var, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mee
    public final void g() {
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        c45 c45VarR0;
        c45 c45Var = this.H;
        if (c45Var == null || c45Var == I) {
            je4 je4Var = (je4) this.E.x0(je4.F);
            c45 peeVar = je4Var != null ? new pee(je4Var, this) : im6.E;
            synchronized (this.G) {
                try {
                    c45 c45Var2 = this.H;
                    if (c45Var2 == null) {
                        c45 c45Var3 = this.E;
                        c45VarR0 = c45Var3.r0(new mf9((lf9) c45Var3.x0(dd8.J))).r0(this.F).r0(peeVar);
                    } else if (c45Var2 == I) {
                        c45 c45Var4 = this.E;
                        mf9 mf9Var = new mf9((lf9) c45Var4.x0(dd8.J));
                        mf9Var.y(new ForgottenCoroutineScopeException());
                        c45VarR0 = c45Var4.r0(mf9Var).r0(this.F).r0(peeVar);
                    } else {
                        c45VarR0 = c45Var2;
                    }
                    this.H = c45VarR0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c45Var = c45VarR0;
        }
        c45Var.getClass();
        return c45Var;
    }
}
