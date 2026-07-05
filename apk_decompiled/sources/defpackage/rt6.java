package defpackage;

import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rt6 implements vt6 {
    public static final rt6 a = new rt6();

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1112045582);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(d4c.j0(R.string.generic_error_internet_offline, e18Var));
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((wb0) arrayList.get(i)).a(sb.length()));
        }
        zb0 zb0Var = new zb0(string, (List) arrayList2);
        e18Var.p(false);
        return zb0Var;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rt6);
    }

    public final int hashCode() {
        return 1981189609;
    }

    public final String toString() {
        return "NetworkOfflineError";
    }
}
