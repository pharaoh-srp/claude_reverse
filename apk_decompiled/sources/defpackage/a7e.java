package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItem;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItemUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a7e implements w28 {
    public static final a7e a;
    private static final SerialDescriptor descriptor;

    static {
        a7e a7eVar = new a7e();
        a = a7eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItem", a7eVar, 4);
        pluginGeneratedSerialDescriptor.j("amount", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("unit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(na6.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(srgVar), d4c.S(d7e.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        String str2 = null;
        RecipeDisplayV0InputIngredientsItemUnit recipeDisplayV0InputIngredientsItemUnit = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                d = (Double) ud4VarC.m(serialDescriptor, 0, na6.a, d);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                recipeDisplayV0InputIngredientsItemUnit = (RecipeDisplayV0InputIngredientsItemUnit) ud4VarC.m(serialDescriptor, 3, d7e.d, recipeDisplayV0InputIngredientsItemUnit);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RecipeDisplayV0InputIngredientsItem(i, d, str, str2, recipeDisplayV0InputIngredientsItemUnit, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RecipeDisplayV0InputIngredientsItem recipeDisplayV0InputIngredientsItem = (RecipeDisplayV0InputIngredientsItem) obj;
        encoder.getClass();
        recipeDisplayV0InputIngredientsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RecipeDisplayV0InputIngredientsItem.write$Self$Claude_tool_model(recipeDisplayV0InputIngredientsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
