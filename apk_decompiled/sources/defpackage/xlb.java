package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionState;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xlb implements w28 {
    public static final xlb a;
    private static final SerialDescriptor descriptor;

    static {
        xlb xlbVar = new xlb();
        a = xlbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_use_permission_changed", xlbVar, 6);
        pluginGeneratedSerialDescriptor.j("tool_category", false);
        pluginGeneratedSerialDescriptor.j("previous_state", false);
        pluginGeneratedSerialDescriptor.j("new_state", false);
        pluginGeneratedSerialDescriptor.j("change_source", false);
        pluginGeneratedSerialDescriptor.j("tool_name", true);
        pluginGeneratedSerialDescriptor.j("permission_type", false);
        pluginGeneratedSerialDescriptor.k(new pi(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePermissionChanged.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), kw9VarArr[2].getValue(), kw9VarArr[3].getValue(), d4c.S(srg.a), kw9VarArr[5].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUsePermissionChanged.$childSerializers;
        boolean z = true;
        int i = 0;
        MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory = null;
        MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState = null;
        MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2 = null;
        MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource = null;
        String str = null;
        MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    mobileAppUseEvents$MobileAppUsePermissionCategory = (MobileAppUseEvents$MobileAppUsePermissionCategory) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), mobileAppUseEvents$MobileAppUsePermissionCategory);
                    i |= 1;
                    break;
                case 1:
                    mobileAppUseEvents$MobileAppUsePermissionState = (MobileAppUseEvents$MobileAppUsePermissionState) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), mobileAppUseEvents$MobileAppUsePermissionState);
                    i |= 2;
                    break;
                case 2:
                    mobileAppUseEvents$MobileAppUsePermissionState2 = (MobileAppUseEvents$MobileAppUsePermissionState) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), mobileAppUseEvents$MobileAppUsePermissionState2);
                    i |= 4;
                    break;
                case 3:
                    mobileAppUseEvents$MobileAppUsePermissionChangedSource = (MobileAppUseEvents$MobileAppUsePermissionChangedSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), mobileAppUseEvents$MobileAppUsePermissionChangedSource);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    mobileAppUseEvents$MobileAppUsePermissionType = (MobileAppUseEvents$MobileAppUsePermissionType) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), mobileAppUseEvents$MobileAppUsePermissionType);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppUseEvents$MobileAppUsePermissionChanged(i, mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionState, mobileAppUseEvents$MobileAppUsePermissionState2, mobileAppUseEvents$MobileAppUsePermissionChangedSource, str, mobileAppUseEvents$MobileAppUsePermissionType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseEvents$MobileAppUsePermissionChanged mobileAppUseEvents$MobileAppUsePermissionChanged = (MobileAppUseEvents$MobileAppUsePermissionChanged) obj;
        encoder.getClass();
        mobileAppUseEvents$MobileAppUsePermissionChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseEvents$MobileAppUsePermissionChanged.write$Self$analytics(mobileAppUseEvents$MobileAppUsePermissionChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
