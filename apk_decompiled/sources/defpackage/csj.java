package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class csj implements lsj {
    @Override // defpackage.lsj
    public final Double a() {
        return Double.valueOf(0.0d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof csj;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return lsj.w;
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }
}
