package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n3h {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public n3h(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3h)) {
            return false;
        }
        n3h n3hVar = (n3h) obj;
        if (!this.a.equals(n3hVar.a) || !this.b.equals(n3hVar.b) || !x44.r(this.c, n3hVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = n3hVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ebh.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(akk.f(w44.i1(this.b.values(), new x8e(12))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(akk.f(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(akk.f(set != null ? w44.i1(set, new x8e(13)) : lm6.E));
        sb.append("\n            |}\n        ");
        return csg.W(sb.toString());
    }
}
