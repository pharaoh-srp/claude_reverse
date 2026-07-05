package defpackage;

import io.sentry.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l6i implements k6i {
    public final Set a;
    public final g91 b;
    public final n6i c;

    public l6i(Set set, g91 g91Var, n6i n6iVar) {
        this.a = set;
        this.b = g91Var;
        this.c = n6iVar;
    }

    public final m6i a(String str, en6 en6Var, j5i j5iVar) {
        Set set = this.a;
        if (set.contains(en6Var)) {
            return new m6i(this.b, str, en6Var, j5iVar, this.c);
        }
        e0.g("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{en6Var, set});
        return null;
    }
}
