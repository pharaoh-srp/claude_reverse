package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qdf {
    public static final qdf d = new qdf(null, null, lm6.E);
    public final pdf a;
    public final String b;
    public final List c;

    public qdf(pdf pdfVar, String str, List list) {
        this.a = pdfVar;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdf)) {
            return false;
        }
        qdf qdfVar = (qdf) obj;
        return x44.r(this.a, qdfVar.a) && x44.r(this.b, qdfVar.b) && this.c.equals(qdfVar.c);
    }

    public final int hashCode() {
        pdf pdfVar = this.a;
        int iHashCode = (pdfVar == null ? 0 : pdfVar.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchContext(snippet=");
        sb.append(this.a);
        sb.append(", titleAsIndexed=");
        sb.append(this.b);
        sb.append(", titleHighlights=");
        return gid.q(sb, this.c, ")");
    }
}
