package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ntb extends sqi {
    public final ArrayList a;

    public ntb(ArrayList arrayList) {
        this.a = arrayList;
        if (sta.p0(arrayList).size() == arrayList.size()) {
            return;
        }
        sz6.p("Some properties have the same names");
        throw null;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
