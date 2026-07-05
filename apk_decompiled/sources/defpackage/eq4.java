package defpackage;

import com.anthropic.claude.sessions.types.ControlResponsePayload;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eq4 implements w28 {
    public static final eq4 a;
    private static final SerialDescriptor descriptor;

    static {
        eq4 eq4Var = new eq4();
        a = eq4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ControlResponsePayload", eq4Var, 7);
        pluginGeneratedSerialDescriptor.j("behavior", true);
        pluginGeneratedSerialDescriptor.j("toolUseID", true);
        pluginGeneratedSerialDescriptor.j("updatedInput", true);
        pluginGeneratedSerialDescriptor.j("updatedPermissions", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ControlResponsePayload.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ControlResponsePayload.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Map map = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        Map map2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
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
                case 6:
                    map2 = (Map) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), map2);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ControlResponsePayload(i, str, str2, map, list, str3, str4, map2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ControlResponsePayload controlResponsePayload = (ControlResponsePayload) obj;
        encoder.getClass();
        controlResponsePayload.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ControlResponsePayload.write$Self$sessions(controlResponsePayload, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
