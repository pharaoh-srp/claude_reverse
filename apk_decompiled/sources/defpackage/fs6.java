package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fs6 {
    public final String a;
    public final String b;

    public fs6(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("id", this.a);
        String str = this.b;
        if (str != null) {
            qh9Var.r("current_locale", str);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs6)) {
            return false;
        }
        fs6 fs6Var = (fs6) obj;
        return x44.r(this.a, fs6Var.a) && x44.r(this.b, fs6Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("Application(id=", this.a, ", currentLocale=", this.b, ")");
    }
}
