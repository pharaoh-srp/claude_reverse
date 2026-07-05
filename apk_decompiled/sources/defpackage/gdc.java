package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class gdc {
    public int A;
    public int B;
    public long C;
    public fs5 D;
    public q7h E;
    public gmf b;
    public cd e;
    public boolean f;
    public boolean g;
    public ql8 h;
    public boolean i;
    public boolean j;
    public i25 k;
    public m96 l;
    public ProxySelector m;
    public ql8 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public ycc t;
    public jg2 u;
    public zh4 v;
    public int w;
    public int x;
    public int y;
    public int z;
    public dpf a = new dpf(11);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public gdc() {
        TimeZone timeZone = blj.a;
        this.e = new cd(17, tz6.a);
        this.f = true;
        this.g = true;
        ql8 ql8Var = ql8.F;
        this.h = ql8Var;
        this.i = true;
        this.j = true;
        this.k = i25.a;
        this.l = m96.h;
        this.n = ql8Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.r = hdc.G;
        this.s = hdc.F;
        this.t = ycc.a;
        this.u = jg2.c;
        this.x = yr6.INVALID_OWNERSHIP;
        this.y = yr6.INVALID_OWNERSHIP;
        this.z = yr6.INVALID_OWNERSHIP;
        this.B = 60000;
        this.C = 1024L;
    }

    public final void a(List list) {
        if (!list.equals(this.r)) {
            this.D = null;
        }
        this.r = blj.k(list);
    }

    public final void b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        bvd bvdVar = bvd.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(bvdVar) && !arrayList.contains(bvd.HTTP_1_1)) {
            mr9.t("protocols must contain h2_prior_knowledge or http/1.1: ", arrayList);
            return;
        }
        if (arrayList.contains(bvdVar) && arrayList.size() > 1) {
            mr9.t("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayList);
            return;
        }
        if (arrayList.contains(bvd.HTTP_1_0)) {
            mr9.t("protocols must not contain http/1.0: ", arrayList);
            return;
        }
        if (arrayList.contains(null)) {
            sz6.p("protocols must not contain null");
            return;
        }
        arrayList.remove(bvd.SPDY_3);
        if (!arrayList.equals(this.s)) {
            this.D = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        this.s = listUnmodifiableList;
    }

    public final void c(long j) {
        this.y = blj.c(j);
    }
}
