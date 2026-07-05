package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tzk {
    public final String a;
    public final String b;
    public final boolean c;

    public tzk(String str, String str2, boolean z) {
        dgj.s(str);
        this.a = str;
        dgj.s(str2);
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzk)) {
            return false;
        }
        tzk tzkVar = (tzk) obj;
        return gb9.v(this.a, tzkVar.a) && gb9.v(this.b, tzkVar.b) && gb9.v(null, null) && this.c == tzkVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        dgj.v(null);
        throw null;
    }
}
