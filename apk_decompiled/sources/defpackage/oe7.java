package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oe7 {
    public int a;
    public final ArrayList b = new ArrayList();

    public final void a(String str, List list) {
        int i = this.a;
        this.a = i + 1;
        this.b.add(new yk(grc.p(i, "m"), xm.F, str, list, false, null, null, 112));
    }

    public final void b(String str) {
        int i = this.a;
        this.a = i + 1;
        this.b.add(new yk(grc.p(i, "m"), xm.E, str, null, false, null, null, 120));
    }
}
