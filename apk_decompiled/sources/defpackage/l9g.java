package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l9g {
    public final String a;
    public final boolean b;

    public l9g(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9g)) {
            return false;
        }
        l9g l9gVar = (l9g) obj;
        return x44.r(this.a, l9gVar.a) && this.b == l9gVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SlackOrigin(channelName=" + this.a + ", isPrivate=" + this.b + ")";
    }
}
