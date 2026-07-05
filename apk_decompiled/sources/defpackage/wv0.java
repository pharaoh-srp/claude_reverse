package defpackage;

import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItemType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements w28 {
    public static final wv0 a;
    private static final SerialDescriptor descriptor;

    static {
        wv0 wv0Var = new wv0();
        a = wv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem", wv0Var, 3);
        pluginGeneratedSerialDescriptor.j("options", false);
        pluginGeneratedSerialDescriptor.j("question", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AskUserInputV0InputQuestionsItem.$childSerializers[0].getValue(), srg.a, d4c.S(zv0.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AskUserInputV0InputQuestionsItem.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String strV = null;
        AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                askUserInputV0InputQuestionsItemType = (AskUserInputV0InputQuestionsItemType) ud4VarC.m(serialDescriptor, 2, zv0.d, askUserInputV0InputQuestionsItemType);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AskUserInputV0InputQuestionsItem(i, list, strV, askUserInputV0InputQuestionsItemType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem = (AskUserInputV0InputQuestionsItem) obj;
        encoder.getClass();
        askUserInputV0InputQuestionsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AskUserInputV0InputQuestionsItem.write$Self$Claude_tool_model(askUserInputV0InputQuestionsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
