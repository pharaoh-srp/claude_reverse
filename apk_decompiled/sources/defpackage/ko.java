package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ko implements so {
    public final List a;

    public ko(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko) && x44.r(this.a, ((ko) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("Messages(messages=", ")", this.a);
    }
}
