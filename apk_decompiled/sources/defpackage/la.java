package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la {
    public final oa a;
    public final fa b;
    public final String c;
    public final String d;
    public final ma e;

    public la(oa oaVar, fa faVar, String str, String str2, ma maVar) {
        this.a = oaVar;
        this.b = faVar;
        this.c = str;
        this.d = str2;
        this.e = maVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return x44.r(this.a, laVar.a) && x44.r(this.b, laVar.b) && x44.r(this.c, laVar.c) && x44.r(this.d, laVar.d) && x44.r(this.e, laVar.e);
    }

    public final int hashCode() {
        oa oaVar = this.a;
        int iHashCode = (oaVar == null ? 0 : oaVar.hashCode()) * 31;
        fa faVar = this.b;
        int iHashCode2 = (iHashCode + (faVar == null ? 0 : faVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ma maVar = this.e;
        return iHashCode4 + (maVar != null ? maVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dd(session=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", browserSdkVersion=");
        kgh.u(sb, this.c, ", sdkName=", this.d, ", action=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
