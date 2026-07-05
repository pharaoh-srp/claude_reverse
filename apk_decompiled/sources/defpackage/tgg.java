package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tgg {
    public final sxb a;
    public final String b;

    public tgg(sxb sxbVar, String str) {
        this.a = sxbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgg)) {
            return false;
        }
        tgg tggVar = (tgg) obj;
        return this.a.equals(tggVar.a) && this.b.equals(tggVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(name=");
        sb.append(this.a);
        sb.append(", signature=");
        return vb7.s(sb, this.b, ')');
    }
}
