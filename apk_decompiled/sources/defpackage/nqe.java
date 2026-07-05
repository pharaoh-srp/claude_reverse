package defpackage;

import okio.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class nqe {
    public kie a;
    public bvd b;
    public String d;
    public cf8 e;
    public Socket h;
    public pqe i;
    public pqe j;
    public pqe k;
    public long l;
    public long m;
    public w47 n;
    public int c = -1;
    public rqe g = rqe.E;
    public t4i o = t4i.t;
    public gmf f = new gmf(16);

    public static void b(String str, pqe pqeVar) {
        if (pqeVar != null) {
            if (pqeVar.M != null) {
                mr9.q(str.concat(".networkResponse != null"));
            } else if (pqeVar.N != null) {
                mr9.q(str.concat(".cacheResponse != null"));
            } else {
                if (pqeVar.O == null) {
                    return;
                }
                mr9.q(str.concat(".priorResponse != null"));
            }
        }
    }

    public final pqe a() {
        int i = this.c;
        if (i < 0) {
            mr9.v(this.c, "code < 0: ");
            return null;
        }
        kie kieVar = this.a;
        if (kieVar == null) {
            sz6.j("request == null");
            return null;
        }
        bvd bvdVar = this.b;
        if (bvdVar == null) {
            sz6.j("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new pqe(kieVar, bvdVar, str, i, this.e, this.f.v(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        sz6.j("message == null");
        return null;
    }
}
