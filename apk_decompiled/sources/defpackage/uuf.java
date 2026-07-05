package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uuf implements fvf {
    public final String a;
    public final String b;

    public uuf(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuf)) {
            return false;
        }
        uuf uufVar = (uuf) obj;
        return x44.r(this.a, uufVar.a) && x44.r(this.b, uufVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("PromptSuggestionReceived(uuid=", this.a, ", suggestion=", this.b, ")");
    }
}
