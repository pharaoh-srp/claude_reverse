package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vz9 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ xz9 c;

    public vz9(xz9 xz9Var, int i) {
        this.c = xz9Var;
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        xz9 xz9Var = this.c;
        bm7 bm7Var = xz9Var.c;
        if (bm7Var == null) {
            return;
        }
        this.b.add(new kcd(bm7Var, i, xz9Var.b, null));
    }
}
