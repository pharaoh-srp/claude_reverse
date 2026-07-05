package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class fvh implements KSerializer {
    public final w28 a;
    public final uo0 b;
    public final SerialDescriptor c;

    public fvh(w28 w28Var) {
        this.a = w28Var;
        uo0 uo0Var = new uo0(w28Var, 0);
        this.b = uo0Var;
        this.c = (to0) uo0Var.c;
    }

    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String message = illegalArgumentException.getMessage();
                StringBuilder sbR = kgh.r("Dropping ", str, " ", str2, " entry: ");
                sbR.append(message);
                String string = sbR.toString();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "TolerantListSerializer", string);
                }
            }
        }
        List list = xah.a;
        SilentException silentException = new SilentException(ij0.l("Dropping ", str, " ", str2, " entry"), illegalArgumentException);
        Map mapSingletonMap = Collections.singletonMap("error_class", jce.a.b(illegalArgumentException.getClass()).f());
        mapSingletonMap.getClass();
        xah.f(silentException, null, null, mapSingletonMap, 22);
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Object objA;
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        if (zg9Var == null) {
            return (List) this.b.deserialize(decoder);
        }
        w28 w28Var = this.a;
        String strA = w28Var.getDescriptor().a();
        Object objN = zg9Var.n();
        if (objN instanceof JsonArray) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) objN).iterator();
            while (it.hasNext()) {
                try {
                    objA = zg9Var.d().a(w28Var, (JsonElement) it.next());
                } catch (SerializationException e) {
                    a("malformed", strA, e);
                    objA = null;
                } catch (IllegalArgumentException e2) {
                    a("invalid", strA, e2);
                    objA = null;
                }
                if (objA != null) {
                    arrayList.add(objA);
                }
            }
            return arrayList;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList2.add(obj);
            }
            if (!arrayList2.isEmpty()) {
                zfa.a.getClass();
                String strL = ij0.l("Expected JSON array of ", strA, " but got ", jce.a.b(objN.getClass()).f(), "; decoding as empty list");
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfa.WARN, "TolerantListSerializer", strL);
                }
            }
        }
        List list = xah.a;
        xah.e(6, ij0.j("Expected JSON array of ", strA, "; decoded as empty list"), null, null);
        return lm6.E;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        List list = (List) obj;
        encoder.getClass();
        list.getClass();
        this.b.serialize(encoder, list);
    }
}
