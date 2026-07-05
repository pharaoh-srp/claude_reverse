package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k52 {
    public final m1c a;

    public k52(m1c m1cVar) {
        this.a = m1cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k52) && x44.r(this.a, ((k52) obj).a);
    }

    public final int hashCode() {
        m1c m1cVar = this.a;
        if (m1cVar != null) {
            return m1cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}
