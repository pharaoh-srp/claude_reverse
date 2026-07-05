package defpackage;

import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jcb implements w28 {
    public static final jcb a;
    private static final SerialDescriptor descriptor;

    static {
        jcb jcbVar = new jcb();
        a = jcbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MemorySynthesisResponse", jcbVar, 3);
        pluginGeneratedSerialDescriptor.j("memory", true);
        pluginGeneratedSerialDescriptor.j("user_instructions", true);
        pluginGeneratedSerialDescriptor.j("updated_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(bc9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Date date = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                date = (Date) ud4VarC.m(serialDescriptor, 2, bc9.a, date);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MemorySynthesisResponse(i, str, str2, date, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) obj;
        encoder.getClass();
        memorySynthesisResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MemorySynthesisResponse.write$Self$api(memorySynthesisResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
