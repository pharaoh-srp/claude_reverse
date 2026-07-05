package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseCalendarFilterChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class glb implements w28 {
    public static final glb a;
    private static final SerialDescriptor descriptor;

    static {
        glb glbVar = new glb();
        a = glbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_use_calendar_filter_changed", glbVar, 4);
        pluginGeneratedSerialDescriptor.j("selected_count", false);
        pluginGeneratedSerialDescriptor.j("total_count", false);
        pluginGeneratedSerialDescriptor.j("all_selected", false);
        pluginGeneratedSerialDescriptor.j("change_source", false);
        pluginGeneratedSerialDescriptor.k(new pi(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUseCalendarFilterChanged.$childSerializers;
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, zt1.a, kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppUseEvents$MobileAppUseCalendarFilterChanged.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean zU = false;
        MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                mobileAppUseEvents$MobileAppUsePermissionChangedSource = (MobileAppUseEvents$MobileAppUsePermissionChangedSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), mobileAppUseEvents$MobileAppUsePermissionChangedSource);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppUseEvents$MobileAppUseCalendarFilterChanged(i, iR, iR2, zU, mobileAppUseEvents$MobileAppUsePermissionChangedSource, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseEvents$MobileAppUseCalendarFilterChanged mobileAppUseEvents$MobileAppUseCalendarFilterChanged = (MobileAppUseEvents$MobileAppUseCalendarFilterChanged) obj;
        encoder.getClass();
        mobileAppUseEvents$MobileAppUseCalendarFilterChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseEvents$MobileAppUseCalendarFilterChanged.write$Self$analytics(mobileAppUseEvents$MobileAppUseCalendarFilterChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
