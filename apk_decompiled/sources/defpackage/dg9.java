package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dg9 extends gg9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg9 b;

    public /* synthetic */ dg9(gg9 gg9Var, int i) {
        this.a = i;
        this.b = gg9Var;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                return gg9Var.fromJson(ci9Var);
            case 1:
                boolean z = ci9Var.I;
                ci9Var.I = true;
                try {
                    return gg9Var.fromJson(ci9Var);
                } finally {
                    ci9Var.I = z;
                }
            default:
                boolean z2 = ci9Var.J;
                ci9Var.J = true;
                try {
                    return gg9Var.fromJson(ci9Var);
                } finally {
                    ci9Var.J = z2;
                }
        }
    }

    @Override // defpackage.gg9
    public final boolean isLenient() {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
        }
        return gg9Var.isLenient();
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                boolean z = jj9Var.K;
                jj9Var.K = true;
                try {
                    gg9Var.toJson(jj9Var, obj);
                    return;
                } finally {
                    jj9Var.K = z;
                }
            case 1:
                boolean z2 = jj9Var.J;
                jj9Var.J = true;
                try {
                    gg9Var.toJson(jj9Var, obj);
                    return;
                } finally {
                    jj9Var.J = z2;
                }
            default:
                gg9Var.toJson(jj9Var, obj);
                return;
        }
    }

    public final String toString() {
        int i = this.a;
        gg9 gg9Var = this.b;
        switch (i) {
            case 0:
                return gg9Var + ".serializeNulls()";
            case 1:
                return gg9Var + ".lenient()";
            default:
                return gg9Var + ".failOnUnknown()";
        }
    }
}
