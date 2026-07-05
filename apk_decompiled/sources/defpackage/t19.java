package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t19 {
    public final tc6 a;
    public o19 b;
    public r19 c;
    public q19 d;
    public p19 e;
    public gvk f;
    public fnf g;
    public long h = 9205357640488583168L;
    public xg8 i;
    public final at j;
    public final at k;
    public long l;

    public t19(tc6 tc6Var) {
        this.a = tc6Var;
        at atVar = new at(3, false);
        atVar.G = new qvb();
        this.j = atVar;
        at atVar2 = new at(8, false);
        atVar2.G = new dvb();
        this.k = atVar2;
        this.l = 0L;
    }

    public static void c(t19 t19Var, m19 m19Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        tc6 tc6Var = t19Var.a;
        q19 q19Var = t19Var.d;
        if (q19Var == null) {
            q19Var = new q19();
            q19Var.b = null;
            q19Var.c = Long.MAX_VALUE;
            q19Var.d = false;
            t19Var.d = q19Var;
        }
        q19Var.b = m19Var;
        q19Var.c = j;
        xg8 xg8Var = t19Var.i;
        ukc ukcVar = tc6Var.U;
        if (xg8Var == null) {
            t19Var.i = new xg8(ukcVar, 2);
        } else {
            xg8Var.F = ukcVar;
            xg8Var.E = j2;
        }
        q19Var.d = false;
        t19Var.f = q19Var;
    }

    public final void a() {
        o19 o19Var = this.b;
        n19 n19Var = n19.G;
        if (o19Var == null) {
            o19Var = new o19();
            o19Var.b = n19Var;
            o19Var.c = false;
            this.b = o19Var;
        }
        o19Var.b = n19Var;
        o19Var.c = false;
        this.f = o19Var;
    }

    public final void b(m19 m19Var, long j, xg8 xg8Var) {
        p19 p19Var = this.e;
        if (p19Var == null) {
            p19Var = new p19();
            p19Var.b = null;
            p19Var.c = Long.MAX_VALUE;
            this.e = p19Var;
        }
        p19Var.b = m19Var;
        p19Var.c = j;
        xg8Var.E = 0L;
        this.f = p19Var;
    }

    public final void d(s20 s20Var, u7d u7dVar) {
        Object obj;
        Object obj2;
        boolean z;
        u7d u7dVar2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = s20Var.E;
        ArrayList arrayList = (ArrayList) s20Var.F;
        if (this.f == null) {
            o19 o19Var = this.b;
            if (o19Var == null) {
                o19Var = new o19();
                o19Var.b = n19.G;
                o19Var.c = false;
                this.b = o19Var;
            }
            this.f = o19Var;
        }
        gvk gvkVar = this.f;
        if (gvkVar == null) {
            sz6.p("currentDragState should not be null");
            return;
        }
        boolean z2 = gvkVar instanceof o19;
        u7d u7dVar3 = u7d.E;
        u7d u7dVar4 = u7d.F;
        tc6 tc6Var = this.a;
        if (z2) {
            o19 o19Var2 = (o19) gvkVar;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!xb5.f((m19) arrayList.get(i2))) {
                    return;
                }
            }
            m19 m19Var = (m19) w44.L0(arrayList);
            int i3 = s19.a[o19Var2.b.ordinal()];
            n19 n19Var = n19.F;
            n19 n19Var2 = n19.E;
            n19 n19Var3 = i3 == 1 ? !tc6Var.H1() ? n19Var2 : n19Var : o19Var2.b;
            o19Var2.b = n19Var3;
            if (u7dVar == u7dVar3 && n19Var3 == n19Var) {
                m19Var.i = true;
                o19Var2.c = true;
            }
            if (u7dVar == u7dVar4) {
                if (n19Var3 == n19Var2) {
                    c(this, m19Var, m19Var.a, 0L, 12);
                    return;
                }
                if (o19Var2.c) {
                    h(m19Var, m19Var, new l19(i), 0L);
                    g(m19Var, new l19(i), 0L);
                    long j = m19Var.a;
                    r19 r19Var = this.c;
                    if (r19Var == null) {
                        r19Var = new r19();
                        r19Var.b = Long.MAX_VALUE;
                        this.c = r19Var;
                    }
                    r19Var.b = j;
                    this.f = r19Var;
                    return;
                }
                return;
            }
            return;
        }
        boolean z3 = gvkVar instanceof q19;
        u7d u7dVar5 = u7d.G;
        if (!z3) {
            if (gvkVar instanceof p19) {
                p19 p19Var = (p19) gvkVar;
                if (u7dVar != u7dVar5) {
                    return;
                }
                int size2 = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        z = true;
                        break;
                    } else {
                        if (((m19) arrayList.get(i4)).i) {
                            z = false;
                            break;
                        }
                        i4++;
                    }
                }
                int size3 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        break;
                    }
                    if (!((m19) arrayList.get(i5)).d) {
                        i5++;
                    } else if (!arrayList.isEmpty()) {
                        if (z) {
                            long jO = xb5.o((m19) w44.L0(arrayList), tc6Var.U, new l19(i));
                            m19 m19Var2 = p19Var.b;
                            m19Var2.getClass();
                            long jH = fcc.h(jO, xb5.o(m19Var2, tc6Var.U, new l19(i)));
                            m19 m19Var3 = p19Var.b;
                            if (m19Var3 != null) {
                                c(this, m19Var3, p19Var.c, jH, 8);
                                return;
                            } else {
                                sz6.p("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                        }
                        return;
                    }
                }
                a();
                return;
            }
            if (!(gvkVar instanceof r19)) {
                wg6.i();
                return;
            }
            r19 r19Var2 = (r19) gvkVar;
            if (u7dVar != u7dVar4) {
                return;
            }
            long j2 = r19Var2.b;
            int size4 = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size4) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i6);
                if (csg.u(((m19) obj).a, j2)) {
                    break;
                } else {
                    i6++;
                }
            }
            m19 m19Var4 = (m19) obj;
            if (m19Var4 == null) {
                return;
            }
            boolean zD = xb5.d(m19Var4);
            zb6 zb6Var = zb6.a;
            if (!zD) {
                if (m19Var4.i) {
                    tc6Var.A1(zb6Var);
                    return;
                } else {
                    if (fcc.d(xb5.n(m19Var4, tc6Var.U, new l19(i), true)) == MTTypesetterKt.kLineSkipLimitMultiplier) {
                        return;
                    }
                    g(m19Var4, new l19(i), xb5.n(m19Var4, tc6Var.U, new l19(i), false));
                    m19Var4.i = true;
                    return;
                }
            }
            int size5 = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size5) {
                    obj2 = null;
                    break;
                }
                Object obj6 = arrayList.get(i7);
                if (((m19) obj6).d) {
                    obj2 = obj6;
                    break;
                }
                i7++;
            }
            m19 m19Var5 = (m19) obj2;
            if (m19Var5 != null) {
                r19Var2.b = m19Var5.a;
                return;
            }
            if (m19Var4.i || !xb5.d(m19Var4)) {
                tc6Var.A1(zb6Var);
            } else {
                xb5.c(e(), m19Var4, tc6Var.U, new l19(i), this.j, this.l);
                float fE = ((ovi) yb5.o(tc6Var, ve4.u)).e();
                long jG = e().g(lvj.e(fE, fE));
                e().l();
                tc6Var.A1(new cc6(nd6.c(jG), true));
            }
            a();
            return;
        }
        q19 q19Var = (q19) gvkVar;
        if (u7dVar == u7dVar3) {
            return;
        }
        int size6 = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size6) {
                u7dVar2 = u7dVar5;
                obj3 = null;
                break;
            }
            obj3 = arrayList.get(i8);
            u7dVar2 = u7dVar5;
            if (csg.u(((m19) obj3).a, q19Var.c)) {
                break;
            }
            i8++;
            u7dVar5 = u7dVar2;
        }
        m19 m19Var6 = (m19) obj3;
        if (m19Var6 == null) {
            int size7 = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size7) {
                    obj5 = null;
                    break;
                }
                obj5 = arrayList.get(i9);
                if (((m19) obj5).d) {
                    break;
                } else {
                    i9++;
                }
            }
            m19Var6 = (m19) obj5;
            if (m19Var6 == null) {
                a();
                return;
            }
            q19Var.c = m19Var6.a;
        }
        m19 m19Var7 = m19Var6;
        if (u7dVar == u7dVar4) {
            if (m19Var7.i) {
                m19 m19Var8 = q19Var.b;
                if (m19Var8 == null) {
                    sz6.p("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j3 = q19Var.c;
                xg8 xg8Var = this.i;
                if (xg8Var == null) {
                    sz6.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                b(m19Var8, j3, xg8Var);
            } else if (xb5.d(m19Var7)) {
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj4 = null;
                        break;
                    }
                    obj4 = arrayList.get(i10);
                    if (((m19) obj4).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                m19 m19Var9 = (m19) obj4;
                if (m19Var9 == null) {
                    a();
                } else {
                    q19Var.c = m19Var9.a;
                }
            } else {
                ovi oviVar = (ovi) yb5.o(tc6Var, ve4.u);
                float f = nc6.a;
                float f2 = oviVar.f();
                xg8 xg8Var2 = this.i;
                if (xg8Var2 == null) {
                    sz6.p("Touch slop detector not initialized.");
                    return;
                }
                long jR = xg8Var2.r(f2, xb5.n(m19Var7, tc6Var.U, new l19(i), true), true);
                if ((9223372034707292159L & jR) != 9205357640488583168L) {
                    m19Var7.i = true;
                    m19 m19Var10 = q19Var.b;
                    m19Var10.getClass();
                    h(m19Var10, m19Var7, new l19(i), jR);
                    g(m19Var7, new l19(i), jR);
                    long j4 = m19Var7.a;
                    r19 r19Var3 = this.c;
                    if (r19Var3 == null) {
                        r19Var3 = new r19();
                        r19Var3.b = Long.MAX_VALUE;
                        this.c = r19Var3;
                    }
                    r19Var3.b = j4;
                    this.f = r19Var3;
                } else {
                    q19Var.d = true;
                }
            }
        }
        if (u7dVar == u7dVar2 && q19Var.d) {
            if (!m19Var7.i) {
                q19Var.d = false;
                return;
            }
            m19 m19Var11 = q19Var.b;
            if (m19Var11 == null) {
                sz6.p("AwaitTouchSlop.initialDown was not initialized");
                return;
            }
            long j5 = q19Var.c;
            xg8 xg8Var3 = this.i;
            if (xg8Var3 != null) {
                b(m19Var11, j5, xg8Var3);
            } else {
                sz6.p("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
        }
    }

    public final fnf e() {
        fnf fnfVar = this.g;
        if (fnfVar != null) {
            return fnfVar;
        }
        sz6.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void f() {
        a();
        tc6 tc6Var = this.a;
        if (tc6Var.b0) {
            tc6Var.A1(zb6.a);
        }
        this.g = null;
        at atVar = this.k;
        atVar.F = 0;
        ((dvb) atVar.G).b = 0;
    }

    public final void g(m19 m19Var, l19 l19Var, long j) {
        tc6 tc6Var = this.a;
        long jQ = yfd.V(tc6Var).q(0L);
        if (!fcc.c(this.h, 9205357640488583168L) && !fcc.c(jQ, this.h)) {
            this.l = fcc.i(this.l, fcc.h(jQ, this.h));
        }
        this.h = jQ;
        ukc ukcVar = tc6Var.U;
        ukcVar.getClass();
        id6 id6Var = nd6.a;
        if (Math.abs(Float.intBitsToFloat((int) (ukcVar == ukc.E ? j & 4294967295L : j >> 32))) > 2.0f) {
            xb5.c(e(), m19Var, tc6Var.U, l19Var, this.j, this.l);
            at atVar = this.k;
            dvb dvbVar = (dvb) atVar.G;
            int i = dvbVar.b;
            if (i == 3) {
                int i2 = atVar.F;
                atVar.F = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    xh6.j("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = dvbVar.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                dvbVar.a(j);
            }
            if (atVar.F == 3) {
                atVar.F = 0;
            }
            long[] jArr2 = dvbVar.a;
            int i3 = dvbVar.b;
            float fIntBitsToFloat = MTTypesetterKt.kLineSkipLimitMultiplier;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = dvbVar.b;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = dvbVar.a;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            tc6Var.A1(new ac6((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / dvbVar.b)) & 4294967295L), true));
        }
    }

    public final void h(m19 m19Var, m19 m19Var2, l19 l19Var, long j) {
        if (this.g == null) {
            this.g = new fnf(10);
        }
        this.l = 0L;
        fnf fnfVarE = e();
        tc6 tc6Var = this.a;
        xb5.c(fnfVarE, m19Var, tc6Var.U, l19Var, this.j, this.l);
        long jH = fcc.h(xb5.o(m19Var2, tc6Var.U, l19Var), j);
        if (((Boolean) tc6Var.V.invoke(new j8d(1))).booleanValue()) {
            this.h = yfd.V(tc6Var).q(0L);
            tc6Var.A1(new bc6(jH));
        }
        at atVar = this.k;
        atVar.F = 0;
        ((dvb) atVar.G).b = 0;
    }
}
