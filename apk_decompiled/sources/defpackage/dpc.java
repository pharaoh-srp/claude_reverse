package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dpc {
    public final Object a;
    public final Object b;

    public dpc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dpc) {
            dpc dpcVar = (dpc) obj;
            if (Objects.equals(this.a, dpcVar.a) && Objects.equals(this.b, dpcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
