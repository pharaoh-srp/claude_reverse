package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ash extends hsh {
    public final ire d;
    public String e;
    public final ire f;
    public final ire g;
    public final ire h;
    public boolean i;

    public ash() {
        super(1);
        this.d = new ire(4, false);
        this.e = null;
        this.f = new ire(4, false);
        this.g = new ire(4, false);
        this.h = new ire(4, false);
        this.i = false;
    }

    @Override // defpackage.hsh
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.p();
        this.e = null;
        this.f.p();
        this.g.p();
        this.h.p();
        this.i = false;
    }

    public final String toString() {
        return "<!doctype " + this.d.s() + ">";
    }
}
