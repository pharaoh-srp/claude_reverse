package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fea {
    public final List a;
    public final String b;
    public final String c;

    public fea(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea)) {
            return false;
        }
        fea feaVar = (fea) obj;
        return x44.r(this.a, feaVar.a) && x44.r(this.b, feaVar.b) && x44.r(this.c, feaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocaleInfo(locales=");
        sb.append(this.a);
        sb.append(", currentLocale=");
        sb.append(this.b);
        sb.append(", timeZone=");
        return ij0.m(sb, this.c, ")");
    }
}
