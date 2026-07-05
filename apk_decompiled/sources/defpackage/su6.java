package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class su6 extends av6 {
    public final /* synthetic */ int a;
    public final String b;

    public su6(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = ouk.g(str);
                break;
            case 4:
                StringBuilder sbB = xrg.b();
                xrg.a(str, sbB, false);
                this.b = ouk.g(xrg.k(sbB));
                break;
            case 5:
                StringBuilder sbB2 = xrg.b();
                xrg.a(str, sbB2, false);
                this.b = ouk.g(xrg.k(sbB2));
                break;
            default:
                this.b = ouk.g(str);
                break;
        }
    }

    @Override // defpackage.av6
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return yj6Var2.u(str);
            case 1:
                n31 n31VarK = yj6Var2.k();
                n31VarK.getClass();
                ArrayList arrayList = new ArrayList(n31VarK.E);
                for (int i2 = 0; i2 < n31VarK.E; i2++) {
                    String str2 = n31VarK.F[i2];
                    if (!n31.s(str2)) {
                        arrayList.add(new l31(str2, (String) n31VarK.G[i2], n31VarK));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (ouk.g(((l31) it.next()).E).startsWith(str)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return yj6Var2.d0(str);
            case 3:
                yj6Var2.getClass();
                StringBuilder sbB = xrg.b();
                new do0(17, sbB).j(yj6Var2);
                return ouk.g(xrg.k(sbB)).contains(str);
            case 4:
                return ouk.g(yj6Var2.i0()).contains(str);
            case 5:
                return ouk.g(yj6Var2.k0()).contains(str);
            case 6:
                Stream map = yj6Var2.I.stream().map(new a41(2));
                String[] strArr = xrg.a;
                return ((String) map.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]))).contains(str);
            case 7:
                yj6Var2.getClass();
                Stream map2 = euk.s(yj6Var2, c5c.class).map(new a41(2));
                String[] strArr2 = xrg.a;
                return ((String) map2.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]))).contains(str);
            case 8:
                n31 n31Var = yj6Var2.J;
                return str.equals(n31Var != null ? n31Var.m("id") : "");
            case 9:
                return yj6Var2.w(str);
            case 10:
                return yj6Var2.H.G.endsWith(str);
            default:
                return yj6Var2.H.G.startsWith(str);
        }
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return ij0.j("[", str, "]");
            case 1:
                return ij0.j("[^", str, "]");
            case 2:
                return ij0.i(".", str);
            case 3:
                return ij0.j(":containsData(", str, ")");
            case 4:
                return ij0.j(":containsOwn(", str, ")");
            case 5:
                return ij0.j(":contains(", str, ")");
            case 6:
                return ij0.j(":containsWholeOwnText(", str, ")");
            case 7:
                return ij0.j(":containsWholeText(", str, ")");
            case 8:
                return "#".concat(str);
            case 9:
                return str;
            case 10:
                return "*|".concat(str);
            default:
                return str.concat("|*");
        }
    }

    public /* synthetic */ su6(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
