package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hsf {
    public final String a;
    public final String b;
    public final Map c;

    public hsf(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsf)) {
            return false;
        }
        hsf hsfVar = (hsf) obj;
        return this.a.equals(hsfVar.a) && x44.r(this.b, hsfVar.b) && x44.r(this.c, hsfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qy1.i(kgh.r("SessionInfo(containerId=", this.a, ", hostUrl=", this.b, ", authHeaders="), this.c, ")");
    }
}
