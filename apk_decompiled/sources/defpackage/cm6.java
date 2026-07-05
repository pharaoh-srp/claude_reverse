package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cm6 implements j09 {
    public final boolean E;

    public cm6(boolean z) {
        this.E = z;
    }

    @Override // defpackage.j09
    public final boolean c() {
        return this.E;
    }

    @Override // defpackage.j09
    public final t5c d() {
        return null;
    }

    public final String toString() {
        return vb7.s(new StringBuilder("Empty{"), this.E ? "Active" : "New", '}');
    }
}
