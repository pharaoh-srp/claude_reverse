package defpackage;

import com.anthropic.claude.api.account.GrowthBookSchema;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd8 implements w28 {
    public static final sd8 a;
    private static final SerialDescriptor descriptor;

    static {
        sd8 sd8Var = new sd8();
        a = sd8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.GrowthBookSchema", sd8Var, 3);
        pluginGeneratedSerialDescriptor.j("features", false);
        pluginGeneratedSerialDescriptor.j("hashing_algorithm", true);
        pluginGeneratedSerialDescriptor.j("user", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h3a.a, d4c.S(srg.a), d4c.S(uh9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Map map = null;
        String str = null;
        JsonObject jsonObject = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                map = (Map) ud4VarC.l(serialDescriptor, 0, h3a.a, map);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookSchema(i, map, str, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookSchema growthBookSchema = (GrowthBookSchema) obj;
        encoder.getClass();
        growthBookSchema.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookSchema.write$Self$api(growthBookSchema, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
