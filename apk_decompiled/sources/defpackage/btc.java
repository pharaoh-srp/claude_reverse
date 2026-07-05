package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class btc implements mtc {
    public static final btc d;
    public final List a;
    public final List b;
    public final u0h c;

    static {
        lm6 lm6Var = lm6.E;
        d = new btc(lm6Var, lm6Var);
    }

    public btc(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = new u0h(new pza(7, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btc)) {
            return false;
        }
        btc btcVar = (btc) obj;
        return x44.r(this.a, btcVar.a) && x44.r(this.b, btcVar.b);
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return (String) this.c.getValue();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "KnowledgeSources(citations=" + this.a + ", otherSources=" + this.b + ")";
    }
}
