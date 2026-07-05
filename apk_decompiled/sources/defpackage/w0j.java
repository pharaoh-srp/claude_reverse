package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w0j {
    public static final w0j c = new w0j("", "");
    public final String a;
    public final String b;

    public w0j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0j)) {
            return false;
        }
        w0j w0jVar = (w0j) obj;
        return x44.r(this.a, w0jVar.a) && x44.r(this.b, w0jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("VoiceAudioRoute(inputType=", this.a, ", outputType=", this.b, ")");
    }
}
