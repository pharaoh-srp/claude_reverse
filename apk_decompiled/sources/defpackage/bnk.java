package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bnk {
    public final Context a;
    public final nyg b;

    public bnk(Context context, nyg nygVar) {
        this.a = context;
        this.b = nygVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnk)) {
            return false;
        }
        bnk bnkVar = (bnk) obj;
        if (!this.a.equals(bnkVar.a)) {
            return false;
        }
        nyg nygVar = bnkVar.b;
        nyg nygVar2 = this.b;
        return nygVar2 == null ? nygVar == null : nygVar2.equals(nygVar);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        nyg nygVar = this.b;
        return (nygVar == null ? 0 : nygVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return ij0.l("FlagsContext{context=", String.valueOf(this.a), ", hermeticFileOverrides=", String.valueOf(this.b), "}");
    }
}
