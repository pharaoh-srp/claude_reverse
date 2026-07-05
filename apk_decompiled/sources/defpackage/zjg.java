package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zjg extends twj {
    public final String g;

    public zjg(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjg) && this.g.equals(((zjg) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return ij0.j("Error(message=", this.g, ")");
    }
}
