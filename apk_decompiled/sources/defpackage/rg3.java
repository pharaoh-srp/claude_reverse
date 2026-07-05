package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rg3 {
    public static final rg3 c = new rg3(null, 0);
    public final String a;
    public final int b;

    public rg3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg3)) {
            return false;
        }
        rg3 rg3Var = (rg3) obj;
        return x44.r(this.a, rg3Var.a) && this.b == rg3Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return sq6.u("CitationTitleAndCount(title=", this.a, this.b, ", count=", ")");
    }
}
