package defpackage;

import com.anthropic.claude.api.memory.MelangeListResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l9b implements w28 {
    public static final l9b a;
    private static final SerialDescriptor descriptor;

    static {
        l9b l9bVar = new l9b();
        a = l9bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MelangeListResponse", l9bVar, 2);
        pluginGeneratedSerialDescriptor.j("data", false);
        pluginGeneratedSerialDescriptor.j("categories", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MelangeListResponse.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MelangeListResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
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
                list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MelangeListResponse(i, list, list2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MelangeListResponse melangeListResponse = (MelangeListResponse) obj;
        encoder.getClass();
        melangeListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MelangeListResponse.write$Self$api(melangeListResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
