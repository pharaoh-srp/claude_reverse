package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class kh9 implements KSerializer {
    public static final kh9 a = new kh9();
    public static final rfd b = j8.h("kotlinx.serialization.json.JsonLiteral", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9VarH = yb5.h(decoder);
        JsonElement jsonElementN = zg9VarH.n();
        if (jsonElementN instanceof jh9) {
            return (jh9) jsonElementN;
        }
        throw new JsonDecodingException(j8.L(sq6.t(jce.a, jsonElementN.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, -1, null, zg9VarH.d().a.k ? j8.V(-1, jsonElementN.toString()).toString() : null));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        jh9 jh9Var = (jh9) obj;
        encoder.getClass();
        jh9Var.getClass();
        String str = jh9Var.G;
        yb5.i(encoder);
        if (jh9Var.E) {
            encoder.F(str);
            return;
        }
        SerialDescriptor serialDescriptor = jh9Var.F;
        if (serialDescriptor != null) {
            encoder.x(serialDescriptor).F(str);
            return;
        }
        Long lT0 = isg.t0(str);
        if (lT0 != null) {
            encoder.A(lT0.longValue());
            return;
        }
        qci qciVarG0 = wd6.G0(10, str);
        if (qciVarG0 != null) {
            encoder.x(uci.b).A(qciVarG0.E);
            return;
        }
        Double dA0 = hsg.a0(str);
        if (dA0 != null) {
            encoder.f(dA0.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            encoder.j(bool.booleanValue());
        } else {
            encoder.F(str);
        }
    }
}
