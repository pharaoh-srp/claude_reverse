package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hea {
    public static final hea b = new hea(new iea(new LocaleList(new Locale[0])));
    public final iea a;

    public hea(iea ieaVar) {
        this.a = ieaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hea) {
            return this.a.equals(((hea) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
