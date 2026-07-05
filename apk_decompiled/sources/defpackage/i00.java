package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i00 implements ekf {
    public boolean E;
    public final /* synthetic */ e0g F;

    public i00(e0g e0gVar) {
        this.F = e0gVar;
    }

    @Override // defpackage.ekf
    public final void a(dkf dkfVar, Object obj) {
        if (obj == this.F) {
            this.E = true;
        }
    }

    public final boolean b() {
        return this.E;
    }
}
