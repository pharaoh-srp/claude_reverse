package defpackage;

import com.anthropic.claude.sessions.types.SdkPromptSuggestionEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sbf implements w28 {
    public static final sbf a;
    private static final SerialDescriptor descriptor;

    static {
        sbf sbfVar = new sbf();
        a = sbfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkPromptSuggestionEvent", sbfVar, 5);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("suggestion", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else if (iX == 3) {
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkPromptSuggestionEvent(i, strV, strV2, str, str2, str3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkPromptSuggestionEvent sdkPromptSuggestionEvent = (SdkPromptSuggestionEvent) obj;
        encoder.getClass();
        sdkPromptSuggestionEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkPromptSuggestionEvent.write$Self$sessions(sdkPromptSuggestionEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
