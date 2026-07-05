package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotReportCategory;
import com.anthropic.claude.api.share.ChatSnapshotReportRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fc3 implements w28 {
    public static final fc3 a;
    private static final SerialDescriptor descriptor;

    static {
        fc3 fc3Var = new fc3();
        a = fc3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.share.ChatSnapshotReportRequest", fc3Var, 5);
        pluginGeneratedSerialDescriptor.j("category", false);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("reporter_email", true);
        pluginGeneratedSerialDescriptor.j("reporter_name", true);
        pluginGeneratedSerialDescriptor.j("opt_out_of_training", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{ec3.d, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ChatSnapshotReportCategory chatSnapshotReportCategory = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatSnapshotReportCategory = (ChatSnapshotReportCategory) ud4VarC.l(serialDescriptor, 0, ec3.d, chatSnapshotReportCategory);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else if (iX == 3) {
                str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSnapshotReportRequest(i, chatSnapshotReportCategory, str, str2, str3, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSnapshotReportRequest chatSnapshotReportRequest = (ChatSnapshotReportRequest) obj;
        encoder.getClass();
        chatSnapshotReportRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSnapshotReportRequest.write$Self$api(chatSnapshotReportRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
