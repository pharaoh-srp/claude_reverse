package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ltj implements lsj {
    @Override // defpackage.lsj
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof ltj;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return null;
    }

    @Override // defpackage.lsj
    public final String h() {
        return "undefined";
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // defpackage.lsj
    public final lsj l() {
        return lsj.v;
    }

    @Override // defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }
}
