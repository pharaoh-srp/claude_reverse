package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ibd implements hbd, Serializable {
    public final List E;

    public ibd(List list) {
        this.E = list;
    }

    @Override // defpackage.hbd
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.E;
            if (i >= list.size()) {
                return true;
            }
            if (!((hbd) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ibd) {
            return this.E.equals(((ibd) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.E) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
