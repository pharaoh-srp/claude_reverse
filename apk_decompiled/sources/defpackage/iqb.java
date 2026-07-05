package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface iqb {
    default iqb B(iqb iqbVar) {
        return iqbVar == fqb.E ? this : new c74(this, iqbVar);
    }

    Object a(pz7 pz7Var, Object obj);

    boolean e(bz7 bz7Var);
}
