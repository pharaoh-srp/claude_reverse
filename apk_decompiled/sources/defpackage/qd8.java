package defpackage;

import com.anthropic.claude.api.account.GrowthBookRule;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd8 implements w28 {
    public static final qd8 a;
    private static final SerialDescriptor descriptor;

    static {
        qd8 qd8Var = new qd8();
        a = qd8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.GrowthBookRule", qd8Var, 3);
        pluginGeneratedSerialDescriptor.j("force", true);
        pluginGeneratedSerialDescriptor.j("tracks", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(eh9.a), d4c.S((KSerializer) GrowthBookRule.$childSerializers[1].getValue()), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GrowthBookRule.$childSerializers;
        boolean z = true;
        int i = 0;
        JsonElement jsonElement = null;
        List list = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 0, eh9.a, jsonElement);
                i |= 1;
            } else if (iX == 1) {
                list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookRule(i, jsonElement, list, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookRule growthBookRule = (GrowthBookRule) obj;
        encoder.getClass();
        growthBookRule.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookRule.write$Self$api(growthBookRule, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
