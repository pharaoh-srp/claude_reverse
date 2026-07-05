package defpackage;

import com.anthropic.claude.sessions.types.SessionConfigViewV2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qpf implements w28 {
    public static final qpf a;
    private static final SerialDescriptor descriptor;

    static {
        qpf qpfVar = new qpf();
        a = qpfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionConfigViewV2", qpfVar, 3);
        pluginGeneratedSerialDescriptor.j("sources", true);
        pluginGeneratedSerialDescriptor.j("outcomes", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionConfigViewV2.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionConfigViewV2.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionConfigViewV2(i, list, list2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionConfigViewV2 sessionConfigViewV2 = (SessionConfigViewV2) obj;
        encoder.getClass();
        sessionConfigViewV2.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionConfigViewV2.write$Self$sessions(sessionConfigViewV2, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
