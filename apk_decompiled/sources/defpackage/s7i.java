package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class s7i implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final jnf d;

    public s7i(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        this.d = j8.m("kotlin.Triple", new SerialDescriptor[0], new d6d(29, this));
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        jnf jnfVar = this.d;
        ud4 ud4VarC = decoder.c(jnfVar);
        Object obj = bhk.c;
        Object objL = obj;
        Object objL2 = objL;
        Object objL3 = objL2;
        while (true) {
            int iX = ud4VarC.x(jnfVar);
            if (iX == -1) {
                ud4VarC.b(jnfVar);
                if (objL == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objL2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objL3 != obj) {
                    return new r7i(objL, objL2, objL3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iX == 0) {
                objL = ud4VarC.l(jnfVar, 0, this.a, null);
            } else if (iX == 1) {
                objL2 = ud4VarC.l(jnfVar, 1, this.b, null);
            } else {
                if (iX != 2) {
                    throw new SerializationException(grc.p(iX, "Unexpected index "));
                }
                objL3 = ud4VarC.l(jnfVar, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        r7i r7iVar = (r7i) obj;
        encoder.getClass();
        r7iVar.getClass();
        jnf jnfVar = this.d;
        vd4 vd4VarC = encoder.c(jnfVar);
        vd4VarC.r(jnfVar, 0, this.a, r7iVar.E);
        vd4VarC.r(jnfVar, 1, this.b, r7iVar.F);
        vd4VarC.r(jnfVar, 2, this.c, r7iVar.G);
        vd4VarC.b(jnfVar);
    }
}
