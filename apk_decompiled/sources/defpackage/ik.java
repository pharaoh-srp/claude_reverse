package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ik implements jk {
    public final fk a;
    public final String b;

    public ik(fk fkVar, String str) {
        fkVar.getClass();
        this.a = fkVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return x44.r(this.a, ikVar.a) && this.b.equals(ikVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Pdf(attachment=" + this.a + ", relativeContentsUrl=" + this.b + ")";
    }
}
