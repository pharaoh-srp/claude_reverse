package defpackage;

import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tt6 implements vt6 {
    public final boolean a;

    public tt6(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1487116127);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (this.a) {
            e18Var.a0(455307991);
            sb.append(d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var));
            e18Var.p(false);
        } else {
            e18Var.a0(455429697);
            sb.append(d4c.j0(R.string.generic_error_something_went_wrong, e18Var));
            e18Var.p(false);
        }
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
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt6) && this.a == ((tt6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("UnknownError(tryAgain=", ")", this.a);
    }

    public /* synthetic */ tt6() {
        this(true);
    }
}
