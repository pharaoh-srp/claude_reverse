package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes2.dex */
public final class tdh {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public tdh(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final long a() {
        return this.b;
    }

    public final CharSequence b() {
        return this.a;
    }

    public final TextClassification c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdh)) {
            return false;
        }
        tdh tdhVar = (tdh) obj;
        return x44.r(this.a, tdhVar.a) && kkh.c(this.b, tdhVar.b) && x44.r(this.c, tdhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = kkh.c;
        return this.c.hashCode() + vb7.e(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) kkh.i(this.b)) + ", textClassification=" + this.c + ')';
    }
}
