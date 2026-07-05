package defpackage;

import com.anthropic.claude.api.project.ProjectUpdateParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yod implements w28 {
    public static final yod a;
    private static final SerialDescriptor descriptor;

    static {
        yod yodVar = new yod();
        a = yodVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.ProjectUpdateParams", yodVar, 6);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("is_private", true);
        pluginGeneratedSerialDescriptor.j("is_starred", true);
        pluginGeneratedSerialDescriptor.j("is_archived", true);
        pluginGeneratedSerialDescriptor.j("prompt_template", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(srgVar)};
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
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool3);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectUpdateParams(i, str, str2, bool, bool2, bool3, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectUpdateParams projectUpdateParams = (ProjectUpdateParams) obj;
        encoder.getClass();
        projectUpdateParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectUpdateParams.write$Self$api(projectUpdateParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
