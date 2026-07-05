package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oeg implements dh7 {
    public final jy8 a;
    public final String b;
    public final sg5 c;

    public oeg(jy8 jy8Var, String str, sg5 sg5Var) {
        this.a = jy8Var;
        this.b = str;
        this.c = sg5Var;
    }

    public final sg5 a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final jy8 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeg)) {
            return false;
        }
        oeg oegVar = (oeg) obj;
        return x44.r(this.a, oegVar.a) && x44.r(this.b, oegVar.b) && this.c == oegVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
