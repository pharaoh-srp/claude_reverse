package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x33 implements w33 {
    public final List a;

    public x33(List list) {
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
        return (obj instanceof x33) && this.a.equals(((x33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("Rejected(rawMessages=", ")", this.a);
    }
}
