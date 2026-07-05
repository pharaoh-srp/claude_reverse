package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class drj implements lsj {
    public final lsj E;
    public final String F;

    public drj(String str) {
        this.E = lsj.v;
        this.F = str;
    }

    @Override // defpackage.lsj
    public final Double a() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof drj)) {
            return false;
        }
        drj drjVar = (drj) obj;
        return this.F.equals(drjVar.F) && this.E.equals(drjVar.E);
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.E.hashCode() + (this.F.hashCode() * 31);
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return new drj(this.F, this.E.l());
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public drj(String str, lsj lsjVar) {
        this.E = lsjVar;
        this.F = str;
    }
}
