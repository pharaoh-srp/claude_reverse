package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kz1 implements jc0 {
    public final or9 a;
    public final ww7 b;
    public final Map c;
    public final kw9 d;

    public kz1(or9 or9Var, ww7 ww7Var, Map map) {
        or9Var.getClass();
        ww7Var.getClass();
        this.a = or9Var;
        this.b = ww7Var;
        this.c = map;
        this.d = yb5.w(w1a.F, new v01(5, this));
    }

    @Override // defpackage.jc0
    public final neg d() {
        return neg.n;
    }

    @Override // defpackage.jc0
    public final ww7 e() {
        return this.b;
    }

    @Override // defpackage.jc0
    public final Map f() {
        return this.c;
    }

    @Override // defpackage.jc0
    public final yr9 getType() {
        Object value = this.d.getValue();
        value.getClass();
        return (yr9) value;
    }
}
