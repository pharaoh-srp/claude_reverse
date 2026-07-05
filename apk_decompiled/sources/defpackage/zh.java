package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.tasks.ui.q;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ zh(int i, int i2, List list, Set set, bz7 bz7Var, int i3) {
        this.E = 11;
        this.H = i;
        this.I = i2;
        this.J = list;
        this.G = set;
        this.F = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        int i3 = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.G;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                tnk.a((hi) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                zp.c((List) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                xvk.a((iqb) obj4, (ote) obj5, (rz7) obj3, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                yrk.c((ppg) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 4:
                zy7 zy7Var = (zy7) obj3;
                iqb iqbVar = (iqb) obj4;
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1 | i3);
                int i4 = this.I;
                ysj.b(iP0, i4, (ld4) obj, (zy7) obj5, zy7Var, iqbVar);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1 | i2);
                xkk.b((vsa) obj5, this.H, (zy7) obj3, (String) obj4, (ld4) obj, iP02);
                break;
            case 6:
                ((Integer) obj2).getClass();
                flk.d((cte) obj5, (jz0) obj3, (iqb) obj4, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ktk.j((bz7) obj3, (iqb) obj4, (String) obj5, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(1 | i2);
                hkk.b(this.H, (String) obj5, (String) obj3, (iqb) obj4, (ld4) obj, iP03);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ulk.b((zy7) obj5, (iqb) obj4, (e0g) obj3, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 10:
                ((Integer) obj2).getClass();
                xb5.b((String) obj5, (iqb) obj4, (tkh) obj3, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(1);
                p5h.b(this.H, this.I, (List) obj5, (Set) obj4, (bz7) obj3, (ld4) obj, iP04);
                break;
            case 12:
                ((Integer) obj2).getClass();
                q.i((TaskResponse) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1 | i3), this.I);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                ktk.l(this.H, (Integer) obj5, (t3e) obj3, (zy7) obj4, (ld4) obj, iP05);
                break;
            default:
                ((Integer) obj2).getClass();
                ((m5j) obj5).a((iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(i3 | 1), this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ zh(int i, Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.E = i3;
        this.H = i;
        this.J = obj;
        this.F = obj2;
        this.G = obj3;
        this.I = i2;
    }

    public /* synthetic */ zh(bz7 bz7Var, iqb iqbVar, String str, int i, int i2) {
        this.E = 7;
        this.F = bz7Var;
        this.G = iqbVar;
        this.J = str;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ zh(vsa vsaVar, int i, zy7 zy7Var, String str, int i2) {
        this.E = 5;
        this.J = vsaVar;
        this.H = i;
        this.F = zy7Var;
        this.G = str;
        this.I = i2;
    }

    public /* synthetic */ zh(iqb iqbVar, ote oteVar, rz7 rz7Var, int i, int i2) {
        this.E = 2;
        this.G = iqbVar;
        this.J = oteVar;
        this.F = rz7Var;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ zh(Object obj, iqb iqbVar, Object obj2, int i, int i2, int i3) {
        this.E = i3;
        this.J = obj;
        this.G = iqbVar;
        this.F = obj2;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ zh(Object obj, Object obj2, iqb iqbVar, int i, int i2, int i3) {
        this.E = i3;
        this.J = obj;
        this.F = obj2;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }
}
