package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public final class x84 implements x82, sac {
    public final /* synthetic */ int E;
    public final Type F;

    public /* synthetic */ x84(int i, Type type) {
        this.E = i;
        this.F = type;
    }

    @Override // defpackage.x82
    public Type g() {
        int i = this.E;
        return this.F;
    }

    @Override // defpackage.x82
    public Object i(fdc fdcVar) {
        switch (this.E) {
            case 0:
                y84 y84Var = new y84(fdcVar);
                fdcVar.e(new w84(y84Var, 0));
                return y84Var;
            default:
                y84 y84Var2 = new y84(fdcVar);
                fdcVar.e(new w84(y84Var2, 1));
                return y84Var2;
        }
    }

    @Override // defpackage.sac
    public Object o0() {
        Type type = this.F;
        if (!(type instanceof ParameterizedType)) {
            wg6.j("Invalid EnumSet type: ", type);
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        wg6.j("Invalid EnumSet type: ", type);
        return null;
    }
}
