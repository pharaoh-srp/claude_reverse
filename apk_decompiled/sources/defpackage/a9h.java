package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a9h implements b9h {
    public final String a;
    public final List b;
    public final Set c;

    public a9h(String str, List list, Set set) {
        this.a = str;
        this.b = list;
        this.c = set;
    }

    public static a9h a(a9h a9hVar, ArrayList arrayList, Set set, int i) {
        String str = a9hVar.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = a9hVar.b;
        }
        return new a9h(str, list, set);
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9h)) {
            return false;
        }
        a9h a9hVar = (a9h) obj;
        return this.a.equals(a9hVar.a) && this.b.equals(a9hVar.b) && this.c.equals(a9hVar.c);
    }

    @Override // defpackage.b9h
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ToolRun(key=" + this.a + ", calls=" + this.b + ", pending=" + this.c + ")";
    }
}
