package defpackage;

import com.anthropic.claude.api.account.GrowthBookFeature;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc8 implements w28 {
    public static final lc8 a;
    private static final SerialDescriptor descriptor;

    static {
        lc8 lc8Var = new lc8();
        a = lc8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.GrowthBookFeature", lc8Var, 2);
        pluginGeneratedSerialDescriptor.j("defaultValue", false);
        pluginGeneratedSerialDescriptor.j("rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{eh9.a, d4c.S((KSerializer) GrowthBookFeature.$childSerializers[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GrowthBookFeature.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        JsonElement jsonElement = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonElement = (JsonElement) ud4VarC.l(serialDescriptor, 0, eh9.a, jsonElement);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookFeature(i, jsonElement, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookFeature growthBookFeature = (GrowthBookFeature) obj;
        encoder.getClass();
        growthBookFeature.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookFeature.write$Self$api(growthBookFeature, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
