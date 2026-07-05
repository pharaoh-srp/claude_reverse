package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h59 extends hqb implements p6i {
    public wbj S;
    public wbj T;

    public h59() {
        om7 om7Var = iuj.h;
        this.S = om7Var;
        this.T = om7Var;
    }

    @Override // defpackage.hqb
    public void h1() {
        j8.m0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g59(this, 1));
        q1();
    }

    @Override // defpackage.hqb
    public void i1() {
        this.T = this.S;
        j8.o0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g59(this, 0));
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.S = iuj.h;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public abstract wbj p1(wbj wbjVar);

    public void q1() {
        this.T = p1(this.S);
        j8.o0(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new g59(this, 0));
    }
}
