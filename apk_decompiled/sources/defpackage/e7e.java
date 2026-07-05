package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0InputStepsItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7e implements w28 {
    public static final e7e a;
    private static final SerialDescriptor descriptor;

    static {
        e7e e7eVar = new e7e();
        a = e7eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RecipeDisplayV0InputStepsItem", e7eVar, 4);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("timer_seconds", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(e79.a), d4c.S(srgVar)};
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
        Integer num = null;
        String str = null;
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
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RecipeDisplayV0InputStepsItem(i, strV, strV2, num, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem = (RecipeDisplayV0InputStepsItem) obj;
        encoder.getClass();
        recipeDisplayV0InputStepsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RecipeDisplayV0InputStepsItem.write$Self$Claude_tool_model(recipeDisplayV0InputStepsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
