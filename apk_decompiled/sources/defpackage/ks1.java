package defpackage;

import com.anthropic.claude.api.tasks.BlockingToolDetail;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ks1 implements w28 {
    public static final ks1 a;
    private static final SerialDescriptor descriptor;

    static {
        ks1 ks1Var = new ks1();
        a = ks1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.BlockingToolDetail", ks1Var, 4);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("input", true);
        pluginGeneratedSerialDescriptor.j("output", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        KSerializer kSerializerS = d4c.S(uh9Var);
        KSerializer kSerializerS2 = d4c.S(uh9Var);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
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
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 3, uh9.a, jsonObject2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BlockingToolDetail(i, strV, strV2, jsonObject, jsonObject2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BlockingToolDetail blockingToolDetail = (BlockingToolDetail) obj;
        encoder.getClass();
        blockingToolDetail.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BlockingToolDetail.write$Self$api(blockingToolDetail, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
