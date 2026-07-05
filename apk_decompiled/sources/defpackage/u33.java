package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u33 implements w33 {
    public final List a;

    public u33(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.w33
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u33) && x44.r(this.a, ((u33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("Accepted(rawMessages=", ")", this.a);
    }
}
