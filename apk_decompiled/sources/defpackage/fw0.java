package defpackage;

import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements w28 {
    public static final fw0 a;
    private static final SerialDescriptor descriptor;

    static {
        fw0 fw0Var = new fw0();
        a = fw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.AskUserQuestionInput", fw0Var, 2);
        pluginGeneratedSerialDescriptor.j("questions", false);
        pluginGeneratedSerialDescriptor.j("answers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AskUserQuestionInput.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AskUserQuestionInput.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AskUserQuestionInput(i, list, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AskUserQuestionInput askUserQuestionInput = (AskUserQuestionInput) obj;
        encoder.getClass();
        askUserQuestionInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AskUserQuestionInput.write$Self$sessions(askUserQuestionInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
