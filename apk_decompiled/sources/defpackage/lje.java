package defpackage;

import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lje implements w28 {
    public static final lje a;
    private static final SerialDescriptor descriptor;

    static {
        lje ljeVar = new lje();
        a = ljeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RequestFormInputFromUserInput", ljeVar, 3);
        pluginGeneratedSerialDescriptor.j("domain", true);
        pluginGeneratedSerialDescriptor.j("expires_at", true);
        pluginGeneratedSerialDescriptor.j("fields", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), d4c.S(ay6.a), RequestFormInputFromUserInput.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RequestFormInputFromUserInput.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        OffsetDateTime offsetDateTime = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 1, ay6.a, offsetDateTime);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RequestFormInputFromUserInput(i, str, offsetDateTime, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RequestFormInputFromUserInput requestFormInputFromUserInput = (RequestFormInputFromUserInput) obj;
        encoder.getClass();
        requestFormInputFromUserInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RequestFormInputFromUserInput.write$Self$Claude_tool_model(requestFormInputFromUserInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
