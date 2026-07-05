package defpackage;

import com.anthropic.claude.api.model.ModelCapabilities;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nnb implements w28 {
    public static final nnb a;
    private static final SerialDescriptor descriptor;

    static {
        nnb nnbVar = new nnb();
        a = nnbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelCapabilities", nnbVar, 4);
        pluginGeneratedSerialDescriptor.j("mm_pdf", true);
        pluginGeneratedSerialDescriptor.j("mm_images", true);
        pluginGeneratedSerialDescriptor.j("web_search", true);
        pluginGeneratedSerialDescriptor.j("compass", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else if (iX == 1) {
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool2);
                i |= 2;
            } else if (iX == 2) {
                bool3 = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool4 = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool4);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelCapabilities(i, bool, bool2, bool3, bool4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelCapabilities modelCapabilities = (ModelCapabilities) obj;
        encoder.getClass();
        modelCapabilities.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelCapabilities.write$Self$api(modelCapabilities, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
