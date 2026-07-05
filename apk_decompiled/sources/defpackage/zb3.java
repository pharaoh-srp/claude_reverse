package defpackage;

import com.anthropic.claude.api.share.ChatSnapshot;
import com.anthropic.claude.api.share.ProjectCreator;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zb3 implements w28 {
    public static final zb3 a;
    private static final SerialDescriptor descriptor;

    static {
        zb3 zb3Var = new zb3();
        a = zb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.share.ChatSnapshot", zb3Var, 8);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("snapshot_name", false);
        pluginGeneratedSerialDescriptor.j("is_public", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", true);
        pluginGeneratedSerialDescriptor.j("creator", false);
        pluginGeneratedSerialDescriptor.j("chat_messages", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatSnapshot.$childSerializers;
        KSerializer kSerializerS = d4c.S(emd.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[7].getValue());
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{bc3.a, srg.a, zt1.a, bc9Var, bc9Var, kSerializerS, qkd.a, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatSnapshot.$childSerializers;
        Object obj = null;
        boolean z = true;
        List list = null;
        String strM991unboximpl = null;
        String strV = null;
        Date date = null;
        Date date2 = null;
        String strM1085unboximpl = null;
        ProjectCreator projectCreator = null;
        int i = 0;
        boolean zU = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ChatSnapshotId chatSnapshotId = (ChatSnapshotId) ud4VarC.l(serialDescriptor, 0, bc3.a, strM991unboximpl != null ? ChatSnapshotId.m985boximpl(strM991unboximpl) : null);
                    i |= 1;
                    strM991unboximpl = chatSnapshotId != null ? chatSnapshotId.m991unboximpl() : null;
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
                    date = (Date) ud4VarC.l(serialDescriptor, 3, bc9.a, date);
                    i |= 8;
                    break;
                case 4:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 4, bc9.a, date2);
                    i |= 16;
                    break;
                case 5:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 5, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    projectCreator = (ProjectCreator) ud4VarC.l(serialDescriptor, 6, qkd.a, projectCreator);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSnapshot(i, strM991unboximpl, strV, zU, date, date2, strM1085unboximpl, projectCreator, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSnapshot chatSnapshot = (ChatSnapshot) obj;
        encoder.getClass();
        chatSnapshot.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSnapshot.write$Self$api(chatSnapshot, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
