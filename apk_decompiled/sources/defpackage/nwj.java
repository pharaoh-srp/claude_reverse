package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nwj extends dwj {
    public final vvd E;

    public nwj(vvd vvdVar) {
        this.E = vvdVar;
    }

    @Override // defpackage.dwj
    public final Object a() {
        return this.E;
    }

    @Override // defpackage.dwj
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nwj) {
            return this.E.equals(((nwj) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode() + 1502476572;
    }

    public final String toString() {
        return ij0.j("Optional.of(", this.E.toString(), ")");
    }
}
