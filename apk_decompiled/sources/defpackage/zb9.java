package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zb9 implements wd3 {
    public static final zb9 b = new zb9(0);
    public static final zb9 c = new zb9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zb9(int i) {
        this.a = i;
    }

    @Override // defpackage.wd3
    public final boolean a(ge9 ge9Var) {
        j7g j7gVarB0;
        switch (this.a) {
            case 0:
                eri eriVar = (eri) ge9Var.I().get(1);
                k2e k2eVar = qce.d;
                eriVar.getClass();
                int i = o06.a;
                tqb tqbVarD = m06.d(eriVar);
                tqbVarD.getClass();
                k2eVar.getClass();
                qqb qqbVarT = kxk.t(tqbVarD, okg.Q);
                if (qqbVarT == null) {
                    j7gVarB0 = null;
                } else {
                    r9i.F.getClass();
                    r9i r9iVar = r9i.G;
                    List parameters = qqbVarT.p().getParameters();
                    parameters.getClass();
                    Object objE1 = w44.e1(parameters);
                    objE1.getClass();
                    j7gVarB0 = yfd.b0(r9iVar, qqbVarT, x44.W(new skg((qai) objE1)));
                }
                if (j7gVarB0 == null) {
                    return false;
                }
                yr9 type = eriVar.getType();
                type.getClass();
                return as9.a.b(j7gVarB0, fbi.h(type, false));
            default:
                List listI = ge9Var.I();
                listI.getClass();
                List<eri> list = listI;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (eri eriVar2 : list) {
                        eriVar2.getClass();
                        if (o06.a(eriVar2) || eriVar2.N != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.wd3
    public final String b(ge9 ge9Var) {
        switch (this.a) {
        }
        return zjk.h(this, ge9Var);
    }

    @Override // defpackage.wd3
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
