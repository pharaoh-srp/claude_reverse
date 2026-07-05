package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class pp4 extends qp4 {
    public final bz7 a;

    public pp4(bz7 bz7Var) {
        this.a = bz7Var;
    }

    @Override // defpackage.qp4
    public final KSerializer a(List list) {
        list.getClass();
        return (KSerializer) this.a.invoke(list);
    }
}
