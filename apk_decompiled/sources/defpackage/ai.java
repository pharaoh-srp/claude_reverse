package defpackage;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class ai extends iwe {
    public final q2a b;
    public final lsc c;
    public final wz5 d;

    public ai(pkc pkcVar, mn5 mn5Var, q2a q2aVar, h86 h86Var) {
        super(h86Var);
        this.b = q2aVar;
        this.c = mpk.P(((Boolean) pkcVar.a().u.getValue()).booleanValue() ? new fi(mn5Var, (LocalDate) null, 6) : new gi(false, false));
        this.d = mpk.w(new d7(2, this));
    }
}
