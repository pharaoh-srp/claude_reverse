package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l52 {
    public static final l52 b = new l52();
    public final m1c a;

    public l52() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l52) {
            return x44.r(this.a, ((l52) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        m1c m1cVar = this.a;
        if (m1cVar != null) {
            return m1cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public l52(m1c m1cVar) {
        this.a = m1cVar;
    }
}
