package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v5a implements de2 {
    public final List a;

    public v5a(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.de2
    public final ee2 a(uub uubVar) {
        uubVar.getClass();
        return new w5a(this.a, uubVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5a) {
            return x44.r(this.a, ((v5a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
