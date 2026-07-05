package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionAction;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePromptAction;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cmb implements w28 {
    public static final cmb a;
    private static final SerialDescriptor descriptor;

    static {
        cmb cmbVar = new cmb();
        a = cmbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_use_prompt_action", cmbVar, 3);
        pluginGeneratedSerialDescriptor.j("tool_category", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("tool_name", true);
        pluginGeneratedSerialDescriptor.k(new pi(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePromptAction.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePromptAction.$childSerializers;
        boolean z = true;
        int i = 0;
        MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory = null;
        MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                mobileAppUseEvents$MobileAppUsePermissionCategory = (MobileAppUseEvents$MobileAppUsePermissionCategory) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), mobileAppUseEvents$MobileAppUsePermissionCategory);
                i |= 1;
            } else if (iX == 1) {
                mobileAppUseEvents$MobileAppUsePermissionAction = (MobileAppUseEvents$MobileAppUsePermissionAction) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), mobileAppUseEvents$MobileAppUsePermissionAction);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppUseEvents$MobileAppUsePromptAction(i, mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionAction, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseEvents$MobileAppUsePromptAction mobileAppUseEvents$MobileAppUsePromptAction = (MobileAppUseEvents$MobileAppUsePromptAction) obj;
        encoder.getClass();
        mobileAppUseEvents$MobileAppUsePromptAction.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseEvents$MobileAppUsePromptAction.write$Self$analytics(mobileAppUseEvents$MobileAppUsePromptAction, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
