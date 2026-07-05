package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jgf {
    public final yih a;
    public final String b;

    public jgf(yih yihVar, String str) {
        yihVar.getClass();
        str.getClass();
        this.a = yihVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgf)) {
            return false;
        }
        jgf jgfVar = (jgf) obj;
        return x44.r(this.a, jgfVar.a) && x44.r(this.b, jgfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectOptionSearchState(query=" + this.a + ", label=" + this.b + ")";
    }
}
