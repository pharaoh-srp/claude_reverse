package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class sg9 implements KSerializer {
    public final pl9 a;
    public final jnf b;

    public sg9(pl9 pl9Var) {
        pl9Var.getClass();
        this.a = pl9Var;
        this.b = j8.o("JsonContentPolymorphicSerializer<" + pl9Var.f() + '>', t8d.l, new SerialDescriptor[0]);
    }

    public abstract s06 a(JsonElement jsonElement);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9VarH = yb5.h(decoder);
        JsonElement jsonElementN = zg9VarH.n();
        s06 s06VarA = a(jsonElementN);
        s06VarA.getClass();
        return zg9VarH.d().a((KSerializer) s06VarA, jsonElementN);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        fof fofVarA = encoder.a();
        pl9 pl9Var = this.a;
        KSerializer kSerializerC = fofVarA.c(pl9Var, obj);
        if (kSerializerC == null) {
            Class<?> cls = obj.getClass();
            kce kceVar = jce.a;
            KSerializer kSerializerM = iv1.M(kceVar.b(cls));
            if (kSerializerM == null) {
                pl9 pl9VarB = kceVar.b(obj.getClass());
                String strF = pl9VarB.f();
                if (strF == null) {
                    strF = String.valueOf(pl9VarB);
                }
                throw new SerializationException(ij0.l("Class '", strF, "' is not registered for polymorphic serialization ", "in the scope of '" + pl9Var.f() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            kSerializerC = kSerializerM;
        }
        ((KSerializer) kSerializerC).serialize(encoder, obj);
    }
}
