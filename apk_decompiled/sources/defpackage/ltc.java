package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ltc implements mtc {
    public final List a;

    public ltc(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltc) && this.a.equals(((ltc) obj).a);
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ebh.n("WiggleArtifacts(artifacts=", ")", this.a);
    }
}
