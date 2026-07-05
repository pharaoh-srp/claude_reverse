package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d9a {
    public final s3 a(long j, Object obj) {
        s3 s3Var = (s3) ((q89) xgi.c.h(j, obj));
        if (s3Var.b()) {
            return s3Var;
        }
        xud xudVar = (xud) s3Var;
        int size = xudVar.size();
        xud xudVarL = xudVar.l(size == 0 ? 10 : size * 2);
        xgi.o(j, obj, xudVarL);
        return xudVarL;
    }
}
