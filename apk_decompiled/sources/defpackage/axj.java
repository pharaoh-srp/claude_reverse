package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class axj implements Serializable {
    public final Object E;

    public axj(Object obj) {
        this.E = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axj) {
            return yok.l(this.E, ((axj) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    public final String toString() {
        return ij0.j("Suppliers.ofInstance(", this.E.toString(), ")");
    }
}
