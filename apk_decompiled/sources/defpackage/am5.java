package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class am5 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return lvj.g(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof am5;
    }

    public final int hashCode() {
        return 436998964;
    }
}
