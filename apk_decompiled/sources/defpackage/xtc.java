package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class xtc implements Cloneable {
    public final iq8 E;
    public final vsc F;
    public final wsc G;
    public f4h H;
    public final int I;

    public xtc(xtc xtcVar) {
        new ReentrantLock();
        xtcVar.E.getClass();
        this.E = new iq8();
        xtcVar.F.getClass();
        this.F = new vsc(0);
        wsc wscVar = xtcVar.G;
        this.G = new wsc(wscVar.a, wscVar.b);
        this.I = xtcVar.I;
        f4h f4hVarB = xtcVar.b();
        f4h f4hVar = f4hVarB.b;
        HashMap map = f4hVarB.a;
        ArrayList arrayList = f4hVarB.c;
        f4h f4hVar2 = new f4h(f4hVar, arrayList == null ? null : new ArrayList(arrayList));
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = new HashMap(((Map) entry.getValue()).size());
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    map2.put((String) entry2.getKey(), ((z3h) entry2.getValue()).clone());
                }
                f4hVar2.a.put((String) entry.getKey(), map2);
            }
        }
        this.H = f4hVar2;
    }

    public static o96 a(String str, String str2) {
        iq8 iq8Var;
        List listP;
        List list;
        o96 o96Var = new o96(str2, 0);
        yj6 yj6VarQ = o96Var.Q("html");
        yj6VarQ.Q("head");
        yj6VarQ.Q("body");
        yj6 yj6VarM0 = o96Var.m0();
        iq8Var = new iq8();
        StringReader stringReader = new StringReader(str);
        xtc xtcVar = new xtc(iq8Var);
        xtcVar.E.getClass();
        o96 o96Var2 = new o96(str2, 0);
        iq8Var.d = o96Var2;
        o96Var2.O = xtcVar;
        iq8Var.a = xtcVar;
        iq8Var.h = xtcVar.G;
        vi2 vi2Var = new vi2(stringReader);
        iq8Var.b = vi2Var;
        vsc vscVar = xtcVar.F;
        vscVar.getClass();
        vi2Var.N = null;
        vscVar.getClass();
        iq8Var.c = new msh(iq8Var);
        iq8Var.e = new ArrayList(32);
        iq8Var.i = xtcVar.b();
        dsh dshVar = new dsh(2, iq8Var);
        iq8Var.j = dshVar;
        iq8Var.g = dshVar;
        iq8Var.f = str2;
        tq8 tq8Var = hr8.E;
        iq8Var.l = tq8Var;
        iq8Var.m = null;
        iq8Var.n = false;
        iq8Var.o = null;
        iq8Var.p = null;
        iq8Var.q = null;
        iq8Var.r = new ArrayList();
        iq8Var.s = new ArrayList();
        iq8Var.t = new ArrayList();
        iq8Var.u = new csh(3, iq8Var);
        iq8Var.v = true;
        iq8Var.w = false;
        iq8Var.l = tq8Var;
        iq8Var.x = true;
        String str3 = yj6VarM0.H.G;
        iq8Var.q = new yj6(iq8Var.i.d(str3, str3, "http://www.w3.org/1999/xhtml", iq8Var.h.a), iq8Var.f, null);
        if (yj6VarM0.F() != null) {
            iq8Var.d.P = yj6VarM0.F().P;
        }
        switch (str3) {
            case "template":
                iq8Var.c.o(evh.E);
                iq8Var.L(hr8.V);
                break;
            case "script":
                iq8Var.c.o(evh.J);
                break;
            case "plaintext":
                iq8Var.c.o(evh.K);
                break;
            default:
                evh evhVarG = iq8Var.q.H.g();
                msh mshVar = iq8Var.c;
                if (evhVarG != null) {
                    mshVar.o(evhVarG);
                    break;
                } else {
                    mshVar.o(evh.E);
                    break;
                }
                break;
        }
        iq8Var.d.O(iq8Var.q);
        iq8Var.e.add(iq8Var.q);
        iq8Var.P();
        yj6 yj6Var = yj6VarM0;
        while (true) {
            if (yj6Var != null) {
                if (yj6Var instanceof gw7) {
                    iq8Var.p = (gw7) yj6Var;
                } else {
                    yj6Var = yj6Var.E;
                }
            }
        }
        while (true) {
            if (iq8Var.g.a == 7) {
                ArrayList arrayList = iq8Var.e;
                if (arrayList == null) {
                    vi2 vi2Var2 = iq8Var.b;
                    if (vi2Var2 != null) {
                        vi2Var2.close();
                        iq8Var.b = null;
                        iq8Var.c = null;
                        iq8Var.e = null;
                    }
                    yj6 yj6Var2 = iq8Var.q;
                    if (yj6Var2 != null) {
                        yj6 yj6Var3 = yj6Var2.E;
                        if (yj6Var3 == null) {
                            list = Collections.EMPTY_LIST;
                        } else {
                            ArrayList<c5c> arrayList2 = (ArrayList) yj6Var3.s();
                            ArrayList arrayList3 = new ArrayList(arrayList2.size() - 1);
                            for (c5c c5cVar : arrayList2) {
                                if (c5cVar != yj6Var2) {
                                    arrayList3.add(c5cVar);
                                }
                            }
                            list = arrayList3;
                        }
                        if (!list.isEmpty()) {
                            iq8Var.q.f0(list);
                        }
                        listP = iq8Var.q.p();
                    } else {
                        listP = iq8Var.d.p();
                    }
                    yj6VarM0.f0(listP);
                    return o96Var;
                }
                if (arrayList.isEmpty()) {
                    iq8Var.e = null;
                } else {
                    iq8Var.F();
                }
            } else {
                msh mshVar2 = iq8Var.c;
                yrh yrhVar = mshVar2.k;
                while (!mshVar2.e) {
                    mshVar2.c.d(mshVar2, mshVar2.a);
                }
                boolean zK = yrhVar.d.k();
                hsh hshVar = yrhVar;
                if (!zK) {
                    mshVar2.e = false;
                    hshVar = mshVar2.d;
                }
                iq8Var.g = hshVar;
                iq8Var.I(hshVar);
                hshVar.f();
            }
        }
    }

    public final f4h b() {
        if (this.H == null) {
            this.E.getClass();
            this.H = new f4h(f4h.d, null);
        }
        return this.H;
    }

    public final Object clone() {
        return new xtc(this);
    }

    public xtc(iq8 iq8Var) {
        new ReentrantLock();
        this.E = iq8Var;
        this.G = wsc.c;
        this.F = new vsc(0);
        this.I = 512;
    }
}
