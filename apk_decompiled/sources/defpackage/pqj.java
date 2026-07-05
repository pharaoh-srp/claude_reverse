package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pqj implements lsj {
    public final boolean E;

    public pqj(Boolean bool) {
        if (bool == null) {
            this.E = false;
        } else {
            this.E = bool.booleanValue();
        }
    }

    @Override // defpackage.lsj
    public final Double a() {
        return Double.valueOf(this.E ? 1.0d : 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqj) && this.E == ((pqj) obj).E;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        return Boolean.toString(this.E);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.E).hashCode();
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.valueOf(this.E);
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return new pqj(Boolean.valueOf(this.E));
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.E;
        if (zEquals) {
            return new qsj(Boolean.toString(z));
        }
        sz6.p(kgh.p(Boolean.toString(z), ".", str, " is not a function."));
        return null;
    }

    public final String toString() {
        return String.valueOf(this.E);
    }
}
