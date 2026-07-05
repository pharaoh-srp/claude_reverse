package defpackage;

import com.anthropic.claude.tool.model.RecipeDisplayV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6e implements w28 {
    public static final y6e a;
    private static final SerialDescriptor descriptor;

    static {
        y6e y6eVar = new y6e();
        a = y6eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RecipeDisplayV0Input", y6eVar, 9);
        pluginGeneratedSerialDescriptor.j("base_servings", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("image_page_url", true);
        pluginGeneratedSerialDescriptor.j("image_source", true);
        pluginGeneratedSerialDescriptor.j("image_url", true);
        pluginGeneratedSerialDescriptor.j("ingredients", true);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = RecipeDisplayV0Input.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(e79.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[5].getValue()), d4c.S(srgVar), kw9VarArr[7].getValue(), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RecipeDisplayV0Input.$childSerializers;
        Object obj = null;
        boolean z = true;
        List list = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list2 = null;
        String str5 = null;
        String strV = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new RecipeDisplayV0Input(i, num, str, str2, str3, str4, list2, str5, list, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RecipeDisplayV0Input recipeDisplayV0Input = (RecipeDisplayV0Input) obj;
        encoder.getClass();
        recipeDisplayV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RecipeDisplayV0Input.write$Self$Claude_tool_model(recipeDisplayV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
