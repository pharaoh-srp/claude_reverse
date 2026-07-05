package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pef {
    public final boolean a;
    public final String b;
    public final ta4 c;

    public pef(boolean z, String str, ta4 ta4Var) {
        this.a = z;
        this.b = str;
        this.c = ta4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pef) {
            pef pefVar = (pef) obj;
            return this.a == pefVar.a && x44.r(this.b, pefVar.b) && this.c == pefVar.c;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Section(visible=" + this.a + ", headingText=" + this.b + ", content=" + this.c + ")";
    }
}
