package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n4j implements p4j {
    public final String a;
    public final String b;

    public n4j(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4j)) {
            return false;
        }
        n4j n4jVar = (n4j) obj;
        return this.a.equals(n4jVar.a) && this.b.equals(n4jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("AddedSupport(languageCode=", this.a, ", supportedCode=", this.b, ")");
    }
}
