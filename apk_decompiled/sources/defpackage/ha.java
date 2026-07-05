package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha {
    public final ia a;
    public final int b;

    public ha(ia iaVar, int i) {
        sq6.a(i);
        this.a = iaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        return this.a.equals(haVar.a) && this.b == haVar.b;
    }

    public final int hashCode() {
        return sq6.F(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.a + ", source=" + sq6.G(this.b) + ")";
    }
}
