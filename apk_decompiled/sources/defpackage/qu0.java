package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qu0 {
    public final String a;
    public final String b;

    public qu0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        return x44.r(this.a, qu0Var.a) && x44.r(this.b, qu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("AskQuestionAnswer(header=", this.a, ", answer=", this.b, ")");
    }
}
