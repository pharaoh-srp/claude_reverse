package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pqk extends rok {
    public boolean F;

    public pqk(umk umkVar) {
        super(umkVar);
        ((umk) this.E).i0++;
    }

    public final void L0() {
        if (this.F) {
            return;
        }
        sz6.j("Not initialized");
    }

    public final void M0() {
        if (this.F) {
            sz6.j("Can't initialize twice");
        } else {
            if (N0()) {
                return;
            }
            ((umk) this.E).k0.incrementAndGet();
            this.F = true;
        }
    }

    public abstract boolean N0();
}
