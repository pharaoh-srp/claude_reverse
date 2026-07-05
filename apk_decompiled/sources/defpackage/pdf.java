package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class pdf {
    public final String a;
    public final ArrayList b;

    public pdf(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdf)) {
            return false;
        }
        pdf pdfVar = (pdf) obj;
        return x44.r(this.a, pdfVar.a) && this.b.equals(pdfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Snippet(text=" + this.a + ", highlights=" + this.b + ")";
    }
}
