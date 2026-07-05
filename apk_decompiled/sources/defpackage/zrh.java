package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zrh extends hsh {
    public final ire d;

    public zrh() {
        super(4);
        this.d = new ire(4, false);
    }

    @Override // defpackage.hsh
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.p();
    }

    public final void g(char c) {
        this.d.c(c);
    }

    public final String toString() {
        return "<!--" + this.d.s() + "-->";
    }
}
