package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ru0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final boolean d;

    public ru0(String str, String str2, ArrayList arrayList, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return x44.r(this.a, ru0Var.a) && x44.r(this.b, ru0Var.b) && this.c.equals(ru0Var.c) && this.d == ru0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("AskQuestionData(question=", this.a, ", header=", this.b, ", options=");
        sbR.append(this.c);
        sbR.append(", multiSelect=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
