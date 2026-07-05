package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class owg implements pwg {
    public final ArrayList a;
    public final List b;

    public owg(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owg)) {
            return false;
        }
        owg owgVar = (owg) obj;
        return this.a.equals(owgVar.a) && x44.r(this.b, owgVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ProductInfoSuccess(proProducts=" + this.a + ", maxProducts=" + this.b + ")";
    }
}
