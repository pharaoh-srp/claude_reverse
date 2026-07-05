package defpackage;

import com.anthropic.claude.api.chat.FillSensitiveTextRequest;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uk7 implements w28 {
    public static final uk7 a;
    private static final SerialDescriptor descriptor;

    static {
        uk7 uk7Var = new uk7();
        a = uk7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.FillSensitiveTextRequest", uk7Var, 2);
        pluginGeneratedSerialDescriptor.j("domain", false);
        pluginGeneratedSerialDescriptor.j("fields", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), FillSensitiveTextRequest.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = FillSensitiveTextRequest.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FillSensitiveTextRequest(i, str, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FillSensitiveTextRequest fillSensitiveTextRequest = (FillSensitiveTextRequest) obj;
        encoder.getClass();
        fillSensitiveTextRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FillSensitiveTextRequest.write$Self$api(fillSensitiveTextRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
