package defpackage;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hqb implements nw5 {
    public mp4 F;
    public int G;
    public hqb I;
    public hqb J;
    public mbc K;
    public m5c L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public xz Q;
    public boolean R;
    public hqb E = this;
    public int H = -1;

    public final l45 d1() {
        mp4 mp4Var = this.F;
        if (mp4Var != null) {
            return mp4Var;
        }
        mp4 mp4VarC = fd9.c(yfd.X(this).getCoroutineContext().r0(new mf9((lf9) yfd.X(this).getCoroutineContext().x0(dd8.J))));
        this.F = mp4VarC;
        return mp4VarC;
    }

    public boolean e1() {
        return !(this instanceof cc1);
    }

    public void f1() {
        if (this.R) {
            b39.c("node attached multiple times");
        }
        if (this.L == null) {
            b39.c("attach invoked on a node without a coordinator");
        }
        this.R = true;
        this.O = true;
    }

    public void g1() {
        if (!this.R) {
            b39.c("Cannot detach a node that is not attached");
        }
        if (this.O) {
            b39.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.P) {
            b39.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.R = false;
        mp4 mp4Var = this.F;
        if (mp4Var != null) {
            fd9.z(mp4Var, new ModifierNodeDetachedCancellationException());
            this.F = null;
        }
    }

    public void h1() {
    }

    public void i1() {
    }

    public void j1() {
    }

    public void k1() {
        if (!this.R) {
            b39.c("reset() called on an unattached node");
        }
        j1();
    }

    public void l1() {
        if (!this.R) {
            b39.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.O) {
            b39.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.O = false;
        h1();
        this.P = true;
    }

    public void m1() {
        if (!this.R) {
            b39.c("node detached multiple times");
        }
        if (this.L == null) {
            b39.c("detach invoked on a node without a coordinator");
        }
        if (!this.P) {
            b39.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.P = false;
        xz xzVar = this.Q;
        if (xzVar != null) {
            xzVar.a();
        }
        i1();
    }

    public void n1(hqb hqbVar) {
        this.E = hqbVar;
    }

    public void o1(m5c m5cVar) {
        this.L = m5cVar;
    }

    @Override // defpackage.nw5
    public final hqb x0() {
        return this.E;
    }
}
