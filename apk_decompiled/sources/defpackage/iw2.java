package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ iw2(nwb nwbVar, ArrayList arrayList, List list, boolean z) {
        this.E = 3;
        this.G = nwbVar;
        this.H = arrayList;
        this.I = list;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Throwable {
        int i = 0;
        switch (this.E) {
            case 0:
                boolean z = this.F;
                String str = (String) this.G;
                String str2 = (String) this.H;
                m7f m7fVar = (m7f) this.I;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                return new hw2(z, str, str2, (fk0) m7fVar.a(kceVar.b(fk0.class), null, null), (fb6) m7fVar.a(kceVar.b(fb6.class), null, null), (pt2) m7fVar.a(kceVar.b(pt2.class), null, null), (koi) m7fVar.a(kceVar.b(koi.class), null, null), (pkc) m7fVar.a(kceVar.b(pkc.class), null, null), (zkg) m7fVar.a(kceVar.b(zkg.class), null, null), (qi3) m7fVar.a(kceVar.b(qi3.class), null, null), (qs2) m7fVar.a(kceVar.b(qs2.class), null, null), (pl3) m7fVar.a(kceVar.b(pl3.class), null, null), (swa) m7fVar.a(kceVar.b(swa.class), null, null), (oke) m7fVar.a(kceVar.b(oke.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            case 1:
                boolean z2 = this.F;
                String str3 = (String) this.G;
                String str4 = (String) this.H;
                String str5 = (String) this.I;
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.s(ekfVar, 2);
                if (!z2) {
                    str3 = str4;
                }
                ckf.v(ekfVar, str3);
                ckf.l(ekfVar, str5);
                return iei.a;
            case 2:
                boolean z3 = this.F;
                md9 md9Var = (md9) this.G;
                fxc fxcVar = (fxc) this.H;
                ad9 ad9Var = (ad9) this.I;
                ((w86) obj).getClass();
                if (z3) {
                    md9Var.getClass();
                    fxcVar.getClass();
                    ad9Var.getClass();
                    Integer num = (Integer) md9Var.d.compute(od9.d(ad9Var.a, ad9Var.b), new jd9(i, new gg7(18)));
                    if (num != null && num.intValue() == 1) {
                        md9Var.c.remove(od9.d(ad9Var.a, ad9Var.b));
                        synchronized (md9Var.f) {
                            md9Var.f.remove(od9.d(ad9Var.a, ad9Var.b));
                            md9Var.f.add(od9.d(ad9Var.a, ad9Var.b));
                        }
                        rl rlVar = fxcVar.a;
                        if (rlVar != null) {
                            String str6 = ad9Var.a;
                            String str7 = ad9Var.b;
                            str6.getClass();
                            str7.getClass();
                            synchronized (((ArrayList) rlVar.G)) {
                                long jNanoTime = System.nanoTime();
                                rlVar.O(jNanoTime, str6, (ArrayList) rlVar.F);
                                ((ArrayList) rlVar.F).add(rlVar.F(jNanoTime, new dmg(str6, str7)));
                            }
                        }
                        mpk.q(od9.c(ad9Var).hashCode(), od9.c(ad9Var));
                    } else {
                        List list = xah.a;
                        xah.d("JankTracker.acquireTag ref-count > 1", "perflog", sta.h0(new cpc("tag", od9.d(ad9Var.a, ad9Var.b)), new cpc("count", num)));
                    }
                }
                return new nd9(z3, md9Var, fxcVar, ad9Var);
            default:
                nwb nwbVar = (nwb) this.G;
                b3d b3dVar = (b3d) obj;
                jl1 jl1Var = new jl1((ArrayList) this.H, (List) this.I, this.F);
                b3dVar.E = true;
                jl1Var.invoke(b3dVar);
                b3dVar.E = false;
                nwbVar.getValue();
                return iei.a;
        }
    }

    public /* synthetic */ iw2(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }
}
