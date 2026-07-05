package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b9a {
    public static n89 a(long j, Object obj) {
        n89 n89Var = (n89) tgi.c.h(j, obj);
        if (((o3) n89Var).E) {
            return n89Var;
        }
        int size = n89Var.size();
        tud tudVarE = ((tud) n89Var).e(size == 0 ? 10 : size * 2);
        tgi.o(j, obj, tudVarE);
        return tudVarE;
    }
}
