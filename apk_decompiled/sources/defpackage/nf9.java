package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nf9 extends hfa implements y86, j09 {
    public vf9 K;

    @Override // defpackage.y86
    public final void a() {
        q().k0(this);
    }

    @Override // defpackage.j09
    public final boolean c() {
        return true;
    }

    @Override // defpackage.j09
    public final t5c d() {
        return null;
    }

    public lf9 getParent() {
        return q();
    }

    public final vf9 q() {
        vf9 vf9Var = this.K;
        if (vf9Var != null) {
            return vf9Var;
        }
        x44.o0("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.hfa
    public final String toString() {
        return getClass().getSimpleName() + '@' + xn5.d0(this) + "[job@" + xn5.d0(q()) + ']';
    }
}
