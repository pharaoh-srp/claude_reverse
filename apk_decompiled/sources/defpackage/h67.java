package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h67 {
    public final ArrayList a;

    public h67(ArrayList arrayList) {
        this.a = arrayList;
        int i = 0;
        List listI1 = w44.i1(arrayList, new g67(i));
        int size = listI1.size() - 1;
        while (i < size) {
            Instant instant = ((f67) listI1.get(i)).a;
            i++;
            if (!instant.isBefore(((f67) listI1.get(i)).a)) {
                sz6.p("Failed requirement.");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h67)) {
            return false;
        }
        return this.a.equals(((h67) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExerciseRoute(route=" + this.a + ')';
    }
}
