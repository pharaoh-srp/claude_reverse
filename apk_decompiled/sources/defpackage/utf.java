package defpackage;

import com.anthropic.claude.sessions.types.SessionExternalMetadataV2;
import com.anthropic.claude.sessions.types.SessionResourceV2;
import com.anthropic.claude.types.strings.SessionId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class utf implements w28 {
    public static final utf a;
    private static final SerialDescriptor descriptor;

    static {
        utf utfVar = new utf();
        a = utfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionResourceV2", utfVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("external_metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fsf.a, d4c.S(mrf.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1120unboximpl = null;
        SessionExternalMetadataV2 sessionExternalMetadataV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                sessionExternalMetadataV2 = (SessionExternalMetadataV2) ud4VarC.m(serialDescriptor, 1, mrf.a, sessionExternalMetadataV2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionResourceV2(i, strM1120unboximpl, sessionExternalMetadataV2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionResourceV2 sessionResourceV2 = (SessionResourceV2) obj;
        encoder.getClass();
        sessionResourceV2.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionResourceV2.write$Self$sessions(sessionResourceV2, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
