package defpackage;

import com.anthropic.claude.configs.flags.UploadConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kji implements w28 {
    public static final kji a;
    private static final SerialDescriptor descriptor;

    static {
        kji kjiVar = new kji();
        a = kjiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.UploadConfig", kjiVar, 6);
        pluginGeneratedSerialDescriptor.j("max_retries", true);
        pluginGeneratedSerialDescriptor.j("initial_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("delay_multiplier", true);
        pluginGeneratedSerialDescriptor.j("max_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("max_file_size_bytes", true);
        pluginGeneratedSerialDescriptor.j("direct_filestore_max_bytes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{e79.a, xkaVar, na6.a, xkaVar, xkaVar, xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        double dZ = 0.0d;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = ud4VarC.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    dZ = ud4VarC.z(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j2 = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j3 = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j4 = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UploadConfig(i, iR, j, dZ, j2, j3, j4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UploadConfig uploadConfig = (UploadConfig) obj;
        encoder.getClass();
        uploadConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UploadConfig.write$Self$configs(uploadConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
