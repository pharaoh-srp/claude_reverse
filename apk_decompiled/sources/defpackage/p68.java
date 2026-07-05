package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface p68 extends q68 {
    @Override // defpackage.q68
    default Object a(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.q68
    default boolean b(bz7 bz7Var) {
        return ((Boolean) bz7Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.q68
    default boolean c(e69 e69Var) {
        Map map = cw9.a;
        return Boolean.TRUE.booleanValue();
    }
}
