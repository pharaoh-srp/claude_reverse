package defpackage;

import androidx.compose.material3.internal.AnchoredDraggableUninitializedException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class f15 {
    public final amg a;
    public final a4e b;
    public final jxb c;
    public final LinkedHashSet d;
    public volatile int e;

    public f15() {
        amg amgVarA = bmg.a(null);
        this.a = amgVarA;
        this.b = j8.k(amgVarA);
        this.c = new jxb();
        this.d = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bx4 r11, defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f15.a(bx4, vp4):java.lang.Object");
    }

    public final void b() throws AnchoredDraggableUninitializedException {
        this.e++;
        this.d.clear();
        xw4 xw4Var = (xw4) this.a.getValue();
        if (xw4Var != null) {
            xw4Var.b.invoke(Boolean.FALSE);
        }
        this.a.m(null);
    }
}
