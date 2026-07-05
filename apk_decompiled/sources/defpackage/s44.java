package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class s44 extends x0 {
    public final KSerializer a;

    public s44(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.x0
    public void f(ud4 ud4Var, int i, Object obj) {
        i(obj, i, ud4Var.l(getDescriptor(), i, this.a, null));
    }

    public abstract void i(Object obj, int i, Object obj2);

    @Override // defpackage.znf
    public void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarY = encoder.y(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            vd4VarY.r(getDescriptor(), i, this.a, itC.next());
        }
        vd4VarY.b(descriptor);
    }
}
