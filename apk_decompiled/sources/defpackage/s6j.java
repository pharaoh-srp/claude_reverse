package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s6j {
    public final String a;
    public final Map b;

    public s6j(String str, Map map) {
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6j)) {
            return false;
        }
        s6j s6jVar = (s6j) obj;
        return this.a.equals(s6jVar.a) && x44.r(this.b, s6jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Url(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
