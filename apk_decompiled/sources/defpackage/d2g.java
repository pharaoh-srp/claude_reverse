package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d2g {
    public final boolean a;
    public final Integer b;
    public final String c;
    public final g93 d;

    public d2g(boolean z, Integer num, String str, g93 g93Var) {
        this.a = z;
        this.b = num;
        this.c = str;
        this.d = g93Var;
    }

    public static d2g a(d2g d2gVar, boolean z, Integer num, String str, g93 g93Var, int i) {
        if ((i & 2) != 0) {
            num = d2gVar.b;
        }
        if ((i & 4) != 0) {
            str = d2gVar.c;
        }
        if ((i & 8) != 0) {
            g93Var = d2gVar.d;
        }
        d2gVar.getClass();
        return new d2g(z, num, str, g93Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2g)) {
            return false;
        }
        d2g d2gVar = (d2g) obj;
        return this.a == d2gVar.a && x44.r(this.b, d2gVar.b) && x44.r(this.c, d2gVar.c) && x44.r(this.d, d2gVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        g93 g93Var = this.d;
        return iHashCode3 + (g93Var != null ? g93Var.hashCode() : 0);
    }

    public final String toString() {
        return "SharedChatState(isLoading=" + this.a + ", error=" + this.b + ", chatName=" + this.c + ", messageListState=" + this.d + ")";
    }
}
