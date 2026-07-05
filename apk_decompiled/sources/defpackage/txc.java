package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class txc {
    public static final txc c = new txc(um6.E, false);
    public final Set a;
    public final boolean b;

    public txc(Set set, boolean z) {
        set.getClass();
        this.a = set;
        this.b = z;
    }

    public final Set a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txc)) {
            return false;
        }
        txc txcVar = (txc) obj;
        return x44.r(this.a, txcVar.a) && this.b == txcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HealthConnectPermissions(grantedPermissionRecords=" + this.a + ", hasLongTermDataAccess=" + this.b + ")";
    }
}
