package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$UserDialogAutoCancelReason;
import com.anthropic.claude.analytics.events.CodeEvents$UserDialogAutoCancelled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hx3 implements w28 {
    public static final hx3 a;
    private static final SerialDescriptor descriptor;

    static {
        hx3 hx3Var = new hx3();
        a = hx3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.user_dialog.auto_cancelled", hx3Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        qy1.z(pluginGeneratedSerialDescriptor, "dialog_kind", false, "reason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$UserDialogAutoCancelled.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$UserDialogAutoCancelled.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        CodeEvents$UserDialogAutoCancelReason codeEvents$UserDialogAutoCancelReason = null;
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
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$UserDialogAutoCancelReason = (CodeEvents$UserDialogAutoCancelReason) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), codeEvents$UserDialogAutoCancelReason);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$UserDialogAutoCancelled(i, strV, strV2, strV3, codeEvents$UserDialogAutoCancelReason, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$UserDialogAutoCancelled codeEvents$UserDialogAutoCancelled = (CodeEvents$UserDialogAutoCancelled) obj;
        encoder.getClass();
        codeEvents$UserDialogAutoCancelled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$UserDialogAutoCancelled.write$Self$analytics(codeEvents$UserDialogAutoCancelled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
