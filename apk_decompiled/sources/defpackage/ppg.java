package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ppg extends wpg {
    public final String a;
    public final String b;
    public final List c;
    public final long d;

    public ppg(String str, long j, String str2, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppg)) {
            return false;
        }
        ppg ppgVar = (ppg) obj;
        return x44.r(this.a, ppgVar.a) && x44.r(this.b, ppgVar.b) && x44.r(this.c, ppgVar.c) && this.d == ppgVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.d) + kgh.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("SuggestActions(id=", this.a, ", prompt=", this.b, ", actions=");
        sbR.append(this.c);
        sbR.append(", timestamp=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
