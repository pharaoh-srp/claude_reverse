package defpackage;

import android.database.SQLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ rf1(Object obj, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    @Override // defpackage.zy7
    public final Object a() {
        jwb jwbVarI;
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                jwb jwbVar = (jwb) obj;
                if (z) {
                    jwbVar.f(ieiVar);
                }
                return ieiVar;
            case 1:
                ((bz7) obj).invoke(Boolean.valueOf(!z));
                return ieiVar;
            case 2:
                gh4 gh4Var = (gh4) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                gh4Var.F.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                gh4Var.E.d(sb);
                try {
                    u00.N(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i2 = gh4Var.K;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return ieiVar;
                }
            case 3:
                y20 y20Var = (y20) obj;
                if (z && (jwbVarI = y20Var.i()) != null) {
                    ((n2g) jwbVarI).f(ieiVar);
                }
                return ieiVar;
            default:
                wa1 wa1Var = (wa1) obj;
                wa1Var.c.a(wa1Var, wa1.d[0], Boolean.valueOf(z));
                return ieiVar;
        }
    }

    public /* synthetic */ rf1(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
