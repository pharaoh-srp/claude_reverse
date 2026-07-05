package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotSummary;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hc3 implements w28 {
    public static final hc3 a;
    private static final SerialDescriptor descriptor;

    static {
        hc3 hc3Var = new hc3();
        a = hc3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.share.ChatSnapshotSummary", hc3Var, 6);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("snapshot_name", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", true);
        pluginGeneratedSerialDescriptor.j("last_message_index", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(emd.a);
        KSerializer kSerializerS2 = d4c.S(e79.a);
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{bc3.a, srg.a, bc9Var, bc9Var, kSerializerS, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM991unboximpl = null;
        String strV = null;
        Date date = null;
        Date date2 = null;
        String strM1085unboximpl = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ChatSnapshotId chatSnapshotId = (ChatSnapshotId) ud4VarC.l(serialDescriptor, 0, bc3.a, strM991unboximpl != null ? ChatSnapshotId.m985boximpl(strM991unboximpl) : null);
                    strM991unboximpl = chatSnapshotId != null ? chatSnapshotId.m991unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    date = (Date) ud4VarC.l(serialDescriptor, 2, bc9.a, date);
                    i |= 4;
                    break;
                case 3:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 3, bc9.a, date2);
                    i |= 8;
                    break;
                case 4:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 4, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSnapshotSummary(i, strM991unboximpl, strV, date, date2, strM1085unboximpl, num, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSnapshotSummary chatSnapshotSummary = (ChatSnapshotSummary) obj;
        encoder.getClass();
        chatSnapshotSummary.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSnapshotSummary.write$Self$api(chatSnapshotSummary, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
