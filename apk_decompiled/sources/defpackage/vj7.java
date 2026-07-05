package defpackage;

import com.anthropic.claude.configs.flags.FileUploadConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vj7 implements w28 {
    public static final vj7 a;
    private static final SerialDescriptor descriptor;

    static {
        vj7 vj7Var = new vj7();
        a = vj7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.FileUploadConfig", vj7Var, 3);
        pluginGeneratedSerialDescriptor.j("max_in_context_file_bytes", true);
        pluginGeneratedSerialDescriptor.j("max_inline_paste_bytes", true);
        pluginGeneratedSerialDescriptor.j("max_per_message_upload_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR3 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FileUploadConfig(i, iR, iR2, iR3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FileUploadConfig fileUploadConfig = (FileUploadConfig) obj;
        encoder.getClass();
        fileUploadConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FileUploadConfig.write$Self$configs(fileUploadConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
