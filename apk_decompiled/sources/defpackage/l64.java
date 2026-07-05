package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l64 implements de2 {
    public final List a;

    public l64(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.de2
    public final ee2 a(uub uubVar) {
        uubVar.getClass();
        return new m64(this.a, uubVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l64) {
            return x44.r(this.a, ((l64) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
