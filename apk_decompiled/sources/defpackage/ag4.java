package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ag4 {
    public static final HashSet d = new HashSet(Arrays.asList("DD_API_KEY", "dd.api-key", "dd.profiling.api-key", "dd.profiling.apikey"));
    public final String a;
    public final Object b;
    public final int c;

    public ag4(int i, String str, String str2) {
        this.a = str2;
        this.b = d.contains(str2) ? "<hidden>" : str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ag4.class != obj.getClass()) {
            return false;
        }
        ag4 ag4Var = (ag4) obj;
        return this.a.equals(ag4Var.a) && Objects.equals(this.b, ag4Var.b) && this.c == ag4Var.c;
    }

    public final int hashCode() {
        int i = this.c;
        return Objects.hash(this.a, this.b, i == 0 ? null : Integer.valueOf(i - 1));
    }

    public final String toString() {
        return "ConfigSetting{key='" + this.a + "', value=" + this.b + ", origin=" + qy1.C(this.c) + '}';
    }
}
