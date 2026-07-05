package defpackage;

import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.SummaryStatusCategory;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bad implements w28 {
    public static final bad a;
    private static final SerialDescriptor descriptor;

    static {
        bad badVar = new bad();
        a = badVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.PostTurnSummary", badVar, 7);
        pluginGeneratedSerialDescriptor.j("status_category", true);
        pluginGeneratedSerialDescriptor.j("status_detail", true);
        pluginGeneratedSerialDescriptor.j("is_noteworthy", true);
        pluginGeneratedSerialDescriptor.j("recent_action", true);
        pluginGeneratedSerialDescriptor.j("needs_action", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("artifact_urls", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PostTurnSummary.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kyg.a, srgVar, zt1.a, srgVar, srgVar, srgVar, kw9VarArr[6].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PostTurnSummary.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        SummaryStatusCategory summaryStatusCategory = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    summaryStatusCategory = (SummaryStatusCategory) ud4VarC.l(serialDescriptor, 0, kyg.a, summaryStatusCategory);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new PostTurnSummary(i, summaryStatusCategory, strV, zU, strV2, strV3, strV4, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PostTurnSummary postTurnSummary = (PostTurnSummary) obj;
        encoder.getClass();
        postTurnSummary.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PostTurnSummary.write$Self$sessions(postTurnSummary, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
