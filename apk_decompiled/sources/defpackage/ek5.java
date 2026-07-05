package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ek5 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        byte[] bArrO0;
        int i;
        x1e x1eVar;
        List list;
        switch (this.F) {
            case 0:
                fv6 fv6Var = (fv6) obj;
                fv6Var.getClass();
                hi5 hi5Var = (hi5) this.G;
                hi5Var.a(fv6Var, (kt6) this.H, 2);
                gk5 gk5Var = (gk5) this.I;
                mxi mxiVar = (mxi) this.J;
                gk5Var.a.y().getClass();
                if (System.currentTimeMillis() - mxiVar.a < 14400000) {
                    hi5Var.a(fv6Var, gk5.b(gk5Var, mxiVar), 2);
                }
                return iei.a;
            case 1:
                ((w86) obj).getClass();
                return new kd6((zy7) this.G, (nwb) this.H, (nwb) this.I, (l45) this.J);
            case 2:
                long j = ((fcc) obj).a;
                ((nwb) this.H).setValue(Boolean.TRUE);
                nwb nwbVar = (nwb) this.J;
                ad6 ad6Var = new ad6();
                gb9.D((l45) this.I, null, null, new jd6(ad6Var, null, 1), 3);
                nwbVar.setValue(ad6Var);
                ((bz7) this.G).invoke(new fcc(j));
                return iei.a;
            default:
                fv6 fv6Var2 = (fv6) obj;
                fv6Var2.getClass();
                ax5 ax5Var = (ax5) this.G;
                lj5 lj5Var = (lj5) this.H;
                dxc dxcVar = (dxc) this.I;
                a2h a2hVar = (a2h) this.J;
                File file = new File(dxcVar.d);
                h99 h99VarT = ((k99) ax5Var.F).t();
                h99VarT.getClass();
                if (fd9.T(file, h99VarT) && fd9.x(file, h99VarT)) {
                    g99 g99Var = g99.G;
                    g99 g99Var2 = g99.F;
                    try {
                        bArrO0 = nk7.o0(file);
                    } catch (SecurityException e) {
                        dch.I(h99VarT, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
                        bArrO0 = null;
                    } catch (Exception e2) {
                        dch.I(h99VarT, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
                        bArrO0 = null;
                    }
                    break;
                } else {
                    bArrO0 = null;
                }
                if (bArrO0 == null || bArrO0.length == 0) {
                    i = 1;
                    x1eVar = null;
                } else {
                    String str = a2hVar.e;
                    String str2 = a2hVar.f;
                    String strC = lsk.c(dxcVar.a);
                    String strC2 = lsk.c(dxcVar.b);
                    List listW = x44.W("perfetto.proto");
                    StringBuilder sb = new StringBuilder();
                    sb.append("service:" + lj5Var.c);
                    sb.append(",");
                    sb.append("env:" + lj5Var.d);
                    sb.append(",");
                    sb.append("version:" + lj5Var.e);
                    sb.append(",");
                    String str3 = lj5Var.i;
                    sb.append("sdk_version:" + str3);
                    sb.append(",");
                    sb.append("profiler_version:" + str3);
                    sb.append(",");
                    sb.append("runtime_version:" + lj5Var.m.h);
                    sb.append(",operation:launch");
                    String str4 = lj5Var.p;
                    if (str4 != null) {
                        sb.append(",");
                        sb.append("build_id:".concat(str4));
                    }
                    String string = sb.toString();
                    String str5 = a2hVar.a;
                    str5.getClass();
                    String str6 = a2hVar.b;
                    str6.getClass();
                    List listW2 = x44.W(a2hVar.c);
                    List listW3 = x44.W(a2hVar.d);
                    nid nidVar = (str == null || str2 == null) ? null : new nid(x44.W(str), x44.W(str2));
                    qh9 qh9Var = new qh9();
                    qh9 qh9Var2 = new qh9();
                    i = 1;
                    qh9Var2.r("id", str5);
                    qh9Var.o("application", qh9Var2);
                    qh9 qh9Var3 = new qh9();
                    qh9Var3.r("id", str6);
                    qh9Var.o("session", qh9Var3);
                    if (nidVar != null) {
                        List list2 = nidVar.b;
                        qh9 qh9Var4 = new qh9();
                        List list3 = nidVar.a;
                        list = listW3;
                        ig9 ig9Var = new ig9(list3.size());
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ig9Var.p((String) it.next());
                        }
                        qh9Var4.o("id", ig9Var);
                        ig9 ig9Var2 = new ig9(list2.size());
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ig9Var2.p((String) it2.next());
                        }
                        qh9Var4.o("name", ig9Var2);
                        qh9Var.o("view", qh9Var4);
                    } else {
                        list = listW3;
                    }
                    qh9 qh9Var5 = new qh9();
                    ig9 ig9Var3 = new ig9(listW2.size());
                    Iterator it3 = listW2.iterator();
                    while (it3.hasNext()) {
                        ig9Var3.p((String) it3.next());
                    }
                    qh9Var5.o("id", ig9Var3);
                    ig9 ig9Var4 = new ig9(list.size());
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ig9Var4.p((String) it4.next());
                    }
                    qh9Var5.o("label", ig9Var4);
                    qh9Var.o("vital", qh9Var5);
                    ig9 ig9Var5 = new ig9(listW.size());
                    Iterator it5 = listW.iterator();
                    while (it5.hasNext()) {
                        ig9Var5.p((String) it5.next());
                    }
                    qh9Var.o("attachments", ig9Var5);
                    qh9Var.r("start", strC);
                    qh9Var.r("end", strC2);
                    qh9Var.o("family", new vh9(gid.g(1)));
                    qh9Var.o("runtime", new vh9(gid.g(1)));
                    qh9Var.p(4L, "version");
                    qh9Var.r("tags_profiler", string);
                    String string2 = qh9Var.toString();
                    string2.getClass();
                    byte[] bytes = string2.getBytes(dj2.a);
                    bytes.getClass();
                    x1eVar = new x1e(bytes, bArrO0);
                }
                if (x1eVar != null) {
                    synchronized (((ax5) this.G)) {
                        fv6Var2.a(x1eVar, i);
                    }
                }
                return iei.a;
        }
    }
}
