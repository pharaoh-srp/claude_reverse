package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class odf extends n3 {
    public final pl9 a;
    public final List b;
    public final kw9 c;
    public final Map d;
    public final LinkedHashMap e;

    public odf(String str, pl9 pl9Var, pl9[] pl9VarArr, KSerializer[] kSerializerArr) {
        pl9Var.getClass();
        this.a = pl9Var;
        this.b = lm6.E;
        this.c = yb5.w(w1a.F, new vc8(21, this, str));
        if (pl9VarArr.length != kSerializerArr.length) {
            sz6.i(pl9Var.f(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        Map mapP0 = sta.p0(mp0.a1(pl9VarArr, kSerializerArr));
        this.d = mapP0;
        Set<Map.Entry> setEntrySet = mapP0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((KSerializer) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strA);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.n3
    public final s06 a(ud4 ud4Var, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(ud4Var, str);
    }

    @Override // defpackage.n3
    public final znf b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializer = (KSerializer) this.d.get(jce.a.b(obj.getClass()));
        KSerializer kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, obj);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // defpackage.n3
    public final pl9 c() {
        return this.a;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public odf(String str, pl9 pl9Var, pl9[] pl9VarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, pl9Var, pl9VarArr, kSerializerArr);
        pl9Var.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
