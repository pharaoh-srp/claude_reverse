package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z4e {
    public final q7h a;
    public final ak6 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final cf j;
    public final fs5 k;
    public final f4e l;
    public final boolean m;
    public mrb n;
    public jwe o;
    public fwe p;
    public final qo0 q;

    public z4e(q7h q7hVar, ak6 ak6Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, cf cfVar, fs5 fs5Var, f4e f4eVar, kie kieVar) {
        q7hVar.getClass();
        ak6Var.getClass();
        fs5Var.getClass();
        this.a = q7hVar;
        this.b = ak6Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = cfVar;
        this.k = fs5Var;
        this.l = f4eVar;
        this.m = !x44.r(kieVar.b, "GET");
        this.q = new qo0();
    }

    public final boolean a(g4e g4eVar) {
        jwe jweVar;
        fwe fweVar;
        if (this.q.isEmpty() && this.p == null) {
            if (g4eVar != null) {
                synchronized (g4eVar) {
                    fweVar = null;
                    if (g4eVar.m == 0 && g4eVar.k && blj.a(g4eVar.c.a.h, this.j.h)) {
                        fweVar = g4eVar.c;
                    }
                }
                if (fweVar != null) {
                    this.p = fweVar;
                    return true;
                }
            }
            mrb mrbVar = this.n;
            if ((mrbVar == null || mrbVar.b >= mrbVar.a.size()) && (jweVar = this.o) != null) {
                return jweVar.a();
            }
        }
        return true;
    }

    public final hwe b() {
        Socket socketK;
        yre yreVar;
        ng4 ng4VarC;
        String hostAddress;
        int port;
        List listB;
        boolean zContains;
        g4e g4eVar = this.l.N;
        if (g4eVar == null) {
            yreVar = null;
        } else {
            boolean zG = g4eVar.g(this.m);
            synchronized (g4eVar) {
                boolean z = g4eVar.k;
                try {
                    if (!zG) {
                        g4eVar.k = true;
                        socketK = this.l.k();
                    } else if (!z) {
                        vs8 vs8Var = g4eVar.c.a.h;
                        vs8Var.getClass();
                        vs8 vs8Var2 = this.j.h;
                        socketK = !(vs8Var.e == vs8Var2.e && x44.r(vs8Var.d, vs8Var2.d)) ? this.l.k() : null;
                    }
                } finally {
                }
            }
            if (this.l.N == null) {
                if (socketK != null) {
                    blj.d(socketK);
                }
                this.l.I.k(this.l, g4eVar);
                yreVar = null;
            } else {
                if (socketK != null) {
                    sz6.j("Check failed.");
                    return null;
                }
                yreVar = new yre(g4eVar);
            }
        }
        if (yreVar != null) {
            return yreVar;
        }
        yre yreVarD = d(null, null);
        if (yreVarD != null) {
            return yreVarD;
        }
        if (!this.q.isEmpty()) {
            return (hwe) this.q.removeFirst();
        }
        fwe fweVar = this.p;
        if (fweVar != null) {
            this.p = null;
            ng4VarC = c(fweVar, null);
        } else {
            mrb mrbVar = this.n;
            if (mrbVar == null || mrbVar.b >= mrbVar.a.size()) {
                jwe jweVar = this.o;
                if (jweVar == null) {
                    jweVar = new jwe(this.j, this.k, this.l, this.i);
                    this.o = jweVar;
                }
                if (!jweVar.a()) {
                    xh6.c("exhausted all routes");
                    return null;
                }
                if (!jweVar.a()) {
                    pmf.d();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (jweVar.f < jweVar.e.size()) {
                    if (jweVar.f >= jweVar.e.size()) {
                        throw new SocketException("No route to " + jweVar.a.h.d + "; exhausted proxy configurations: " + jweVar.e);
                    }
                    List list = jweVar.e;
                    int i = jweVar.f;
                    jweVar.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    jweVar.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        vs8 vs8Var3 = jweVar.a.h;
                        hostAddress = vs8Var3.d;
                        port = vs8Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            mr9.t("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        ide ideVar = tkj.a;
                        hostAddress.getClass();
                        if (tkj.a.f(hostAddress)) {
                            listB = x44.W(InetAddress.getByName(hostAddress));
                        } else {
                            jweVar.c.I.m(jweVar.c, hostAddress);
                            listB = jweVar.a.a.b(hostAddress);
                            if (listB.isEmpty()) {
                                throw new UnknownHostException(jweVar.a.a + " returned no addresses for " + hostAddress);
                            }
                            jweVar.c.I.l(jweVar.c, hostAddress, listB);
                        }
                        if (jweVar.d && listB.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listB) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = zkj.a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                d8a d8aVarE = x44.E();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        d8aVarE.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        d8aVarE.add(it2.next());
                                    }
                                }
                                listB = x44.v(d8aVarE);
                            }
                        }
                        Iterator it3 = listB.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = jweVar.g.iterator();
                    while (it4.hasNext()) {
                        fwe fweVar2 = new fwe(jweVar.a, proxy, (InetSocketAddress) it4.next());
                        fs5 fs5Var = jweVar.b;
                        synchronized (fs5Var) {
                            zContains = fs5Var.a.contains(fweVar2);
                        }
                        if (zContains) {
                            jweVar.h.add(fweVar2);
                        } else {
                            arrayList.add(fweVar2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    b54.t0(arrayList, jweVar.h);
                    jweVar.h.clear();
                }
                mrb mrbVar2 = new mrb(arrayList);
                this.n = mrbVar2;
                if (this.l.V) {
                    xh6.c("Canceled");
                    return null;
                }
                if (mrbVar2.b >= arrayList.size()) {
                    pmf.d();
                    return null;
                }
                int i2 = mrbVar2.b;
                mrbVar2.b = i2 + 1;
                ng4VarC = c((fwe) arrayList.get(i2), arrayList);
            } else {
                int i3 = mrbVar.b;
                ArrayList arrayList5 = mrbVar.a;
                if (i3 >= arrayList5.size()) {
                    pmf.d();
                    return null;
                }
                int i4 = mrbVar.b;
                mrbVar.b = i4 + 1;
                ng4VarC = c((fwe) arrayList5.get(i4), null);
            }
        }
        yre yreVarD2 = d(ng4VarC, ng4VarC.l);
        return yreVarD2 != null ? yreVarD2 : ng4VarC;
    }

    public final ng4 c(fwe fweVar, ArrayList arrayList) throws UnknownServiceException {
        bvd bvdVar = bvd.H2_PRIOR_KNOWLEDGE;
        fweVar.getClass();
        cf cfVar = fweVar.a;
        if (cfVar.c == null) {
            if (!cfVar.j.contains(jh4.g)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = fweVar.a.h.d;
            s4d s4dVar = s4d.a;
            if (!s4d.a.h(str)) {
                throw new UnknownServiceException(ij0.j("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (cfVar.i.contains(bvdVar)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        kie kieVar = null;
        if (fweVar.b.type() == Proxy.Type.HTTP) {
            cf cfVar2 = fweVar.a;
            if (cfVar2.c != null || cfVar2.i.contains(bvdVar)) {
                jie jieVar = new jie();
                vs8 vs8Var = fweVar.a.h;
                vs8Var.getClass();
                jieVar.a = vs8Var;
                jieVar.e("CONNECT", null);
                cf cfVar3 = fweVar.a;
                jieVar.d("Host", blj.j(cfVar3.h, true));
                jieVar.d("Proxy-Connection", "Keep-Alive");
                jieVar.d("User-Agent", "okhttp/5.4.0");
                kieVar = new kie(jieVar);
                qqe qqeVar = rqe.E;
                gmf gmfVar = new gmf(16);
                skj.c("Proxy-Authenticate");
                skj.d("OkHttp-Preemptive", "Proxy-Authenticate");
                gmfVar.J("Proxy-Authenticate");
                skj.a(gmfVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                gmfVar.v();
                qqeVar.getClass();
                cfVar3.f.getClass();
            }
        }
        return new ng4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, fweVar, arrayList, kieVar, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yre d(defpackage.ng4 r11, java.util.List r12) {
        /*
            r10 = this;
            ak6 r0 = r10.b
            boolean r1 = r10.m
            cf r2 = r10.j
            f4e r3 = r10.l
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.a()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.lang.Object r0 = r0.e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L23:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r0.next()
            g4e r7 = (defpackage.g4e) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L43
            zr8 r9 = r7.j     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L3c
            r9 = r5
            goto L3d
        L3c:
            r9 = r4
        L3d:
            if (r9 != 0) goto L43
        L3f:
            r9 = r4
            goto L4e
        L41:
            r10 = move-exception
            goto L69
        L43:
            boolean r9 = r7.d(r2, r12)     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto L4a
            goto L3f
        L4a:
            r3.b(r7)     // Catch: java.lang.Throwable -> L41
            r9 = r5
        L4e:
            monitor-exit(r7)
            if (r9 == 0) goto L23
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L58
            goto L6c
        L58:
            monitor-enter(r7)
            r7.k = r5     // Catch: java.lang.Throwable -> L66
            java.net.Socket r8 = r3.k()     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)
            if (r8 == 0) goto L23
            defpackage.blj.d(r8)
            goto L23
        L66:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L69:
            monitor-exit(r7)
            throw r10
        L6b:
            r7 = r8
        L6c:
            if (r7 != 0) goto L6f
            return r8
        L6f:
            if (r11 == 0) goto L7c
            fwe r12 = r11.k
            r10.p = r12
            java.net.Socket r11 = r11.r
            if (r11 == 0) goto L7c
            defpackage.blj.d(r11)
        L7c:
            f4e r11 = r10.l
            tz6 r11 = r11.I
            f4e r10 = r10.l
            r11.j(r10, r7)
            yre r10 = new yre
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4e.d(ng4, java.util.List):yre");
    }
}
