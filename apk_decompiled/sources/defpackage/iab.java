package defpackage;

import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.notification.Preferences;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iab implements w28 {
    public static final iab a;
    private static final SerialDescriptor descriptor;

    static {
        iab iabVar = new iab();
        a = iabVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.Membership", iabVar, 5);
        pluginGeneratedSerialDescriptor.j("organization", false);
        pluginGeneratedSerialDescriptor.j("role", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("notification_preferences", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(vbd.a);
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{akc.a, srg.a, bc9Var, bc9Var, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Organization organization = null;
        String strV = null;
        Date date = null;
        Date date2 = null;
        Preferences preferences = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                organization = (Organization) ud4VarC.l(serialDescriptor, 0, akc.a, organization);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                date = (Date) ud4VarC.l(serialDescriptor, 2, bc9.a, date);
                i |= 4;
            } else if (iX == 3) {
                date2 = (Date) ud4VarC.l(serialDescriptor, 3, bc9.a, date2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                preferences = (Preferences) ud4VarC.m(serialDescriptor, 4, vbd.a, preferences);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Membership(i, organization, strV, date, date2, preferences, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Membership membership = (Membership) obj;
        encoder.getClass();
        membership.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Membership.write$Self$api(membership, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
