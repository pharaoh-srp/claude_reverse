package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qs6 {
    public final int a;

    public qs6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs6) && this.a == ((qs6) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            return 0;
        }
        return sq6.F(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Csp(disposition=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "REPORT" : "ENFORCE");
        sb.append(")");
        return sb.toString();
    }
}
