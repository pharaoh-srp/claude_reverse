package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements KSerializer {
    public s06 a(ud4 ud4Var, String str) {
        fof fofVarA = ud4Var.a();
        pl9 pl9VarC = c();
        nnf nnfVar = (nnf) fofVarA;
        nnfVar.getClass();
        pl9VarC.getClass();
        Map map = (Map) nnfVar.d.get(pl9VarC);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = nnfVar.e.get(pl9VarC);
        bz7 bz7Var = nai.N(1, obj) ? (bz7) obj : null;
        if (bz7Var != null) {
            return (s06) bz7Var.invoke(str);
        }
        return null;
    }

    public znf b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        return encoder.a().c(c(), obj);
    }

    public abstract pl9 c();

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor);
        Object objL = null;
        String strV = null;
        while (true) {
            int iX = ud4VarC.x(getDescriptor());
            if (iX == -1) {
                if (objL != null) {
                    ud4VarC.b(descriptor);
                    return objL;
                }
                mr9.q(ij0.i("Polymorphic value has not been read for class ", strV));
                return null;
            }
            if (iX == 0) {
                strV = ud4VarC.v(getDescriptor(), iX);
            } else {
                if (iX != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strV == null) {
                        strV = "unknown class";
                    }
                    sb.append(strV);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iX);
                    throw new SerializationException(sb.toString());
                }
                if (strV == null) {
                    sz6.p("Cannot read polymorphic value before its type token");
                    return null;
                }
                objL = ud4VarC.l(getDescriptor(), iX, nai.y(this, ud4VarC, strV), null);
            }
        }
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        znf znfVarZ = nai.z(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor);
        vd4VarC.q(getDescriptor(), 0, znfVarZ.getDescriptor().a());
        vd4VarC.r(getDescriptor(), 1, znfVarZ, obj);
        vd4VarC.b(descriptor);
    }
}
