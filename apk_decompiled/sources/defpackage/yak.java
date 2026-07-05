package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yak extends afk {
    public boolean F;

    public yak(umk umkVar) {
        super(umkVar);
        ((umk) this.E).i0++;
    }

    public final void O0() {
        if (this.F) {
            return;
        }
        sz6.j("Not initialized");
    }

    public final void P0() {
        if (this.F) {
            sz6.j("Can't initialize twice");
        } else {
            if (Q0()) {
                return;
            }
            ((umk) this.E).k0.incrementAndGet();
            this.F = true;
        }
    }

    public abstract boolean Q0();
}
