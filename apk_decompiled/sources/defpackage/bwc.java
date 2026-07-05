package defpackage;

import com.anthropic.claude.code.ui.PendingAskUserQuestionSelections;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bwc implements w28 {
    public static final bwc a;
    private static final SerialDescriptor descriptor;

    static {
        bwc bwcVar = new bwc();
        a = bwcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.ui.PendingAskUserQuestionSelections", bwcVar, 4);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("currentQuestionIndex", true);
        pluginGeneratedSerialDescriptor.j("selectedAnswers", true);
        pluginGeneratedSerialDescriptor.j("otherTexts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PendingAskUserQuestionSelections.$childSerializers;
        return new KSerializer[]{srg.a, e79.a, kw9VarArr[2].getValue(), kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PendingAskUserQuestionSelections.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        Map map = null;
        Map map2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                map = (Map) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), map);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                map2 = (Map) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PendingAskUserQuestionSelections(i, strV, iR, map, map2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = (PendingAskUserQuestionSelections) obj;
        encoder.getClass();
        pendingAskUserQuestionSelections.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PendingAskUserQuestionSelections.write$Self$ui(pendingAskUserQuestionSelections, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
