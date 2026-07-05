package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bu9 {
    public static final cm4 g = new cm4();
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final Set f;

    public bu9(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet;
        this.f = set;
    }

    public final int a(zk6 zk6Var) {
        xv9 xv9VarJ = dlk.j(zk6Var);
        synchronized (this) {
            Integer num = (Integer) this.b.get(xv9VarJ);
            if (num != null) {
                int iIntValue = num.intValue();
                this.e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % cw9.c;
                if (i == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (i + 1) % cw9.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(xv9VarJ, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(sm0 sm0Var) {
        Object objD = y68.a.d(this.a, fw9.b, dlk.o(this.d), new u73(this, null, 23), sm0Var);
        return objD == m45.E ? objD : iei.a;
    }
}
