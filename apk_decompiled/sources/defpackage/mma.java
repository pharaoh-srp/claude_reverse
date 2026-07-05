package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mma {
    cu9 d(cu9 cu9Var);

    default long f(cu9 cu9Var, cu9 cu9Var2) {
        cu9 cu9VarD = d(cu9Var);
        cu9 cu9VarD2 = d(cu9Var2);
        return cu9VarD instanceof ima ? ((ima) cu9VarD).L(cu9VarD2, 0L, true) : cu9VarD2 instanceof ima ? ((ima) cu9VarD2).L(cu9VarD, 0L, true) ^ (-9223372034707292160L) : cu9VarD.L(cu9VarD, 0L, true);
    }

    cu9 j(b3d b3dVar);
}
