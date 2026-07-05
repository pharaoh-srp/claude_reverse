package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class usa extends x0 {
    public final KSerializer a;
    public final KSerializer b;

    public usa(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // defpackage.x0
    public final void f(ud4 ud4Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objL = ud4Var.l(getDescriptor(), i, this.a, null);
        int iX = ud4Var.x(getDescriptor());
        if (iX != i + 1) {
            mr9.q(grc.o(i, iX, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objL);
        KSerializer kSerializer = this.b;
        map.put(objL, (!zContainsKey || (kSerializer.getDescriptor().getKind() instanceof kfd)) ? ud4Var.l(getDescriptor(), iX, kSerializer, null) : ud4Var.l(getDescriptor(), iX, kSerializer, sta.f0(objL, map)));
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarY = encoder.y(descriptor);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            vd4VarY.r(getDescriptor(), i, this.a, key);
            i += 2;
            vd4VarY.r(getDescriptor(), i2, this.b, value);
        }
        vd4VarY.b(descriptor);
    }
}
