package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface qn0 extends pu9 {
    p5b D0(rn0 rn0Var, h5b h5bVar, long j);

    boolean Q();

    @Override // defpackage.pu9
    default p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new t40(c3dVarU, 1));
    }

    default boolean z(gma gmaVar, cu9 cu9Var) {
        return false;
    }
}
