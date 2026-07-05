package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectChatStarterClicked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cpd implements w28 {
    public static final cpd a;
    private static final SerialDescriptor descriptor;

    static {
        cpd cpdVar = new cpd();
        a = cpdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_project_chat_starter_clicked", cpdVar, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("chat_starter_id", false);
        pluginGeneratedSerialDescriptor.j("project_type", true);
        pluginGeneratedSerialDescriptor.j("project_subtype", true);
        pluginGeneratedSerialDescriptor.k(new xmb(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
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
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectsEvents$ProjectChatStarterClicked(i, strV, strV2, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectsEvents$ProjectChatStarterClicked projectsEvents$ProjectChatStarterClicked = (ProjectsEvents$ProjectChatStarterClicked) obj;
        encoder.getClass();
        projectsEvents$ProjectChatStarterClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectsEvents$ProjectChatStarterClicked.write$Self$analytics(projectsEvents$ProjectChatStarterClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
