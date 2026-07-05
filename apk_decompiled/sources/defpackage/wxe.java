package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wxe {
    public final String a;
    public final long b;
    public final Boolean c;

    public wxe(String str, Boolean bool, long j) {
        this.a = str;
        this.b = j;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxe)) {
            return false;
        }
        wxe wxeVar = (wxe) obj;
        return this.a.equals(wxeVar.a) && this.b == wxeVar.b && this.c.equals(wxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("View(viewId=", this.a, ", documentVersion=", this.b);
        sbW.append(", hasAccessibility=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
