package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qeh {
    public static final qeh b = new qeh(0);
    public static final qeh c = new qeh(1);
    public static final qeh d = new qeh(2);
    public final int a;

    public qeh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qeh) {
            return this.a == ((qeh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return vb7.s(new StringBuilder("TextDecoration["), qaa.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
