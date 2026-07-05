package defpackage;

import kotlinx.datetime.YearMonth;

/* JADX INFO: loaded from: classes3.dex */
public final class jjj extends f1 {
    public final z52 a;

    public jjj(z52 z52Var) {
        this.a = z52Var;
    }

    @Override // defpackage.f1
    public final z52 a() {
        return this.a;
    }

    @Override // defpackage.f1
    public final l25 b() {
        return kjj.a;
    }

    @Override // defpackage.f1
    public final Object d(l25 l25Var) {
        q09 q09Var = (q09) l25Var;
        q09Var.getClass();
        Integer num = q09Var.a;
        kjj.a("year", num);
        int iIntValue = num.intValue();
        Integer num2 = q09Var.b;
        kjj.a("monthNumber", num2);
        return new YearMonth(iIntValue, num2.intValue());
    }
}
