package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oc2 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ kdg F;

    public /* synthetic */ oc2(kdg kdgVar, int i) {
        this.E = i;
        this.F = kdgVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        kdg kdgVar = this.F;
        switch (i) {
            case 0:
                v79 v79Var = (v79) obj;
                if (v79Var instanceof lp8) {
                    kdgVar.add(v79Var);
                } else if (v79Var instanceof mp8) {
                    kdgVar.remove(((mp8) v79Var).a);
                } else if (v79Var instanceof ks7) {
                    kdgVar.add(v79Var);
                } else if (v79Var instanceof ls7) {
                    kdgVar.remove(((ls7) v79Var).a);
                } else if (v79Var instanceof odd) {
                    kdgVar.add(v79Var);
                } else if (v79Var instanceof pdd) {
                    kdgVar.remove(((pdd) v79Var).a);
                } else if (v79Var instanceof ndd) {
                    kdgVar.remove(((ndd) v79Var).a);
                } else if (v79Var instanceof ad6) {
                    kdgVar.add(v79Var);
                } else if (v79Var instanceof bd6) {
                    kdgVar.remove(((bd6) v79Var).a);
                } else if (v79Var instanceof zc6) {
                    kdgVar.remove(((zc6) v79Var).a);
                }
                break;
            case 1:
                v79 v79Var2 = (v79) obj;
                if (v79Var2 instanceof lp8) {
                    kdgVar.add(v79Var2);
                } else if (v79Var2 instanceof mp8) {
                    kdgVar.remove(((mp8) v79Var2).a);
                } else if (v79Var2 instanceof ks7) {
                    kdgVar.add(v79Var2);
                } else if (v79Var2 instanceof ls7) {
                    kdgVar.remove(((ls7) v79Var2).a);
                } else if (v79Var2 instanceof odd) {
                    kdgVar.add(v79Var2);
                } else if (v79Var2 instanceof pdd) {
                    kdgVar.remove(((pdd) v79Var2).a);
                } else if (v79Var2 instanceof ndd) {
                    kdgVar.remove(((ndd) v79Var2).a);
                } else if (v79Var2 instanceof ad6) {
                    kdgVar.add(v79Var2);
                } else if (v79Var2 instanceof bd6) {
                    kdgVar.remove(((bd6) v79Var2).a);
                } else if (v79Var2 instanceof zc6) {
                    kdgVar.remove(((zc6) v79Var2).a);
                }
                break;
            default:
                v79 v79Var3 = (v79) obj;
                if (v79Var3 instanceof ks7) {
                    kdgVar.add(v79Var3);
                } else if (v79Var3 instanceof ls7) {
                    kdgVar.remove(((ls7) v79Var3).a);
                } else if (v79Var3 instanceof odd) {
                    kdgVar.add(v79Var3);
                } else if (v79Var3 instanceof pdd) {
                    kdgVar.remove(((pdd) v79Var3).a);
                } else if (v79Var3 instanceof ndd) {
                    kdgVar.remove(((ndd) v79Var3).a);
                } else if (v79Var3 instanceof ad6) {
                    kdgVar.add(v79Var3);
                } else if (v79Var3 instanceof bd6) {
                    kdgVar.remove(((bd6) v79Var3).a);
                } else if (v79Var3 instanceof zc6) {
                    kdgVar.remove(((zc6) v79Var3).a);
                }
                break;
        }
        return ieiVar;
    }
}
