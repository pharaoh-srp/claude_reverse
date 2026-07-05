package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jwe {
    public final cf a;
    public final fs5 b;
    public final f4e c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public jwe(cf cfVar, fs5 fs5Var, f4e f4eVar, boolean z) {
        List listL;
        fs5Var.getClass();
        this.a = cfVar;
        this.b = fs5Var;
        this.c = f4eVar;
        this.d = z;
        lm6 lm6Var = lm6.E;
        this.e = lm6Var;
        this.g = lm6Var;
        this.h = new ArrayList();
        vs8 vs8Var = cfVar.h;
        f4eVar.I.o(f4eVar, vs8Var);
        URI uriJ = vs8Var.j();
        if (uriJ.getHost() == null) {
            listL = blj.l(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = cfVar.g.select(uriJ);
            List<Proxy> list = listSelect;
            listL = (list == null || list.isEmpty()) ? blj.l(new Proxy[]{Proxy.NO_PROXY}) : blj.k(listSelect);
        }
        this.e = listL;
        this.f = 0;
        f4eVar.I.n(f4eVar, vs8Var, this.e);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
