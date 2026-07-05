package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {
    public final String a;
    public final Pattern b;

    public l0(String str) {
        Pattern patternCompile;
        this.a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            t4.g().r().getLogger().h(t5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.b = patternCompile;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b(String str) {
        Pattern pattern = this.b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public final boolean equals(Object obj) {
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((l0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
