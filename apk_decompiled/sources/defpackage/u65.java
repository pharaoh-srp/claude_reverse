package defpackage;

import com.anthropic.claude.api.wiggle.CreateFileParams;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u65 implements w28 {
    public static final u65 a;
    private static final SerialDescriptor descriptor;

    static {
        u65 u65Var = new u65();
        a = u65Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.wiggle.CreateFileParams", u65Var, 5);
        pluginGeneratedSerialDescriptor.j("filesystem_id", false);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("media_type", false);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        pluginGeneratedSerialDescriptor.j("overwrite_existing", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CreateFileParams.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CreateFileParams.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        Map map = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                map = (Map) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateFileParams(i, strV, strV2, strV3, map, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateFileParams createFileParams = (CreateFileParams) obj;
        encoder.getClass();
        createFileParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateFileParams.write$Self$api(createFileParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
