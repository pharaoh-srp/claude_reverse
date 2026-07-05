package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wi5 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public /* synthetic */ Object F;
    public final /* synthetic */ String G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi5(int i, tp4 tp4Var, String str) {
        super(2, tp4Var);
        this.G = str;
        this.H = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                wi5 wi5Var = new wi5(this.G, tp4Var);
                wi5Var.F = obj;
                return wi5Var;
            default:
                wi5 wi5Var2 = new wi5(this.H, tp4Var, this.G);
                wi5Var2.F = obj;
                return wi5Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((wi5) create((kq4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((wi5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i = this.E;
        String str2 = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                kq4 kq4Var = (kq4) this.F;
                int i2 = this.H;
                m45 m45Var = m45.E;
                if (i2 == 0) {
                    sf5.h0(obj);
                    xz8 xz8Var = kq4Var.b;
                    this.F = kq4Var;
                    this.H = 1;
                    xz8Var.d(str2, this);
                    if (iei.a != m45Var) {
                    }
                    return m45Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                int i3 = 7;
                h85 h85Var = new h85(i3);
                ny nyVar = new ny(kq4Var, str2, tp4Var, i3);
                this.F = null;
                this.H = 2;
                Object objA = kq4Var.a(h85Var, nyVar, this);
                if (objA != m45Var) {
                    return objA;
                }
                return m45Var;
            default:
                sf5.h0(obj);
                List listX0 = bsg.X0(str2, new char[]{'\n'}, 6);
                int i4 = this.H;
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                for (Object obj2 : listX0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        x44.n0();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    if (i4 < 0 || i5 < i4) {
                        List listX02 = bsg.X0(str3, new char[]{8594}, 6);
                        int i7 = listX02.size() == 2 ? 1 : 0;
                        str = (String) (i7 < listX02.size() ? listX02.get(i7) : "");
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                    i5 = i6;
                }
                return new cpc(arrayList, w44.S0(arrayList, "\n", null, null, null, 62));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi5(String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = str;
    }
}
