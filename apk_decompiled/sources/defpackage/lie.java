package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lie {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final byte[] e;
    public final String f;

    public lie(String str, String str2, String str3, Map map, byte[] bArr, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = bArr;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lie)) {
            return false;
        }
        lie lieVar = (lie) obj;
        return this.a.equals(lieVar.a) && this.b.equals(lieVar.b) && this.c.equals(lieVar.c) && this.d.equals(lieVar.d) && this.e.equals(lieVar.e) && this.f.equals(lieVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((Arrays.hashCode(this.e) + ebh.g(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.e);
        StringBuilder sbR = kgh.r("Request(id=", this.a, ", description=", this.b, ", url=");
        sbR.append(this.c);
        sbR.append(", headers=");
        sbR.append(this.d);
        sbR.append(", body=");
        return vb7.t(sbR, string, ", contentType=", this.f, ")");
    }
}
