package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tmc {
    public static final d4h a = d4h.b("dm");
    public static final d4h b = d4h.b("tid");

    static {
        d4h.b("upstream_services");
    }

    public static int d(int i, d4h d4hVar, g4h g4hVar) {
        if (g4hVar == null) {
            return i;
        }
        if (i > 0) {
            i++;
        }
        int length = g4hVar.length() + d4hVar.E.length() + i + 1;
        a4h a4hVar = a4h.DATADOG;
        return length + 6;
    }

    public abstract int a(StringBuilder sb, umc umcVar);

    public abstract int b(StringBuilder sb, umc umcVar, int i);

    public abstract int c(StringBuilder sb, b4h b4hVar, b4h b4hVar2, int i);

    public abstract int e(umc umcVar);

    public abstract boolean f(int i, StringBuilder sb);

    public abstract boolean g(int i);
}
