package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w3f {
    public final String a;

    public w3f(String str) {
        pqi.p(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((w3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
