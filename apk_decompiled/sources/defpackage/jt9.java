package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jt9 {
    public final String a;
    public final List b;

    public jt9(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt9)) {
            return false;
        }
        jt9 jt9Var = (jt9) obj;
        return x44.r(this.a, jt9Var.a) && this.b.equals(jt9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return y6a.o("PreprocessResult(markdown=", this.a, ", placeholders=", this.b, ")");
    }
}
