package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class nq6 implements KSerializer {
    public final KSerializer a;
    public final Enum b;
    public final SerialDescriptor c;

    public nq6(KSerializer kSerializer, Enum r2) {
        kSerializer.getClass();
        r2.getClass();
        this.a = kSerializer;
        this.b = r2;
        this.c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (Enum) this.a.deserialize(decoder);
        } catch (SerializationException e) {
            zfa.a.getClass();
            boolean zB = yfa.b();
            Enum r4 = this.b;
            if (zB) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "Falling back to enum default " + r4 + " with cause:" + e.getMessage();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.DEBUG, "EnumSerializers", str);
                    }
                }
            }
            return r4;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Enum r2 = (Enum) obj;
        encoder.getClass();
        r2.getClass();
        this.a.serialize(encoder, r2);
    }
}
