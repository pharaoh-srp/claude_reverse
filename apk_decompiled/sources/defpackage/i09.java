package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i09 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final jk9 d;
    public final String e;
    public final gh3 f;

    public i09(Object obj, Object obj2, jk9 jk9Var, jk9 jk9Var2, String str, gh3 gh3Var) {
        this.a = obj;
        this.b = obj2;
        this.c = jk9Var;
        this.d = jk9Var2;
        this.e = str;
        this.f = gh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i09)) {
            return false;
        }
        i09 i09Var = (i09) obj;
        return this.a.equals(i09Var.a) && x44.r(this.b, i09Var.b) && x44.r(this.c, i09Var.c) && this.d.equals(i09Var.d) && this.e.equals(i09Var.e) && this.f.equals(i09Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.f.hashCode() + kgh.l((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
