package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class so6 implements jc0 {
    public static final so6 a = new so6();

    @Override // defpackage.jc0
    public final neg d() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.jc0
    public final ww7 e() {
        qqb qqbVarD = o06.d(this);
        if (qqbVarD != null) {
            if (nu6.f(qqbVarD)) {
                qqbVarD = null;
            }
            if (qqbVarD != null) {
                return o06.c(qqbVarD);
            }
        }
        return null;
    }

    @Override // defpackage.jc0
    public final Map f() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.jc0
    public final yr9 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
