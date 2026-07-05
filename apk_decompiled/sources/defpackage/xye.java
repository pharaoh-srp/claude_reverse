package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xye {
    public final kye a;
    public final Map b;
    public final boolean c;

    public xye(kye kyeVar, Map map, boolean z) {
        kyeVar.getClass();
        map.getClass();
        this.a = kyeVar;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xye)) {
            return false;
        }
        xye xyeVar = (xye) obj;
        return x44.r(this.a, xyeVar.a) && x44.r(this.b, xyeVar.b) && this.c == xyeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ebh.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RumViewInfo(key=");
        sb.append(this.a);
        sb.append(", attributes=");
        sb.append(this.b);
        sb.append(", isActive=");
        return sq6.v(")", sb, this.c);
    }
}
