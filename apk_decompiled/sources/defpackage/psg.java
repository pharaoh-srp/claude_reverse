package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class psg extends usg {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psg(av6 av6Var, int i) {
        super(av6Var);
        this.d = i;
    }

    @Override // defpackage.av6
    public final int a() {
        switch (this.d) {
        }
        return this.a.a() + 2;
    }

    @Override // defpackage.usg
    public final boolean g(yj6 yj6Var, c5c c5cVar) {
        switch (this.d) {
            case 0:
                if (yj6Var != c5cVar) {
                    for (yj6 yj6VarG = c5cVar.G(); yj6VarG != null; yj6VarG = yj6VarG.E) {
                        if (h(yj6Var, yj6VarG)) {
                            return true;
                        }
                        if (yj6VarG != yj6Var) {
                        }
                    }
                }
                return false;
            case 1:
                return this.a.d(yj6Var, c5cVar);
            default:
                return !h(yj6Var, c5cVar);
        }
    }

    public final String toString() {
        int i = this.d;
        av6 av6Var = this.a;
        switch (i) {
            case 0:
                return String.format("%s ", av6Var);
            case 1:
                return String.format(":is(%s)", av6Var);
            default:
                return String.format(":not(%s)", av6Var);
        }
    }
}
