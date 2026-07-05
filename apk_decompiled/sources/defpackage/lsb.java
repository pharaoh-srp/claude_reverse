package defpackage;

import com.anthropic.claude.api.chat.MoveChatsRequest;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lsb implements w28 {
    public static final lsb a;
    private static final SerialDescriptor descriptor;

    static {
        lsb lsbVar = new lsb();
        a = lsbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.MoveChatsRequest", lsbVar, 2);
        pluginGeneratedSerialDescriptor.j("conversation_uuids", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MoveChatsRequest.$childSerializers[0].getValue(), d4c.S(emd.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MoveChatsRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String strM1085unboximpl = null;
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
                ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 1, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MoveChatsRequest(i, list, strM1085unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MoveChatsRequest moveChatsRequest = (MoveChatsRequest) obj;
        encoder.getClass();
        moveChatsRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MoveChatsRequest.write$Self$api(moveChatsRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
