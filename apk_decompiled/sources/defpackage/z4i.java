package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class z4i {
    public final ArrayList a;
    public final HashSet b;

    public z4i(ArrayList arrayList, HashSet hashSet) {
        this.a = arrayList;
        this.b = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4i)) {
            return false;
        }
        z4i z4iVar = (z4i) obj;
        return this.a.equals(z4iVar.a) && this.b.equals(z4iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TranscriptDurableKeys(keys=" + this.a + ", ownedApiMessageIds=" + this.b + ")";
    }
}
