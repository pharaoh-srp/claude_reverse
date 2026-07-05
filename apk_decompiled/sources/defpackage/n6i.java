package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n6i {
    public static volatile lf5 e;
    public final wp3 a;
    public final wp3 b;
    public final gt5 c;
    public final wk d;

    public n6i(wp3 wp3Var, wp3 wp3Var2, gt5 gt5Var, wk wkVar, dpf dpfVar) {
        this.a = wp3Var;
        this.b = wp3Var2;
        this.c = gt5Var;
        this.d = wkVar;
        ((Executor) dpfVar.F).execute(new y0(12, dpfVar));
    }

    public static n6i a() {
        lf5 lf5Var = e;
        if (lf5Var != null) {
            return (n6i) ((ivd) lf5Var.I).get();
        }
        sz6.j("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (n6i.class) {
                try {
                    if (e == null) {
                        kf5 kf5Var = new kf5();
                        context.getClass();
                        kf5Var.a = context;
                        e = kf5Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final l6i c(g42 g42Var) {
        Set setUnmodifiableSet = g42Var instanceof g42 ? Collections.unmodifiableSet(g42.d) : Collections.singleton(new en6("proto"));
        fj0 fj0VarA = g91.a();
        g42Var.getClass();
        fj0VarA.E = "cct";
        String str = g42Var.a;
        String str2 = g42Var.b;
        if (str2 == null) {
            str2 = "";
        }
        fj0VarA.F = ij0.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new l6i(setUnmodifiableSet, fj0VarA.h(), this);
    }
}
