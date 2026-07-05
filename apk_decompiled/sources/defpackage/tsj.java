package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tsj implements lsj {
    public final String E;
    public final ArrayList F;

    public tsj(String str, ArrayList arrayList) {
        this.E = str;
        ArrayList arrayList2 = new ArrayList();
        this.F = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.lsj
    public final Double a() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsj)) {
            return false;
        }
        tsj tsjVar = (tsj) obj;
        String str = tsjVar.E;
        String str2 = this.E;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        ArrayList arrayList = tsjVar.F;
        ArrayList arrayList2 = this.F;
        return arrayList2 != null ? arrayList2.equals(arrayList) : arrayList == null;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.E;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.F;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return this;
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
