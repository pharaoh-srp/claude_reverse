package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class op4 extends qp4 {
    public final rp4 a;

    public op4(rp4 rp4Var) {
        this.a = rp4Var;
    }

    @Override // defpackage.qp4
    public final KSerializer a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof op4) && ((op4) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
