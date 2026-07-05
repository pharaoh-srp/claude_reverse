package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ryg implements nyg, Serializable {
    public final Object E;

    public ryg(Object obj) {
        this.E = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ryg) {
            return cvk.l(this.E, ((ryg) obj).E);
        }
        return false;
    }

    @Override // defpackage.nyg
    public final Object get() {
        return this.E;
    }

    public final int hashCode() {
        return cvk.q(this.E);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.E + ")";
    }
}
