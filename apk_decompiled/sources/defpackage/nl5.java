package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nl5 {
    public final String a;
    public final char b;
    public final String c;

    public nl5(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = isg.n0(str, String.valueOf(c), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl5)) {
            return false;
        }
        nl5 nl5Var = (nl5) obj;
        return this.a.equals(nl5Var.a) && this.b == nl5Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
