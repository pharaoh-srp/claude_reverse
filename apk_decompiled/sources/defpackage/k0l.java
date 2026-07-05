package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0l extends i0l {
    public boolean G;

    public k0l(o0l o0lVar) {
        super(o0lVar);
        this.F.V++;
    }

    public final void O0() {
        if (this.G) {
            return;
        }
        sz6.j("Not initialized");
    }

    public final void P0() {
        if (this.G) {
            sz6.j("Can't initialize twice");
            return;
        }
        Q0();
        this.F.W++;
        this.G = true;
    }

    public abstract boolean Q0();
}
