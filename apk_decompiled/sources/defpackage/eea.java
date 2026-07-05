package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class eea {
    public final Locale a;

    public eea(String str) {
        this(thk.e(str));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eea)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return x44.r(this.a.toLanguageTag(), ((eea) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }

    public eea(Locale locale) {
        this.a = locale;
    }
}
