package io.sentry.clientreport;

import io.sentry.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final String a;
    public final String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.h(this.a, cVar.a) && p.h(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
