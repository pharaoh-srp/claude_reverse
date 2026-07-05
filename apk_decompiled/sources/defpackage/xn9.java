package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xn9 extends ol9 implements jm9, jn9 {
    @Override // defpackage.jm9
    public final boolean isExternal() {
        return w().J;
    }

    @Override // defpackage.jm9
    public final boolean isInfix() {
        w();
        return false;
    }

    @Override // defpackage.jm9
    public final boolean isInline() {
        return w().M;
    }

    @Override // defpackage.jm9
    public final boolean isOperator() {
        w();
        return false;
    }

    @Override // defpackage.ll9
    public final boolean isSuspend() {
        w();
        return false;
    }

    @Override // defpackage.ol9
    public final im9 r() {
        return x().J;
    }

    @Override // defpackage.ol9
    public final q92 s() {
        return null;
    }

    @Override // defpackage.ol9
    public final boolean v() {
        return x().v();
    }

    public abstract erd w();

    public abstract do9 x();
}
