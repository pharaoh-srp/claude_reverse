package defpackage;

import com.google.gson.JsonParseException;

/* JADX INFO: loaded from: classes.dex */
public final class rga implements s16 {
    public final h99 E;

    public rga(h99 h99Var, int i) {
        h99Var.getClass();
        switch (i) {
            case 1:
                this.E = h99Var;
                break;
            default:
                this.E = h99Var;
                break;
        }
    }

    @Override // defpackage.s16
    public Object r(Object obj) {
        String str = (String) obj;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        str.getClass();
        try {
            return stk.g(str);
        } catch (JsonParseException e) {
            dch.I(this.E, 5, x44.X(g99Var2, g99Var), new rb1(str, 17), e, 48);
            return null;
        } catch (IllegalStateException e2) {
            dch.I(this.E, 5, x44.X(g99Var2, g99Var), new rb1(str, 18), e2, 48);
            return null;
        }
    }
}
