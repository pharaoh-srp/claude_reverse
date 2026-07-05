package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vlj {
    public final String a;
    public final Long b;

    public vlj(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public static ire a() {
        return new ire(6, false);
    }

    public final Long b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlj) {
            vlj vljVar = (vlj) obj;
            if (this.a.equals(vljVar.a)) {
                Long l = vljVar.b;
                Long l2 = this.b;
                if (l2 != null ? l2.equals(l) : l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return (l == null ? 0 : l.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b + "}";
    }
}
