package defpackage;

import com.anthropic.claude.models.organization.configtypes.ModelFallback;
import com.anthropic.claude.types.strings.ModelId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pnb implements w28 {
    public static final pnb a;
    private static final SerialDescriptor descriptor;

    static {
        pnb pnbVar = new pnb();
        a = pnbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ModelFallback", pnbVar, 2);
        pluginGeneratedSerialDescriptor.j("fallbackModelName", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vnb.a, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1064unboximpl = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelFallback(i, strM1064unboximpl, strV, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelFallback modelFallback = (ModelFallback) obj;
        encoder.getClass();
        modelFallback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelFallback.write$Self$models(modelFallback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
