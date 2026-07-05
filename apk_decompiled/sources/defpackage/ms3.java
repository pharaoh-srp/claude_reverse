package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcome;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ms3 implements w28 {
    public static final ms3 a;
    private static final SerialDescriptor descriptor;

    static {
        ms3 ms3Var = new ms3();
        a = ms3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.prompt_suggestion.outcome", ms3Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        qy1.z(pluginGeneratedSerialDescriptor, "outcome", false, "time_to_outcome_ms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$CodePromptSuggestionOutcome.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$CodePromptSuggestionOutcome.$childSerializers;
        int i = 0;
        String strV = null;
        String strV2 = null;
        CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType = null;
        long j = 0;
        boolean z = true;
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
                codeEvents$CodePromptSuggestionOutcomeType = (CodeEvents$CodePromptSuggestionOutcomeType) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), codeEvents$CodePromptSuggestionOutcomeType);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$CodePromptSuggestionOutcome(i, strV, strV2, codeEvents$CodePromptSuggestionOutcomeType, j, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$CodePromptSuggestionOutcome codeEvents$CodePromptSuggestionOutcome = (CodeEvents$CodePromptSuggestionOutcome) obj;
        encoder.getClass();
        codeEvents$CodePromptSuggestionOutcome.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$CodePromptSuggestionOutcome.write$Self$analytics(codeEvents$CodePromptSuggestionOutcome, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
