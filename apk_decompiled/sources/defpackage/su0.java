package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class su0 {
    public final String a;
    public final String b;

    public su0(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return x44.r(this.a, su0Var.a) && x44.r(this.b, su0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("AskQuestionOption(label=", this.a, ", description=", this.b, ")");
    }
}
