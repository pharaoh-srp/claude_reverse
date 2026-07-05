package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$CompactionCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jo2 implements w28 {
    public static final jo2 a;
    private static final SerialDescriptor descriptor;

    static {
        jo2 jo2Var = new jo2();
        a = jo2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_compaction_completed", jo2Var, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        qy1.u(pluginGeneratedSerialDescriptor, "duration_ms", true, "failure_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$CompactionCompleted.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), d4c.S(xka.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$CompactionCompleted.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ChatEvents$CompactionOutcome chatEvents$CompactionOutcome = null;
        Long l = null;
        String str = null;
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
                chatEvents$CompactionOutcome = (ChatEvents$CompactionOutcome) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$CompactionOutcome);
                i |= 4;
            } else if (iX == 3) {
                l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$CompactionCompleted(i, strV, strV2, chatEvents$CompactionOutcome, l, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$CompactionCompleted chatEvents$CompactionCompleted = (ChatEvents$CompactionCompleted) obj;
        encoder.getClass();
        chatEvents$CompactionCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$CompactionCompleted.write$Self$analytics(chatEvents$CompactionCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
