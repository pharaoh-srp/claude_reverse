package defpackage;

import com.anthropic.claude.code.ui.PendingAskUserQuestionSelections;
import com.anthropic.claude.code.ui.SessionInputData;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jsf implements w28 {
    public static final jsf a;
    private static final SerialDescriptor descriptor;

    static {
        jsf jsfVar = new jsf();
        a = jsfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.ui.SessionInputData", jsfVar, 6);
        pluginGeneratedSerialDescriptor.j("sessionId", false);
        pluginGeneratedSerialDescriptor.j("inputText", true);
        pluginGeneratedSerialDescriptor.j("comments", true);
        pluginGeneratedSerialDescriptor.j("pendingAskUserQuestionSelections", true);
        pluginGeneratedSerialDescriptor.j("submittedAskUserQuestionAnswers", true);
        pluginGeneratedSerialDescriptor.j("lastModified", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SessionInputData.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), d4c.S(bwc.a), kw9VarArr[4].getValue(), xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SessionInputData.$childSerializers;
        int i = 0;
        String strV = null;
        String strV2 = null;
        List list = null;
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = null;
        Map map = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    pendingAskUserQuestionSelections = (PendingAskUserQuestionSelections) ud4VarC.m(serialDescriptor, 3, bwc.a, pendingAskUserQuestionSelections);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    j = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionInputData(i, strV, strV2, list, pendingAskUserQuestionSelections, map, j, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionInputData sessionInputData = (SessionInputData) obj;
        encoder.getClass();
        sessionInputData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionInputData.write$Self$ui(sessionInputData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
