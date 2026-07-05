package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class qc8 extends iwe {
    public final String b;
    public final rc8 c;
    public final lsc d;
    public final lsc e;
    public final yih f;
    public final wz5 g;
    public final lsc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc8(String str, rc8 rc8Var, h86 h86Var) {
        pg7 pg7VarN;
        JsonElement defaultValue;
        super(h86Var);
        str.getClass();
        this.b = str;
        this.c = rc8Var;
        lsc lscVarP = mpk.P((rc8Var.q().contains(str) || (pg7VarN = rc8Var.n(str)) == null) ? null : pg7VarN.b.getDefaultValue());
        this.d = lscVarP;
        this.e = mpk.P(Boolean.valueOf(rc8Var.q().contains(str)));
        pg7 pg7VarN2 = rc8Var.n(str);
        this.f = new yih(cc8.a((pg7VarN2 == null || (defaultValue = pg7VarN2.b.getDefaultValue()) == null) ? (JsonElement) lscVarP.getValue() : defaultValue), 2);
        this.g = mpk.w(new pc8(this, 0));
        this.h = mpk.P(null);
    }

    public final Object O() {
        try {
            return cc8.a.e(this.f.d().G.toString());
        } catch (Throwable th) {
            return new hre(th);
        }
    }
}
