package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ kb2(k0a k0aVar, int i, Object obj, int i2) {
        this.E = 8;
        this.G = k0aVar;
        this.F = i;
        this.H = obj;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                v40.a(iP0, (ld4) obj, (bz7) obj4, (iqb) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ta4) obj3).e(obj4, (ld4) obj, x44.p0(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).intValue();
                j8.c((hvd) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                j8.d((hvd[]) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                x44.b((d6e) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                nai.e((hw2) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                zni.g((gh2) obj3, (ybg) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                kz9 kz9Var = (kz9) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    kz9Var.b(i2, obj4, e18Var, 0);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((k0a) obj3).b(i2, obj4, (ld4) obj, x44.p0(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                u00.e((m9j) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                String str = (String) obj3;
                String str2 = (String) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    zh4.g(this.F, 0, e18Var2, null, str, str.equals(str2));
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                gzb.a((of6) obj3, (ta4) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                pbd.a((s8a) obj3, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                v40.f((wlg) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                tjh.a((tkh) obj3, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).intValue();
                ((a6i) obj3).a(obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                foi.c((zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ kb2(Object obj, int i, Object obj2, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
        this.H = obj2;
    }

    public /* synthetic */ kb2(Object obj, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.G = iqbVar;
        this.F = i;
    }

    public /* synthetic */ kb2(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.F = i;
    }
}
