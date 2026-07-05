package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i12 extends wjc implements Serializable {
    public final lz7 E;
    public final wjc F;

    public i12(lz7 lz7Var, wjc wjcVar) {
        this.E = lz7Var;
        this.F = wjcVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        lz7 lz7Var = this.E;
        return this.F.compare(lz7Var.apply(obj), lz7Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return this.E.equals(i12Var.E) && this.F.equals(i12Var.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    public final String toString() {
        return this.F + ".onResultOf(" + this.E + ")";
    }
}
