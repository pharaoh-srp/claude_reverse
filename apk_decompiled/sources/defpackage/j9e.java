package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j9e implements s5f {
    public final LinkedHashSet a = new LinkedHashSet();

    public j9e(q28 q28Var) {
        q28Var.B("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.s5f
    public final Bundle a() {
        Bundle bundleM = eve.m((cpc[]) Arrays.copyOf(new cpc[0], 0));
        List listP1 = w44.p1(this.a);
        bundleM.putStringArrayList("classes_to_restore", listP1 instanceof ArrayList ? (ArrayList) listP1 : new ArrayList<>(listP1));
        return bundleM;
    }

    public final void b(String str) {
        this.a.add(str);
    }
}
