package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mra extends iwe {
    public final isc b;
    public final lsc c;
    public final int d;
    public final n86 e;
    public final wz5 f;
    public final xs5 g;
    public final u0h h;
    public final wz5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mra(List list, h86 h86Var) {
        super(h86Var);
        list.getClass();
        this.b = new isc(0);
        this.c = mpk.P(Boolean.FALSE);
        this.d = list.size();
        this.e = list.size() > 1 ? n86.E : n86.F;
        this.f = mpk.w(new ft9(list, 7, this));
        lra lraVar = new lra(this, 0);
        loc locVar = moc.a;
        this.g = new xs5(0, MTTypesetterKt.kLineSkipLimitMultiplier, lraVar);
        this.h = new u0h(new mia(6));
        this.i = mpk.w(new lra(this, 1));
    }

    public final boolean O() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final List P() {
        return (List) this.f.getValue();
    }
}
