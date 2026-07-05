package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tv7 {
    public final fm3 a;
    public final uv7 b;
    public final k84 c;
    public final List d;

    public tv7(fm3 fm3Var, uv7 uv7Var, k84 k84Var, List list) {
        fm3Var.getClass();
        this.a = fm3Var;
        this.b = uv7Var;
        this.c = k84Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv7)) {
            return false;
        }
        tv7 tv7Var = (tv7) obj;
        return this.a == tv7Var.a && this.b == tv7Var.b && x44.r(this.c, tv7Var.c) && x44.r(this.d, tv7Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k84 k84Var = this.c;
        int iHashCode2 = (iHashCode + (k84Var == null ? 0 : k84Var.hashCode())) * 31;
        List list = this.d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FooterState(claudeSparkState=" + this.a + ", footerTextState=" + this.b + ", compactionState=" + this.c + ", toolLoadingMessages=" + this.d + ")";
    }
}
