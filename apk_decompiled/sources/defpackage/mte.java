package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mte {
    public final zb0 a;
    public final Map b;

    public mte(zb0 zb0Var, Map map) {
        this.a = zb0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mte)) {
            return false;
        }
        mte mteVar = (mte) obj;
        return this.a.equals(mteVar.a) && this.b.equals(mteVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RichTextString(taggedString=" + ((Object) this.a) + ", formatObjects=" + this.b + ")";
    }
}
