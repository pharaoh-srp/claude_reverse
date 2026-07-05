package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class soe {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public soe(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soe)) {
            return false;
        }
        soe soeVar = (soe) obj;
        return this.a.equals(soeVar.a) && x44.r(this.b, soeVar.b) && x44.r(this.c, soeVar.c) && x44.r(this.d, soeVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Error(message=", this.a, ", code=", this.b, ", locations=");
        sbR.append(this.c);
        sbR.append(", path=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
