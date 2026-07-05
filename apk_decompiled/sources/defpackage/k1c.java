package defpackage;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class k1c {
    public static final String b = nga.e("NetworkRequestCompat");
    public final Object a;

    public k1c(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1c) && x44.r(this.a, ((k1c) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
