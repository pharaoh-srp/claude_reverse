package defpackage;

import com.anthropic.claude.sessions.types.GetShareStatusResponse;
import com.anthropic.claude.sessions.types.ResolvedSharingSettings;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j48 implements w28 {
    public static final j48 a;
    private static final SerialDescriptor descriptor;

    static {
        j48 j48Var = new j48();
        a = j48Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GetShareStatusResponse", j48Var, 2);
        pluginGeneratedSerialDescriptor.j("shares", false);
        pluginGeneratedSerialDescriptor.j("sharing_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{GetShareStatusResponse.$childSerializers[0].getValue(), d4c.S(hne.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GetShareStatusResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        ResolvedSharingSettings resolvedSharingSettings = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                resolvedSharingSettings = (ResolvedSharingSettings) ud4VarC.m(serialDescriptor, 1, hne.a, resolvedSharingSettings);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GetShareStatusResponse(i, list, resolvedSharingSettings, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetShareStatusResponse getShareStatusResponse = (GetShareStatusResponse) obj;
        encoder.getClass();
        getShareStatusResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GetShareStatusResponse.write$Self$sessions(getShareStatusResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
