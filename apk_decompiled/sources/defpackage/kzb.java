package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kzb {
    public final List a;
    public final int b;

    public kzb(List list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        pmf.l(vb7.u("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), x44.L(list2), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kzb.class != obj.getClass()) {
            return false;
        }
        kzb kzbVar = (kzb) obj;
        return this.b == kzbVar.b && x44.r(this.a, kzbVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public kzb() {
        this(lm6.E, -1);
    }
}
