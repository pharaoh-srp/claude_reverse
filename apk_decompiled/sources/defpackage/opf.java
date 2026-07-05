package defpackage;

import com.anthropic.claude.sessions.types.SessionConfigV2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class opf implements w28 {
    public static final opf a;
    private static final SerialDescriptor descriptor;

    static {
        opf opfVar = new opf();
        a = opfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionConfigV2", opfVar, 6);
        pluginGeneratedSerialDescriptor.j("sources", false);
        pluginGeneratedSerialDescriptor.j("cwd", true);
        pluginGeneratedSerialDescriptor.j("outcomes", true);
        pluginGeneratedSerialDescriptor.j("custom_system_prompt", true);
        pluginGeneratedSerialDescriptor.j("append_system_prompt", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionConfigV2.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionConfigV2.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionConfigV2(i, list, str, list2, str2, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionConfigV2 sessionConfigV2 = (SessionConfigV2) obj;
        encoder.getClass();
        sessionConfigV2.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionConfigV2.write$Self$sessions(sessionConfigV2, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
