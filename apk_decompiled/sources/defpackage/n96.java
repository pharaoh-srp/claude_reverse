package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class n96 implements Cloneable {
    public xp6 E = xp6.J;
    public Charset F = gi5.a;
    public boolean G = true;
    public final int H = 1;
    public final int I = 30;
    public final int J = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n96 clone() {
        try {
            n96 n96Var = (n96) super.clone();
            String strName = this.F.name();
            n96Var.getClass();
            n96Var.F = Charset.forName(strName);
            n96Var.E = xp6.valueOf(this.E.name());
            return n96Var;
        } catch (CloneNotSupportedException e) {
            xh6.h(e);
            return null;
        }
    }
}
