package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface gqb extends iqb {
    @Override // defpackage.iqb
    default Object a(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.iqb
    default boolean e(bz7 bz7Var) {
        return ((Boolean) bz7Var.invoke(this)).booleanValue();
    }
}
