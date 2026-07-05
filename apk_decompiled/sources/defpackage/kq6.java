package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kq6 implements KSerializer {
    public final /* synthetic */ int a;
    public final KSerializer b;
    public final Object c;

    public kq6(KSerializer kSerializer, int i) {
        this.a = i;
        kSerializer.getClass();
        switch (i) {
            case 2:
                this.b = kSerializer;
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.c = new to0(descriptor, 0);
                break;
            default:
                this.b = kSerializer;
                this.c = kSerializer.getDescriptor();
                break;
        }
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object c(Object obj, Object obj2);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Object objA;
        int i = this.a;
        KSerializer kSerializer = this.b;
        switch (i) {
            case 0:
                decoder.getClass();
                if (!decoder.w()) {
                    return null;
                }
                try {
                    return (Enum) kSerializer.deserialize(decoder);
                } catch (SerializationException e) {
                    zfa.a.getClass();
                    if (!yfa.b()) {
                        return null;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    zfa.a.getClass();
                    String strConcat = "Falling back to null for unknown enum value: ".concat(gsk.c(e));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.DEBUG, "EnumSerializers", strConcat);
                    }
                    return null;
                }
            case 1:
                decoder.getClass();
                SerialDescriptor descriptor = getDescriptor();
                ud4 ud4VarC = decoder.c(descriptor);
                Object obj2 = bhk.c;
                Object objL = obj2;
                Object objL2 = objL;
                while (true) {
                    int iX = ud4VarC.x(getDescriptor());
                    if (iX == -1) {
                        if (objL == obj2) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objL2 == obj2) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object objC = c(objL, objL2);
                        ud4VarC.b(descriptor);
                        return objC;
                    }
                    if (iX == 0) {
                        objL = ud4VarC.l(getDescriptor(), 0, kSerializer, null);
                    } else {
                        if (iX != 1) {
                            throw new SerializationException(grc.p(iX, "Invalid index: "));
                        }
                        objL2 = ud4VarC.l(getDescriptor(), 1, (KSerializer) this.c, null);
                    }
                }
                break;
            default:
                decoder.getClass();
                zg9 zg9Var = (zg9) decoder;
                JsonArray jsonArrayH = ch9.h(zg9Var.n());
                ArrayList arrayList2 = new ArrayList();
                Iterator<JsonElement> it2 = jsonArrayH.iterator();
                while (it2.hasNext()) {
                    try {
                        objA = zg9Var.d().a(kSerializer, it2.next());
                    } catch (SerializationException | IllegalArgumentException unused) {
                        objA = null;
                    }
                    if (objA != null) {
                        arrayList2.add(objA);
                    }
                    break;
                }
                return arrayList2;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return (SerialDescriptor) this.c;
            default:
                return (to0) this.c;
        }
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        KSerializer kSerializer = this.b;
        switch (i) {
            case 0:
                Enum r6 = (Enum) obj;
                encoder.getClass();
                r6.getClass();
                kSerializer.serialize(encoder, r6);
                break;
            case 1:
                encoder.getClass();
                vd4 vd4VarC = encoder.c(getDescriptor());
                vd4VarC.r(getDescriptor(), 0, kSerializer, a(obj));
                vd4VarC.r(getDescriptor(), 1, (KSerializer) this.c, b(obj));
                vd4VarC.b(getDescriptor());
                break;
            default:
                List list = (List) obj;
                encoder.getClass();
                list.getClass();
                d4c.t(kSerializer).serialize(encoder, list);
                break;
        }
    }

    public kq6(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = 1;
        this.b = kSerializer;
        this.c = kSerializer2;
    }
}
