package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zag implements fjb {
    public final ArrayList a;

    public zag(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((yag) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((yag) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((yag) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        fd9.E(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zag.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
