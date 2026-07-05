package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l3h {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public l3h(String str, String str2, String str3, List list, List list2) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3h)) {
            return false;
        }
        l3h l3hVar = (l3h) obj;
        if (x44.r(this.a, l3hVar.a) && x44.r(this.b, l3hVar.b) && x44.r(this.c, l3hVar.c) && this.d.equals(l3hVar.d)) {
            return this.e.equals(l3hVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + kgh.m(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return csg.I(csg.W("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + akk.l(w44.h1(this.d)) + "\n            |   referenceColumnNames = {" + akk.k(w44.h1(this.e)) + "\n            |}\n        "), "    ");
    }
}
