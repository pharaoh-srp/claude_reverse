package defpackage;

import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class krf implements w28 {
    public static final krf a;
    private static final SerialDescriptor descriptor;

    static {
        krf krfVar = new krf();
        a = krfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionExternalMetadata", krfVar, 7);
        pluginGeneratedSerialDescriptor.j("pending_action", true);
        pluginGeneratedSerialDescriptor.j("current_branches", true);
        pluginGeneratedSerialDescriptor.j("post_turn_summary", true);
        pluginGeneratedSerialDescriptor.j("task_summary", true);
        pluginGeneratedSerialDescriptor.j("slack_permalink", true);
        pluginGeneratedSerialDescriptor.j("slack_channel_name", true);
        pluginGeneratedSerialDescriptor.j("slack_channel_is_private", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionExternalMetadata.$childSerializers;
        KSerializer kSerializerS = d4c.S(qke.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(bad.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionExternalMetadata.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        RequiresActionDetails requiresActionDetails = null;
        Map map = null;
        PostTurnSummary postTurnSummary = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    requiresActionDetails = (RequiresActionDetails) ud4VarC.m(serialDescriptor, 0, qke.a, requiresActionDetails);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    postTurnSummary = (PostTurnSummary) ud4VarC.m(serialDescriptor, 2, bad.a, postTurnSummary);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 6, zt1.a, bool);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SessionExternalMetadata(i, requiresActionDetails, map, postTurnSummary, str, str2, str3, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionExternalMetadata sessionExternalMetadata = (SessionExternalMetadata) obj;
        encoder.getClass();
        sessionExternalMetadata.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionExternalMetadata.write$Self$sessions(sessionExternalMetadata, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
