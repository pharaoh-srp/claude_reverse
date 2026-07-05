package defpackage;

import com.anthropic.claude.sessions.types.ListSessionsResponse;
import com.anthropic.claude.types.strings.SessionId;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class maa implements w28 {
    public static final maa a;
    private static final SerialDescriptor descriptor;

    static {
        maa maaVar = new maa();
        a = maaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ListSessionsResponse", maaVar, 4);
        pluginGeneratedSerialDescriptor.j("data", false);
        pluginGeneratedSerialDescriptor.j("has_more", false);
        pluginGeneratedSerialDescriptor.j("first_id", true);
        pluginGeneratedSerialDescriptor.j("last_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        fsf fsfVar = fsf.a;
        return new KSerializer[]{ListSessionsResponse.$childSerializers[0].getValue(), zt1.a, d4c.S(fsfVar), d4c.S(fsfVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ListSessionsResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        String strM1120unboximpl = null;
        String strM1120unboximpl2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                SessionId sessionId = (SessionId) ud4VarC.m(serialDescriptor, 2, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                SessionId sessionId2 = (SessionId) ud4VarC.m(serialDescriptor, 3, fsf.a, strM1120unboximpl2 != null ? SessionId.m1114boximpl(strM1120unboximpl2) : null);
                strM1120unboximpl2 = sessionId2 != null ? sessionId2.m1120unboximpl() : null;
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ListSessionsResponse(i, list, zU, strM1120unboximpl, strM1120unboximpl2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ListSessionsResponse listSessionsResponse = (ListSessionsResponse) obj;
        encoder.getClass();
        listSessionsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ListSessionsResponse.write$Self$sessions(listSessionsResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
