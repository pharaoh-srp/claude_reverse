package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SharedSessionData;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2g implements w28 {
    public static final y2g a;
    private static final SerialDescriptor descriptor;

    static {
        y2g y2gVar = new y2g();
        a = y2gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SharedSessionData", y2gVar, 7);
        pluginGeneratedSerialDescriptor.j("data", false);
        pluginGeneratedSerialDescriptor.j("session", false);
        pluginGeneratedSerialDescriptor.j("sharer_display_name", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("has_more", true);
        pluginGeneratedSerialDescriptor.j("first_id", true);
        pluginGeneratedSerialDescriptor.j("last_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{SharedSessionData.$childSerializers[0].getValue(), stf.a, d4c.S(srgVar), d4c.S(srgVar), zt1.a, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SharedSessionData.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        SessionResource sessionResource = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    sessionResource = (SessionResource) ud4VarC.l(serialDescriptor, 1, stf.a, sessionResource);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SharedSessionData(i, list, sessionResource, str, str2, zU, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SharedSessionData sharedSessionData = (SharedSessionData) obj;
        encoder.getClass();
        sharedSessionData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SharedSessionData.write$Self$sessions(sharedSessionData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
