package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RepositoryListingFailed;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.sessions.types.GitHubRepo;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xhe {
    public final jwf a;
    public final a b;
    public final h86 c;
    public final qi3 d;
    public final String e;
    public final f1c f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;

    public xhe(jwf jwfVar, a aVar, h86 h86Var, qi3 qi3Var, String str, f1c f1cVar) {
        str.getClass();
        this.a = jwfVar;
        this.b = aVar;
        this.c = h86Var;
        this.d = qi3Var;
        this.e = str;
        this.f = f1cVar;
        this.g = mpk.P(lm6.E);
        Boolean bool = Boolean.FALSE;
        this.h = mpk.P(bool);
        this.i = mpk.P(bool);
        this.j = mpk.P(null);
        this.k = mpk.P(aVar.e());
    }

    public final Object a(GitHubRepo gitHubRepo, z55 z55Var) {
        return gb9.c0(this.c.b(), new o6e(gitHubRepo, this, null, 3), z55Var);
    }

    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final List c() {
        return (List) this.g.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhe.e(vp4):java.lang.Object");
    }

    public final void f(Throwable th) {
        if (this.f.b() && !(th instanceof UnknownHostException)) {
            this.d.e(new CodeEvents$RepositoryListingFailed(this.e, ltk.n(th)), CodeEvents$RepositoryListingFailed.Companion.serializer());
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.WARN, strE, "Repository listing failed while offline; skipping *_listing_failed telemetry");
            }
        }
    }
}
