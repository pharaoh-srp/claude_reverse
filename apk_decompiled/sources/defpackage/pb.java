package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pb implements p68 {
    public final n9 a;
    public final int b;

    public pb(n9 n9Var, int i) {
        this.a = n9Var;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionModifier(action=");
        sb.append(this.a);
        sb.append(", rippleOverride=");
        return vb7.r(sb, this.b, ')');
    }
}
