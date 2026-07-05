package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w7g extends mqh {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final j7b e;
    public final f7b f;

    static {
        xm7 xm7Var = new xm7();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        List list = Collections.EMPTY_LIST;
        vde vdeVar2 = vde.I;
        e7b e7bVar = new e7b();
        h7b h7bVar = h7b.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new g7b(uri, null, null, list, vdeVar2, -9223372036854775807L);
        }
        xm7Var.a();
        e7bVar.a();
        n7b n7bVar = n7b.B;
    }

    public w7g(long j, boolean z, boolean z2, j7b j7bVar) {
        f7b f7bVar = z2 ? j7bVar.c : null;
        this.b = j;
        this.c = j;
        this.d = z;
        j7bVar.getClass();
        this.e = j7bVar;
        this.f = f7bVar;
    }

    @Override // defpackage.mqh
    public final int b(Object obj) {
        return g != obj ? -1 : 0;
    }

    @Override // defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        fd9.G(i, 1);
        Object obj = z ? g : null;
        jqhVar.getClass();
        jqhVar.h(null, obj, 0, this.b, 0L, nd.c, false);
        return jqhVar;
    }

    @Override // defpackage.mqh
    public final int h() {
        return 1;
    }

    @Override // defpackage.mqh
    public final Object l(int i) {
        fd9.G(i, 1);
        return g;
    }

    @Override // defpackage.mqh
    public final kqh m(int i, kqh kqhVar, long j) {
        fd9.G(i, 1);
        Object obj = kqh.o;
        kqhVar.b(this.e, this.d, false, this.f, 0L, this.c);
        return kqhVar;
    }

    @Override // defpackage.mqh
    public final int o() {
        return 1;
    }
}
