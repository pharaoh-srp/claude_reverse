package defpackage;

import android.content.Context;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ns5 {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public ns5(gr5 gr5Var, bm4 bm4Var) {
        this.c = gr5Var;
        this.g = bm4Var;
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = true;
        this.a = 3;
    }

    public static ns5 c(ns5 ns5Var, int i, jx8 jx8Var, j8g j8gVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ns5Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            jx8Var = (jx8) ns5Var.e;
        }
        jx8 jx8Var2 = jx8Var;
        if ((i2 & 4) != 0) {
            j8gVar = (j8g) ns5Var.f;
        }
        return new ns5((jx8) ns5Var.c, (List) ns5Var.d, i3, jx8Var2, j8gVar, (tqh) ns5Var.g, ns5Var.b);
    }

    public void a(jx8 jx8Var, g89 g89Var) {
        Context context = jx8Var.a;
        jx8 jx8Var2 = (jx8) this.c;
        if (context != jx8Var2.a) {
            sz6.o(g89Var, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (jx8Var.b == j9c.a) {
            sz6.o(g89Var, "' cannot set the request's data to null.", "Interceptor '");
        } else if (jx8Var.c != jx8Var2.c) {
            sz6.o(g89Var, "' cannot modify the request's target.", "Interceptor '");
        } else {
            if (jx8Var.q == jx8Var2.q) {
                return;
            }
            sz6.o(g89Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    public void b(kx8 kx8Var, oo6 oo6Var) {
        Context context = kx8Var.a;
        kx8 kx8Var2 = (kx8) this.c;
        if (context != kx8Var2.a) {
            sz6.o(oo6Var, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (kx8Var.b == lyk.S) {
            sz6.o(oo6Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (kx8Var.c != kx8Var2.c) {
            sz6.o(oo6Var, "' cannot modify the request's target.", "Interceptor '");
        } else if (kx8Var.u != kx8Var2.u) {
            sz6.o(oo6Var, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (kx8Var.v == kx8Var2.v) {
                return;
            }
            sz6.o(oo6Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    public tqh d() {
        return (tqh) this.g;
    }

    public y7b e(int i) {
        nyg ms5Var;
        HashMap map = (HashMap) this.e;
        y7b y7bVar = (y7b) map.get(Integer.valueOf(i));
        if (y7bVar != null) {
            return y7bVar;
        }
        HashMap map2 = (HashMap) this.d;
        nyg nygVar = (nyg) map2.get(Integer.valueOf(i));
        if (nygVar == null) {
            final qg5 qg5Var = (qg5) this.f;
            qg5Var.getClass();
            final int i2 = 0;
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i != 2) {
                        final int i5 = 3;
                        if (i == 3) {
                            ms5Var = new ms5(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(y7b.class));
                        } else if (i == 4) {
                            nygVar = new nyg() { // from class: ls5
                                @Override // defpackage.nyg
                                public final Object get() {
                                    int i6 = i5;
                                    qg5 qg5Var2 = qg5Var;
                                    Object obj = this;
                                    switch (i6) {
                                        case 0:
                                            return os5.e((Class) obj, qg5Var2);
                                        case 1:
                                            return os5.e((Class) obj, qg5Var2);
                                        case 2:
                                            return os5.e((Class) obj, qg5Var2);
                                        default:
                                            return new gkd(qg5Var2, (gr5) ((ns5) obj).c);
                                    }
                                }
                            };
                        } else {
                            sz6.p(grc.p(i, "Unrecognized contentType: "));
                            nygVar = null;
                        }
                    } else {
                        final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(y7b.class);
                        ms5Var = new nyg() { // from class: ls5
                            @Override // defpackage.nyg
                            public final Object get() {
                                int i6 = i4;
                                qg5 qg5Var2 = qg5Var;
                                Object obj = genericDeclarationAsSubclass;
                                switch (i6) {
                                    case 0:
                                        return os5.e((Class) obj, qg5Var2);
                                    case 1:
                                        return os5.e((Class) obj, qg5Var2);
                                    case 2:
                                        return os5.e((Class) obj, qg5Var2);
                                    default:
                                        return new gkd(qg5Var2, (gr5) ((ns5) obj).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(y7b.class);
                    ms5Var = new nyg() { // from class: ls5
                        @Override // defpackage.nyg
                        public final Object get() {
                            int i6 = i3;
                            qg5 qg5Var2 = qg5Var;
                            Object obj = genericDeclarationAsSubclass2;
                            switch (i6) {
                                case 0:
                                    return os5.e((Class) obj, qg5Var2);
                                case 1:
                                    return os5.e((Class) obj, qg5Var2);
                                case 2:
                                    return os5.e((Class) obj, qg5Var2);
                                default:
                                    return new gkd(qg5Var2, (gr5) ((ns5) obj).c);
                            }
                        }
                    };
                }
                nygVar = ms5Var;
            } else {
                final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(y7b.class);
                nygVar = new nyg() { // from class: ls5
                    @Override // defpackage.nyg
                    public final Object get() {
                        int i6 = i2;
                        qg5 qg5Var2 = qg5Var;
                        Object obj = genericDeclarationAsSubclass3;
                        switch (i6) {
                            case 0:
                                return os5.e((Class) obj, qg5Var2);
                            case 1:
                                return os5.e((Class) obj, qg5Var2);
                            case 2:
                                return os5.e((Class) obj, qg5Var2);
                            default:
                                return new gkd(qg5Var2, (gr5) ((ns5) obj).c);
                        }
                    }
                };
            }
            map2.put(Integer.valueOf(i), nygVar);
        }
        y7b y7bVar2 = (y7b) nygVar.get();
        y7bVar2.a((bm4) this.g);
        y7bVar2.b(this.b);
        y7bVar2.d(this.a);
        map.put(Integer.valueOf(i), y7bVar2);
        return y7bVar2;
    }

    public jx8 f() {
        return (jx8) this.e;
    }

    public j8g g() {
        return (j8g) this.f;
    }

    public boolean h() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.vp4 r7) {
        /*
            r6 = this;
            int r0 = r6.a
            boolean r1 = r7 instanceof defpackage.t4e
            if (r1 == 0) goto L15
            r1 = r7
            t4e r1 = (defpackage.t4e) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            t4e r1 = new t4e
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.F
            int r2 = r1.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            g89 r0 = r1.E
            defpackage.sf5.h0(r7)
            goto L53
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r6.d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r0)
            g89 r7 = (defpackage.g89) r7
            int r0 = r0 + r4
            r2 = 6
            ns5 r0 = c(r6, r0, r3, r3, r2)
            r1.E = r7
            r1.H = r4
            java.lang.Object r0 = r7.a(r0, r1)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L50
            return r1
        L50:
            r5 = r0
            r0 = r7
            r7 = r5
        L53:
            sx8 r7 = (defpackage.sx8) r7
            jx8 r1 = r7.a()
            r6.a(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns5.i(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.kx8 r18, defpackage.vp4 r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.Object r2 = r0.d
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            int r4 = r0.a
            boolean r5 = r1 instanceof defpackage.u4e
            if (r5 == 0) goto L1e
            r5 = r1
            u4e r5 = (defpackage.u4e) r5
            int r6 = r5.I
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1e
            int r6 = r6 - r7
            r5.I = r6
            goto L23
        L1e:
            u4e r5 = new u4e
            r5.<init>(r0, r1)
        L23:
            java.lang.Object r1 = r5.G
            int r6 = r5.I
            r7 = 1
            if (r6 == 0) goto L41
            if (r6 != r7) goto L3a
            oo6 r0 = r5.F
            ns5 r2 = r5.E
            defpackage.sf5.h0(r1)
            r16 = r1
            r1 = r0
            r0 = r2
            r2 = r16
            goto L86
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L41:
            defpackage.sf5.h0(r1)
            if (r4 <= 0) goto L54
            int r1 = r4 + (-1)
            java.lang.Object r1 = r3.get(r1)
            oo6 r1 = (defpackage.oo6) r1
            r12 = r18
            r0.b(r12, r1)
            goto L56
        L54:
            r12 = r18
        L56:
            java.lang.Object r1 = r3.get(r4)
            oo6 r1 = (defpackage.oo6) r1
            int r11 = r4 + 1
            java.lang.Object r3 = r0.f
            r13 = r3
            i8g r13 = (defpackage.i8g) r13
            ns5 r8 = new ns5
            java.lang.Object r3 = r0.c
            r9 = r3
            kx8 r9 = (defpackage.kx8) r9
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.g
            r14 = r2
            rz6 r14 = (defpackage.rz6) r14
            boolean r15 = r0.b
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r5.E = r0
            r5.F = r1
            r5.I = r7
            java.lang.Object r2 = r1.d(r8, r5)
            m45 r3 = defpackage.m45.E
            if (r2 != r3) goto L86
            return r3
        L86:
            tx8 r2 = (defpackage.tx8) r2
            kx8 r3 = r2.b()
            r0.b(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns5.j(kx8, vp4):java.lang.Object");
    }

    public ns5 k(jx8 jx8Var) {
        int i = this.a;
        if (i > 0) {
            a(jx8Var, (g89) ((List) this.d).get(i - 1));
        }
        return c(this, 0, jx8Var, null, 5);
    }

    public ns5 l(j8g j8gVar) {
        return c(this, 0, null, j8gVar, 3);
    }

    public /* synthetic */ ns5(Object obj, List list, int i, Object obj2, Object obj3, Object obj4, boolean z) {
        this.c = obj;
        this.d = list;
        this.a = i;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = z;
    }
}
