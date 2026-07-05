package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xhb implements zhb {
    public final List a;

    public xhb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhb) && this.a.equals(((xhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("CollapsedGroup(blocks=", ")", this.a);
    }
}
