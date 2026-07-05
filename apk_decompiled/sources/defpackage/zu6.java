package defpackage;

import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class zu6 extends av6 {
    public final /* synthetic */ int a;
    public final hde b;

    public /* synthetic */ zu6(hde hdeVar, int i) {
        this.a = i;
        this.b = hdeVar;
    }

    @Override // defpackage.av6
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        int i = this.a;
        hde hdeVar = this.b;
        switch (i) {
            case 0:
                return hdeVar.b(yj6Var2.k0()).B();
            case 1:
                return hdeVar.b(yj6Var2.i0()).B();
            case 2:
                Stream map = yj6Var2.I.stream().map(new a41(2));
                String[] strArr = xrg.a;
                return hdeVar.b((String) map.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]))).B();
            default:
                yj6Var2.getClass();
                Stream map2 = euk.s(yj6Var2, c5c.class).map(new a41(2));
                String[] strArr2 = xrg.a;
                return hdeVar.b((String) map2.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]))).B();
        }
    }

    public final String toString() {
        int i = this.a;
        hde hdeVar = this.b;
        switch (i) {
            case 0:
                return String.format(":matches(%s)", hdeVar);
            case 1:
                return String.format(":matchesOwn(%s)", hdeVar);
            case 2:
                return String.format(":matchesWholeOwnText(%s)", hdeVar);
            default:
                return String.format(":matchesWholeText(%s)", hdeVar);
        }
    }
}
