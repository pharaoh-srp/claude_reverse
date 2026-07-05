package defpackage;

import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o2c implements w28 {
    public static final o2c a;
    private static final SerialDescriptor descriptor;

    static {
        o2c o2cVar = new o2c();
        a = o2cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.remote.NewCodeSessionPrefill", o2cVar, 8);
        pluginGeneratedSerialDescriptor.j("prompt", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("repo", true);
        pluginGeneratedSerialDescriptor.j("branch", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("appendSystemPrompt", true);
        pluginGeneratedSerialDescriptor.j("rawSourceRepoUrl", true);
        pluginGeneratedSerialDescriptor.j("oneTapStart", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str7);
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new NewCodeSessionPrefill(i, str, str2, str3, str4, str5, str6, str7, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NewCodeSessionPrefill newCodeSessionPrefill = (NewCodeSessionPrefill) obj;
        encoder.getClass();
        newCodeSessionPrefill.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        NewCodeSessionPrefill.write$Self$remote(newCodeSessionPrefill, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
