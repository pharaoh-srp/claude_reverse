package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eg9 extends gg9 {
    public final /* synthetic */ gg9 a;
    public final /* synthetic */ String b;

    public eg9(gg9 gg9Var, String str) {
        this.a = gg9Var;
        this.b = str;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        return this.a.fromJson(ci9Var);
    }

    @Override // defpackage.gg9
    public final boolean isLenient() {
        return this.a.isLenient();
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        String str = jj9Var.I;
        if (str == null) {
            str = "";
        }
        jj9Var.S(this.b);
        try {
            this.a.toJson(jj9Var, obj);
        } finally {
            jj9Var.S(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".indent(\"");
        return ij0.m(sb, this.b, "\")");
    }
}
