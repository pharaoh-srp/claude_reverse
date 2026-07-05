package defpackage;

import com.anthropic.claude.api.mobile.GetTranslationsResponse;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p48 implements w28 {
    public static final p48 a;
    private static final SerialDescriptor descriptor;

    static {
        p48 p48Var = new p48();
        a = p48Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mobile.GetTranslationsResponse", p48Var, 1);
        pluginGeneratedSerialDescriptor.j("translations", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) GetTranslationsResponse.$childSerializers[0].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GetTranslationsResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GetTranslationsResponse(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetTranslationsResponse getTranslationsResponse = (GetTranslationsResponse) obj;
        encoder.getClass();
        getTranslationsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.B(serialDescriptor, 0, (znf) GetTranslationsResponse.$childSerializers[0].getValue(), getTranslationsResponse.translations);
        vd4VarC.b(serialDescriptor);
    }
}
