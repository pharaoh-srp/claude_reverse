package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class odj {
    public final List a;

    public odj(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !odj.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((odj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w44.S0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
