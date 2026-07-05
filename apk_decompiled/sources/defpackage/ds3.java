package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageAction;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageActionClicked;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageRole;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ds3 implements w28 {
    public static final ds3 a;
    private static final SerialDescriptor descriptor;

    static {
        ds3 ds3Var = new ds3();
        a = ds3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.message_action.clicked", ds3Var, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        qy1.z(pluginGeneratedSerialDescriptor, "action", false, "message_role", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$CodeMessageActionClicked.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$CodeMessageActionClicked.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        CodeEvents$CodeMessageAction codeEvents$CodeMessageAction = null;
        CodeEvents$CodeMessageRole codeEvents$CodeMessageRole = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                codeEvents$CodeMessageAction = (CodeEvents$CodeMessageAction) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), codeEvents$CodeMessageAction);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$CodeMessageRole = (CodeEvents$CodeMessageRole) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), codeEvents$CodeMessageRole);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$CodeMessageActionClicked(i, strV, strV2, strV3, codeEvents$CodeMessageAction, codeEvents$CodeMessageRole, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$CodeMessageActionClicked codeEvents$CodeMessageActionClicked = (CodeEvents$CodeMessageActionClicked) obj;
        encoder.getClass();
        codeEvents$CodeMessageActionClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$CodeMessageActionClicked.write$Self$analytics(codeEvents$CodeMessageActionClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
